package com.suitepagos.backend.models.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Role;

public interface IProfileDao extends JpaRepository<Profile, Long>{

	@Query("from Role")
	public List<Role> findAllRoles();
	
}
