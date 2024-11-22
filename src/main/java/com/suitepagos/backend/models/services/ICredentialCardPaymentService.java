package com.suitepagos.backend.models.services;

import java.util.List;

import com.suitepagos.backend.models.entity.CredentialCardPayment;

public interface ICredentialCardPaymentService {

    public List<CredentialCardPayment> findAll();

    public CredentialCardPayment findById(Long id);

    public CredentialCardPayment findByCompanyId(Long id);

    public CredentialCardPayment save(CredentialCardPayment company);

    public void delete(Long id);
}
