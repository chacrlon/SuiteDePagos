package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.AccountTo;

public interface IAccountToService {

	public List<AccountTo> findAll();
	
	public Page<AccountTo> findAll(Pageable pageable);
	
	public AccountTo findById(Long id);
	
	public AccountTo findByData(String bankid, String customerid, String phonenum);
	
	public AccountTo save(AccountTo accountTo);
	
	public void delete(Long id);
}
