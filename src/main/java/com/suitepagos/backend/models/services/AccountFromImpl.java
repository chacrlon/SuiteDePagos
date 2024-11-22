package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IAccountFromDao;
import com.suitepagos.backend.models.entity.AccountFrom;

@Service
public class AccountFromImpl implements IAccountFromService {

    @Autowired
    private IAccountFromDao AccountFromDao;

    @Override
    @Transactional(readOnly = true)
    public List<AccountFrom> findAll() {
        return (List<AccountFrom>) AccountFromDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<AccountFrom> findAll(Pageable pageable) {
        return AccountFromDao.findAll(pageable);
    }
    
    @Override
    @Transactional(readOnly = true)
    public AccountFrom findById(Long id) {
        return AccountFromDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public AccountFrom save(AccountFrom accountFrom) {
        return AccountFromDao.save(accountFrom);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        AccountFromDao.deleteById(id);
    }

	@Override
	@Transactional(readOnly = true)
	public AccountFrom findByData(String bankid) {
		return AccountFromDao.findByData(bankid);
	}

}