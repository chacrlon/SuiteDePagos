package com.suitepagos.backend.models.services;

import java.util.Map;

import com.suitepagos.backend.models.entity.CardPaymentRequest;

public interface ICardPaymentRequestService {
    
    public CardPaymentRequest save(CardPaymentRequest cardPaymentRequest);
    
    public String getPaymentId(String customerid);
    
    public Map<String, Object> getCardPayment(String paymentid , String customerid);
}
