package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.IElectronicDebitDao;
import com.suitepagos.backend.models.entity.ElectronicDebit;

@Service
public class ElectronicDebitImpl implements IElectronicDebitService {
    
    @Autowired
    private IElectronicDebitDao electronicDebitDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<ElectronicDebit> findAll() {
        return electronicDebitDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ElectronicDebit findById(Long id) {
        return electronicDebitDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ElectronicDebit save(ElectronicDebit electronicDebit) {
        return electronicDebitDao.save(electronicDebit);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        electronicDebitDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public ElectronicDebit findByPaymentid(String paymentid) {
        return electronicDebitDao.findByPaymentid(paymentid);
    }

    @Override
    @Transactional(readOnly = true)
    public String AddPaymentid(String customerid) {
        return electronicDebitDao.AddPaymentid(customerid);
    }

    @Override
    @Transactional(readOnly = true)
    public String AddNameCompany(String name) {
        return electronicDebitDao.AddNameCompany(name);
    }

}
