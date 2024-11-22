package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Role;

public interface IProfileService {
	
    public List<Profile> findAll();
	
	public Page<Profile> findAll(Pageable pageable);
	
	public Profile findById(Long id);
	
	public Profile save(Profile profile);
	
	public void delete(Long id);
	
	public List<Role> findAllRoles();
	
}
