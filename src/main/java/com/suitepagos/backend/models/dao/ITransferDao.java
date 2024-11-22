package com.suitepagos.backend.models.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.Transfer;

public interface ITransferDao extends JpaRepository<Transfer, Long> {

    @Query(value = "SELECT 1 from transfer where reference=?1 and amount=?2 and cedemisor=?3", nativeQuery = true)
    public String existData(String referecia, String monto, String cedemisor);
       
    @Query(value = "select 'Credito inmediato' as 'srvType', reference, createdat, amount from transfer where id =?1 and (reference != 'null' and reference != '')", nativeQuery = true)
    public List<Map<String, Object>> findByIdTransfer(Long id);
    
    @Query(value = "select 'Credito inmediato' as 'srvType', reference, createdat, amount from transfer where (reference != 'null' and reference != '') ORDER BY 3 DESC LIMIT 10", nativeQuery = true)
    public List<Map<String, Object>> findAllTransactionTransfer();
    
    @Query(value = "select 'Credito inmediato' as 'srvType', reference, createdat, amount from transfer where (reference != 'null' and reference != '')",
            countQuery = "select count(*) from pago_movil where (reference != 'null' and reference != '')",
            nativeQuery = true)
    public Page<List<Map<String, Object>>> findAllTransactionPageTransfer(Pageable pageable);
    
    @Query(value = "select 'Credito inmediato' as 'srvType', reference, createdat, amount from transfer"
            + " where (DATE(createdat) between ?1 and ?2) and (reference != 'null' and reference != '') ORDER BY 3", nativeQuery = true)
    public List<Map<String, Object>> findByParamTransfer(Date fecIni, Date fecFin);
       
    @Query(value = "select 'Pago movil' as 'srvType', reference, createdat, amount from pago_movil UNION select 'Credito inmediato' as 'srvType', reference, createdat, amount from transfer UNION select ordernumber as 'referenceNumber', STR_TO_DATE(DATE_FORMAT(STR_TO_DATE(datetime, \\\"%m/%d/%Y %h:%i:%s %p\\\"),\\\"%d/%m/%Y %h:%i:%s %p\\\"),\\\"%d/%m/%Y %h:%i:%s %p\\\") as 'dateTime', DATE_FORMAT(STR_TO_DATE(datetime, \\\"%m/%d/%Y %h:%i:%s %p\\\"),\\\"%d/%m/%Y %h:%i:%s %p\\\") as 'dateFormat', amount as 'amount', 'PCT' as 'srvType' from `card_payment_response` UNION select t.referenceNumber as 'referenceNumber', STR_TO_DATE(DATE_FORMAT(STR_TO_DATE(CONCAT(trnDate, ' ',trnTime),\\\"%Y-%m-%d %H:%i:%s\\\"),\\\"%d/%m/%Y %h:%i:%s %p\\\"),\\\"%d/%m/%Y %h:%i:%s %p\\\") as 'dateTime', DATE_FORMAT(STR_TO_DATE(CONCAT(trnDate, ' ',trnTime),\\\"%Y-%m-%d %H:%i:%s\\\"),\\\"%d/%m/%Y %h:%i:%s %p\\\") as 'dateFormat', p.amount as 'amount', p.srvType as 'srvType' from p2p p, p2p_response t where (reference != 'null' and reference != '' and t.p2pid = p.p2pid and t.referenceNumber != 'null' and t.referenceNumber != '')", nativeQuery = true)
    public List<Map<String, Object>> findTenTransactionTransfer();
    
    @Query(value = "select 'Pago movil' as 'srvType', reference, createdat, amount from pago_movil where reference != 'null' and reference != '' UNION select 'Credito inmediato' as 'srvType', reference, createdat, amount from transfer where reference != 'null' and reference != '' UNION select 'Pago con tarjeta' as 'srvType', reference, datetime, amount from card_payment_response where reference != 'null' and reference != '' UNION select p.srvType as 'srvType', t.referenceNumber as 'referenceNumber', CONCAT(trnDate, ' ',trnTime) as 'trndate', p.amount as 'amount' from p2p p, p2p_response t where (t.referenceNumber != 'null' and t.referenceNumber != '') ORDER BY 3 DESC LIMIT 10", nativeQuery = true)
    public List<Map<String, Object>> findTenTransactionSuitePagos();
}
