package com.suitepagos.backend.models.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IRoleDao;
import com.suitepagos.backend.models.entity.Role;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private IRoleDao roleDao;

	@Override
	@Transactional(readOnly = true)
	public List<Role> findAll() {
		return (List<Role>) roleDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Role> findAll(Pageable pageable) {
		return roleDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Role findById(Long id) {
		return roleDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Role save(Role role) {
		return roleDao.save(role);
	}

	@Override
	@Transactional(readOnly = true)
	public void delete(Long id) {
		roleDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Map<String, String>> findRolePerfil(Long id) {
		return roleDao.findRolePerfil(id);
	}

}
