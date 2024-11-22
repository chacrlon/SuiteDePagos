package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.ICardPaymentDao;
import com.suitepagos.backend.models.entity.CardPayment;

@Service
public class CardPaymentServiceImple implements ICardPaymentService {

    @Autowired
    private ICardPaymentDao cpdao;
    
    @Override
    @Transactional(readOnly = true)
    public List<CardPayment> findAll() {
        return cpdao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CardPayment findById(Long id) {
        return cpdao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public CardPayment save(CardPayment cardPayment) {
        return cpdao.save(cardPayment);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        cpdao.deleteById(id);
    }

}
