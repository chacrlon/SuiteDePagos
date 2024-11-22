package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.AccountFrom;

public interface IAccountFromService {

	public List<AccountFrom> findAll();
	
	public Page<AccountFrom> findAll(Pageable pageable);
	
	public AccountFrom findById(Long id);
	
	public AccountFrom findByData(String bankid);
	
	public AccountFrom save(AccountFrom AccountFrom);
	
	public void delete(Long id);
}
