package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suitepagos.backend.models.entity.CardPayment;

public interface ICardPaymentDao extends JpaRepository<CardPayment, Long> {
    
}
