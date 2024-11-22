package com.suitepagos.backend.models.services;

import java.util.List;
import com.suitepagos.backend.models.entity.CardPayment;

public interface ICardPaymentService {

    public List<CardPayment> findAll();

    public CardPayment findById(Long id);

    public CardPayment save(CardPayment cardPayment);

    public void delete(Long id);
}
