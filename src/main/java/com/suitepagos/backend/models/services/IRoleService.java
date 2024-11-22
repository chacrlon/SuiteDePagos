package com.suitepagos.backend.models.services;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.Role;

public interface IRoleService {
	
    public List<Role> findAll();
    
    public List<Map<String, String>> findRolePerfil(Long id);
	
	public Page<Role> findAll(Pageable pageable);
	
	public Role findById(Long id);
	
	public Role save(Role role);
	
	public void delete(Long id);
	
}
