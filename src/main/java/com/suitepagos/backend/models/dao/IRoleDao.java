package com.suitepagos.backend.models.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.Role;

public interface IRoleDao extends JpaRepository<Role, Long>{
	
	@Query(value = "select p.profileid as 'profileid', p.roleid as 'roleid' from profile_role p where p.profileid =?1", nativeQuery = true)
	public List<Map<String, String>> findRolePerfil(Long id);
	
}
