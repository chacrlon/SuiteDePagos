package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.ICredentialP2PDao;
import com.suitepagos.backend.models.entity.CredentialP2P;

@Service
public class ICredentialP2PImpl implements ICredentialP2PService {

    @Autowired
    private ICredentialP2PDao ICredentialP2PDao;

    @Override
    @Transactional(readOnly = true)
    public List<CredentialP2P> findAll() {
        return ICredentialP2PDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CredentialP2P findById(Long id) {
        return ICredentialP2PDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public CredentialP2P findByCompanyId(Long id) {
        return ICredentialP2PDao.findByCompanyId(id);
    }

    @Override
    public CredentialP2P save(CredentialP2P credentialCardPayment) {
        return ICredentialP2PDao.save(credentialCardPayment);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id) {
        ICredentialP2PDao.deleteById(id);
    }
}
