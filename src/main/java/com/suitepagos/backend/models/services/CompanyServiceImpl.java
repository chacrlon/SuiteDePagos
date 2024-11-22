package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.ICompanyDao;
import com.suitepagos.backend.models.entity.Company;

@Service
public class CompanyServiceImpl implements ICompanyService {
	
	@Autowired
	private ICompanyDao companyDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Company> findAll() {
		return companyDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Company> findAll(Pageable pageable) {
		return companyDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Company findById(Long id) {
		return companyDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Company save(Company company) {
		return companyDao.save(company);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		companyDao.deleteById(id);
	}

}
