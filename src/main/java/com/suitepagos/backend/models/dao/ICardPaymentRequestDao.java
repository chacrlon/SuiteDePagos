package com.suitepagos.backend.models.dao;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.CardPaymentRequest;

public interface ICardPaymentRequestDao extends JpaRepository<CardPaymentRequest, Long> {
    
    @Query(value = "select MAX(c.paymentid) from card_payment_request c, user u, company cm where u.userid = c.userid and cm.companyid = u.companyid and cm.customerid = ?1", nativeQuery = true)
    public String getPaymentId(String customerid);
    
    @Query(value = "SELECT c.paymentid AS 'paymentid', c.amount AS 'amount', c.concept AS 'concept', cm.customerid AS 'customerid', cm.name AS 'companyName' FROM `card_payment_request` AS c, user u, company cm WHERE u.userid = c.userid AND cm.companyid = u.companyid AND c.paymentid = ?1 AND cm.customerid = ?2", nativeQuery = true)
    public Map<String, Object> getCardPayment(String paymentid , String customerid);
    
}
