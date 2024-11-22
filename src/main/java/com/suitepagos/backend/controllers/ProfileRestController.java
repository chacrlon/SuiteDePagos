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
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Role;
import com.suitepagos.backend.models.services.IProfileService;
import com.suitepagos.backend.utils.DateTimeSuite;

@RestController
public class ProfileRestController {

	@Autowired
	private IProfileService IProfileService;
	
	String dateFormateada=DateTimeSuite.dateFormateada;
	
	@GetMapping("/profile")
	public List<Profile> index() {
		return IProfileService.findAll();
	}
	
	@GetMapping("/profile/page/{page}")
	public Page<Profile> index(@PathVariable Integer page) {
		Pageable pageable = PageRequest.of(page, 4);
		return IProfileService.findAll(pageable);
	}
	
	//@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/profile/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		
		Profile profile = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			profile = IProfileService.findById(id);
		} catch(DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		if(profile == null) {
			response.put("statusCode", HttpStatus.NOT_FOUND.value());
			response.put("message", "El perfil ID: ".concat(id.toString().concat("No existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		return new ResponseEntity<Profile>(profile, HttpStatus.OK);
	}
	
	//@Secured("ROLE_P2P")
	@PostMapping("/profile")
	public ResponseEntity<?> create(@Valid @RequestBody Profile profile, BindingResult result) {
		
		Profile profileNew = null;
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
			profile.setCreatedat(dateFormateada);
			profileNew = IProfileService.save(profile);
		} catch(DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		response.put("statusCode", HttpStatus.CREATED.value());
		response.put("message", "El perfil ha sido creado con éxito!");
		response.put("profile", profileNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	//@Secured("ROLE_ADMIN")
	@PutMapping("/profile/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Profile profile, BindingResult result, @PathVariable Long id) {

		Profile perfilActual = IProfileService.findById(id);

		Profile profileUpdated = null;

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
		
		if (perfilActual == null) {
			response.put("statusCode", HttpStatus.NOT_FOUND.value());
			response.put("message", "Error: no se pudo editar, el perfil ID: "
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
			
			profile.setCreatedat(perfilActual.getCreatedat());
			profile.setModifiedat(ModifiedDataFormateada);
			
			perfilActual.setName(profile.getName());
			perfilActual.setDescription(profile.getDescription());
			perfilActual.setCreatedat(profile.getCreatedat());
			perfilActual.setModifiedat(profile.getModifiedat());
			perfilActual.setRole(profile.getRole());

			profileUpdated = IProfileService.save(perfilActual);

		} catch (DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al actualizar el perfil en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		response.put("statusCode", HttpStatus.CREATED.value());
		response.put("message", "El perfil ha sido actualizado con éxito!");
		response.put("perfil", profileUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	//@Secured("ROLE_ADMIN")
	@DeleteMapping("/profile/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		
		Map<String, Object> response = new HashMap<>();
		
		try {		
			IProfileService.delete(id);
		} catch (DataAccessException e) {
			response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.put("message", "Error al eliminar el perfil de la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("statusCode", HttpStatus.OK.value());
		response.put("message", "El perfil ha sido eliminado con éxito!");
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/profile/roles")
	public List<Role> listarPerfiles(){
		return IProfileService.findAllRoles();
	}
	
}
