package com.suitepagos.backend.models.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.ICardPaymentRequestDao;
import com.suitepagos.backend.models.entity.CardPaymentRequest;

@Service
public class CardPaymentRequestImpl implements ICardPaymentRequestService {
    
    @Autowired
    private ICardPaymentRequestDao cardPaymentRequestDao;
    
    @Override
    @Transactional
    public CardPaymentRequest save(CardPaymentRequest cardPaymentRequest) {
        return cardPaymentRequestDao.save(cardPaymentRequest);
    }

    @Override
    @Transactional(readOnly = true)
    public String getPaymentId(String customerid) {
        return cardPaymentRequestDao.getPaymentId(customerid);
    }

    @Override
    @Transactional(readOnly = true)
    public Map<String, Object> getCardPayment(String paymentid, String customerid) {
        return cardPaymentRequestDao.getCardPayment(paymentid, customerid);
    }

}
