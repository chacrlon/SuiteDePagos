package com.suitepagos.backend.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IProfileDao;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Role;

@Service
public class ProfileServiceImpl implements IProfileService {

	@Autowired
	private IProfileDao profileDao;

	@Override
	@Transactional(readOnly = true)
	public List<Profile> findAll() {
		return (List<Profile>) profileDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Profile> findAll(Pageable pageable) {
		return profileDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Profile findById(Long id) {
		return profileDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Profile save(Profile profile) {
		return profileDao.save(profile);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		profileDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Role> findAllRoles() {
		return profileDao.findAllRoles();
	}

}
