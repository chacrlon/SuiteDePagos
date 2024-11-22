package com.suitepagos.backend.models.services;

import java.util.List;

import com.suitepagos.backend.models.entity.ElectronicDebit;

public interface IElectronicDebitService {

    public List<ElectronicDebit> findAll();

    public ElectronicDebit findById(Long id);
    
    public ElectronicDebit findByPaymentid(String paymentid);
    
    public String AddPaymentid(String customerid);
    
    public String AddNameCompany(String name);

    public ElectronicDebit save(ElectronicDebit electronicDebit);

    public void delete(Long id);
}
