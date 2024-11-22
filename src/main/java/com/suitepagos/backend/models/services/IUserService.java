package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Users;

public interface IUserService {

	public Users findByUsername(String username);
	
	@Query("select u from Users u where u.userId=?1")
	public Users findByUserId(Long userid);
	
    public List<Users> findAll();
	
	public Page<Users> findAll(Pageable pageable);
	
	public Users findById(Long id);
	
	public Users save(Users user);
	
	public void delete(Long id);
	
	public List<Profile> findAllProfiles();
}
