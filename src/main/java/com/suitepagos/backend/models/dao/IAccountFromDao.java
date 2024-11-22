package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.AccountFrom;

public interface IAccountFromDao extends JpaRepository<AccountFrom, Long>{
	
	@Query(value = "select * from account_from u where u.bankid=?1", nativeQuery = true)
	public AccountFrom findByData(String bankid);
	
}
