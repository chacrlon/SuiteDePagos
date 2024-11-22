package com.suitepagos.backend.models.services;

import java.util.List;
import com.suitepagos.backend.models.entity.CredentialP2P;

public interface ICredentialP2PService {

    public List<CredentialP2P> findAll();

    public CredentialP2P findById(Long id);

    public CredentialP2P findByCompanyId(Long id);

    public CredentialP2P save(CredentialP2P company);

    public void delete(Long id);
}
