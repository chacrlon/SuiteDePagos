package com.suitepagos.backend.controllers;

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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.suitepagos.backend.models.entity.Role;
import com.suitepagos.backend.models.services.IRoleService;

@RestController
public class RoleRestController {

	@Autowired
	private IRoleService IRoleService;
	
	@GetMapping("/role")
	public List<Role> index() {
		return IRoleService.findAll();
	}
	
	@GetMapping("/profilerole/{id}")
	public List<Map<String, String>> profileRole(@PathVariable Long id) {
		return IRoleService.findRolePerfil(id);
	}
	
	@GetMapping("/role/page/{page}")
	public Page<Role> index(@PathVariable Integer page) {
		Pageable pageable = PageRequest.of(page, 4);
		return IRoleService.findAll(pageable);
	}
	
	//@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/role/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		
		Role role = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			role = IRoleService.findById(id);
		} catch(DataAccessException e) {
			response.put("message", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(role == null) {
			response.put("message", "El role ID: ".concat(id.toString().concat("No existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Role>(role, HttpStatus.OK);
	}
	
	//@Secured("ROLE_P2P")
	@PostMapping("/role")
	public ResponseEntity<?> create(@Valid @RequestBody Role profile, BindingResult result) {
		
		Role profileNew = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		try {
			profileNew = IRoleService.save(profile);
		} catch(DataAccessException e) {
			response.put("message", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("message", "El role ha sido creado con éxito!");
		response.put("role", profileNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	//@Secured("ROLE_ADMIN")
	@PutMapping("/role/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Role role, BindingResult result, @PathVariable Long id) {

		Role roleActual = IRoleService.findById(id);

		Role roleUpdated = null;

		Map<String, Object> response = new HashMap<>();

		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		if (roleActual == null) {
			response.put("message", "Error: no se pudo editar, el role ID: "
					.concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {
			roleActual.setName(role.getName());

			roleUpdated = IRoleService.save(roleActual);

		} catch (DataAccessException e) {
			response.put("message", "Error al actualizar el role en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("message", "El role ha sido actualizado con éxito!");
		response.put("role", roleUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	//@Secured("ROLE_ADMIN")
	@DeleteMapping("/role/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		
		Map<String, Object> response = new HashMap<>();
		
		try {		
			IRoleService.delete(id);
		} catch (DataAccessException e) {
			response.put("message", "Error al eliminar el role de la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("message", "El role ha sido eliminado con éxito!");
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	
}
