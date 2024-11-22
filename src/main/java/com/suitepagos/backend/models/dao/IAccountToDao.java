package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.AccountTo;

public interface IAccountToDao extends JpaRepository<AccountTo, Long>{
	
	@Query(value = "select * from account_to u where u.bankid=?1 and u.customerid=?2 and u.phonenum=?3", nativeQuery = true)
	public AccountTo findByData(String bankid, String customerid, String phonenum);
	
}
