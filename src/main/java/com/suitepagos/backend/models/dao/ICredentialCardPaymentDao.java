package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.CredentialCardPayment;

public interface ICredentialCardPaymentDao extends JpaRepository<CredentialCardPayment, Long> {

    @Query(value = "select * from credential_card_payment u where u.companyid=?1", nativeQuery = true)
    public CredentialCardPayment findByCompanyId(Long id);

}
