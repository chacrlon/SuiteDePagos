package com.suitepagos.backend.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.services.IUserService;
import com.suitepagos.backend.models.services.Ip2pService;
import com.suitepagos.backend.utils.DateTimeSuite;

@RestController
public class UserRestController {

	@Autowired
	private IUserService IUserService;
	
	@Autowired
	private Ip2pService p2pService;
	
	String dateFormateada=DateTimeSuite.dateFormateada;
	
	@GetMapping("/users")
	public ArrayNode index() {
		
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode parameters = mapper.createArrayNode();
		List<Users> lista = IUserService.findAll();
        
		for(Users str : lista)
		{
			ObjectNode Node = mapper.createObjectNode();
			
			Node.put("id",str.getId());
			Node.put("name",str.getName());
			Node.put("surname",str.getSurname());
			Node.put("customerid",str.getCustomerid());
			Node.put("email",str.getEmail());
			Node.put("username",str.getUsername());
			Node.put("profileid",str.getProfileid().getId());
			Node.put("profilename",str.getProfileid().getName());
			Node.put("profiledesc",str.getProfileid().getDescription());
			
			parameters.add(Node);
		}
		
		return parameters;
		//return IUserService.findAll();
	}
	
	@GetMapping("/users/page/{page}")
	public Page<Users> index(@PathVariable Integer page) {
		Pageable pageable = PageRequest.of(page, 4);
		return IUserService.findAll(pageable);
	}
	
	//@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/users/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode Node = mapper.createObjectNode();
		
		Users usuario = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			usuario = IUserService.findById(id);
		} catch(DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		if(usuario == null) {
			response.put("statusCode", HttpStatus.NOT_FOUND.value());
			response.put("message", "El usuario ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		Node.put("id",usuario.getId());
		Node.put("name",usuario.getName());
		Node.put("surname",usuario.getSurname());
		Node.put("customerid",usuario.getCustomerid());
		Node.put("email",usuario.getEmail());
		Node.put("username",usuario.getUsername());
		Node.put("profileid",usuario.getProfileid().getId());
		Node.put("profilename",usuario.getProfileid().getName());
		Node.put("profiledesc",usuario.getProfileid().getDescription());
		
		return new ResponseEntity<>(Node, HttpStatus.OK);
	}
	
	//@Secured("ROLE_P2P")
	@PostMapping("/users")
	public ResponseEntity<?> create(@Valid @RequestBody Users usuario, BindingResult result) {
		
		Users usuarioNew = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("statusCode", HttpStatus.BAD_REQUEST.value());
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		try {
			
			usuario.setCreatedat(dateFormateada);
			
		    usuario.setEnabled(true);
			usuario.setPassword("$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq");
		    
			usuarioNew = IUserService.save(usuario);
		} catch(DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		response.put("statusCode", HttpStatus.CREATED.value());
		response.put("message", "El usuario ha sido creado con éxito!");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	//@Secured("ROLE_ADMIN")
	@PutMapping("/users/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Users usuario, BindingResult result, @PathVariable Long id) {

		Users usuarioActual = IUserService.findById(id);

		Users userUpdated = null;

		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("statusCode", HttpStatus.BAD_REQUEST.value());
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		if (usuarioActual == null) {
			response.put("statusCode", HttpStatus.NOT_FOUND.value());
			response.put("message", "Error: no se pudo editar, el usuario ID: "
					.concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}

		try {
		    /*********** BEGIN control of TIME ***********/
	           SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy ss:mm:HH");
	           long miliseconds = System.currentTimeMillis();
	           Date date = new Date(miliseconds);
	           String ModifiedDataFormateada = formato.format(date);
	           /*********** END control of TIME ***********/
			
			usuario.setCreatedat(usuarioActual.getCreatedat());
			usuario.setModifiedat(ModifiedDataFormateada);
			
			usuario.setEnabled(true);
			usuario.setPassword("$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq");
			
			usuarioActual.setName(usuario.getName());
			usuarioActual.setSurname(usuario.getSurname());
			usuarioActual.setCustomerid(usuario.getCustomerid());
			usuarioActual.setEmail(usuario.getEmail());
			usuarioActual.setUsername(usuario.getUsername());
			usuarioActual.setProfileid(usuario.getProfileid());
			usuarioActual.setPassword(usuario.getPassword());
			usuarioActual.setEnabled(usuario.getEnabled());			

			userUpdated = IUserService.save(usuarioActual);

		} catch (DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al actualizar el usuario en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}

		response.put("statusCode", HttpStatus.CREATED.value());
		response.put("message", "El usuario ha sido actualizado con éxito!");
		//response.put("usuario", userUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	//@Secured("ROLE_ADMIN")
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		
		Map<String, Object> response = new HashMap<>();
		
		P2P p2p = p2pService.findByUserId(id);
		
		if(p2p != null) {
			response.put("statusCode", HttpStatus.CONFLICT.value());
			response.put("message", "No puede ser eliminado. Tiene operaciones enlazadas");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		try {
			IUserService.delete(id);
		} catch (DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al eliminar al usuario de la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		response.put("statusCode", HttpStatus.OK.value());
		response.put("message", "El usuario ha sido eliminado con éxito!");
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/users/profiles")
	public List<Profile> listarPerfiles(){
		return IUserService.findAllProfiles();
	}
	
}
