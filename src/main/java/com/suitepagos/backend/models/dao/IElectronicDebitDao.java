package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.ElectronicDebit;

public interface IElectronicDebitDao extends JpaRepository<ElectronicDebit, Long> {
    
    @Query(value = "select c.* from cargo_encuenta c where c.paymentid=?1", nativeQuery = true)
    public ElectronicDebit findByPaymentid(String paymentid);
    
    @Query(value = "SELECT MAX(c.paymentid)\r\n"
            + "  FROM cargo_encuenta c, user u, company cm\r\n"
            + " WHERE u.userid = c.userid\r\n"
            + "   AND cm.companyid = u.companyid\r\n"
            + "   AND cm.customerid = ?1 ", nativeQuery = true)
    public String AddPaymentid(String customerid);
    
    @Query(value = "SELECT name from company where customerid=?1 ", nativeQuery = true)
    public String AddNameCompany(String name);
}
