package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.suitepagos.backend.models.entity.CardPaymentResponse;

public interface ICardPaymentResponseService {
    
    public List<CardPaymentResponse> findAll();

    public CardPaymentResponse findById(Long id);

    public CardPaymentResponse save(CardPaymentResponse cardPaymentResponse);

    public void delete(Long id);
    
    public List<Map<String, Object>> findByIdCardPayment(Long id);

    public List<Map<String, Object>> findAllTransactionCardPayments();

    public Page<List<Map<String, Object>>> findAllTransactionPageCardPayments(Pageable pageable);

    public List<Map<String, Object>> findByParamCardPayment(Date fecIni, Date fecFin);
}
