
package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.suitepagos.backend.models.entity.Company;

public interface ICompanyService {
	
	public List<Company> findAll();
	
	public Page<Company> findAll(Pageable pageable);
	
	public Company findById(Long id);
	
	public Company save(Company company);
	
	public void delete(Long id);
	
}