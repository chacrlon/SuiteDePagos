package com.suitepagos.backend.models.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Users;

public interface IUserDao extends JpaRepository<Users, Long>{
	
	@Query("select u from Users u where u.username=?1")
	public Users findByUsername(String username);
	
	@Query("select u from Users u where u.id=?1")
	public Users findByUserId(Long userid);

	@Query("from Profile")
	public List<Profile> findAllProfiles();
	
}
