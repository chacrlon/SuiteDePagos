package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.CredentialP2P;

public interface ICredentialP2PDao extends JpaRepository<CredentialP2P, Long> {

    @Query(value = "select * from credential_P2P u where u.companyid=?1", nativeQuery = true)
    public CredentialP2P findByCompanyId(Long id);

}
