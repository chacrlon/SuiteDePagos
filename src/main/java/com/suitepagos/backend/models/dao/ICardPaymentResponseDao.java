package com.suitepagos.backend.models.dao;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.CardPaymentResponse;

public interface ICardPaymentResponseDao extends JpaRepository<CardPaymentResponse, Long> {

    @Query(value = "select 'Pago con tarjeta' as 'srvType', t.reference as 'reference', t.datetime as 'datetime', p.amount as 'amount' from card_payment p, card_payment_response t where t.id = p.id and t.idicr =?1 and (t.reference != 'null' and t.reference != '')", nativeQuery = true)
    public List<Map<String, Object>> findByIdCardPayment(Long id);
    
    @Query(value = "select 'Pago con tarjeta' as 'srvType', t.reference as 'reference', t.datetime as 'datetime', p.amount as 'amount' from card_payment p, card_payment_response t where t.id = p.id and (t.reference != 'null' and t.reference != '') ORDER BY 3 DESC LIMIT 10", nativeQuery = true)
    public List<Map<String, Object>> findAllTransactionCardPayments();
    
    @Query(value = "select 'Pago con tarjeta' as 'srvType', t.reference as 'reference', t.datetime as 'datetime', p.amount as 'amount' from card_payment p, card_payment_response t where t.id = p.id and (t.reference != 'null' and t.reference != '')",
            countQuery = "select count(*) from card_payment p, card_payment_response t where t.id = p.id and (t.reference != 'null' and t.reference != '')",
            nativeQuery = true)
    public Page<List<Map<String, Object>>> findAllTransactionPageCardPayments(Pageable pageable);
    
    @Query(value = "select 'Pago con tarjeta' as 'srvType', t.reference as 'reference', t.datetime as 'datetime', p.amount as 'amount' from card_payment p, card_payment_response t where t.id = p.id and (DATE(t.datetime) between ?1 and ?2) and (t.reference != 'null' and t.reference != '')", nativeQuery = true)
    public List<Map<String, Object>> findByParamCardPayment(Date fecIni, Date fecFin);
    
}
