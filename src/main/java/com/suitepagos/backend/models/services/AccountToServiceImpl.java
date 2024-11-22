package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IAccountToDao;
import com.suitepagos.backend.models.entity.AccountTo;

@Service
public class AccountToServiceImpl implements IAccountToService {

	@Autowired
	private IAccountToDao AccountToDao;

	@Override
	@Transactional(readOnly = true)
	public List<AccountTo> findAll() {
		return (List<AccountTo>) AccountToDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<AccountTo> findAll(Pageable pageable) {
		return AccountToDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public AccountTo findById(Long id) {
		return AccountToDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public AccountTo save(AccountTo accountTo) {
		return AccountToDao.save(accountTo);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		AccountToDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public AccountTo findByData(String bankid, String customerid, String phonenum) {
		return AccountToDao.findByData(bankid, customerid, phonenum);
	}

}
