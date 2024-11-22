package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.ICardPaymentResponseDao;
import com.suitepagos.backend.models.entity.CardPaymentResponse;

@Service
public class CardPaymentResponseImpl implements ICardPaymentResponseService {

    @Autowired
    private ICardPaymentResponseDao cprdao;

    @Override
    @Transactional(readOnly = true)
    public List<CardPaymentResponse> findAll() {
        return cprdao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CardPaymentResponse findById(Long id) {
        return cprdao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public CardPaymentResponse save(CardPaymentResponse cardPaymentResponse) {
        return cprdao.save(cardPaymentResponse);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        cprdao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findByIdCardPayment(Long id) {
        return cprdao.findByIdCardPayment(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findAllTransactionCardPayments() {
        return cprdao.findAllTransactionCardPayments();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<List<Map<String, Object>>> findAllTransactionPageCardPayments(Pageable pageable) {
        return cprdao.findAllTransactionPageCardPayments(pageable);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findByParamCardPayment(Date fecIni, Date fecFin) {
       return cprdao.findByParamCardPayment(fecIni, fecFin);        
    }
    

}
