package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.ICredentialCardPaymentDao;
import com.suitepagos.backend.models.entity.CredentialCardPayment;

@Service
public class CredentialCardPaymentImpl implements ICredentialCardPaymentService {

    @Autowired
    private ICredentialCardPaymentDao credentialCardPaymentDao;

    @Override
    @Transactional(readOnly = true)
    public List<CredentialCardPayment> findAll() {
        return credentialCardPaymentDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CredentialCardPayment findById(Long id) {
        return credentialCardPaymentDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public CredentialCardPayment findByCompanyId(Long id) {
        return credentialCardPaymentDao.findByCompanyId(id);
    }

    @Override
    @Transactional
    public CredentialCardPayment save(CredentialCardPayment credentialCardPayment) {
        return credentialCardPaymentDao.save(credentialCardPayment);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        credentialCardPaymentDao.deleteById(id);
    }
}
