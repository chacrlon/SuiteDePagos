package com.suitepagos.backend.models.dao;

import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.PagoMovil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.sql.Date;

public interface IPagoMovilDao extends JpaRepository<PagoMovil, Long> {

    @Query(value = "SELECT 1 from pago_movil where reference=?1 and amount=?2 and telpag=?3", nativeQuery = true)
    public String existData(String referecia, String monto, String telPag);  
    
    @Query(value = "select 'Pago movil' as 'srvType', reference, createdat, amount from pago_movil where id =?1 and (reference != 'null' and reference != '')", nativeQuery = true)
    public List<Map<String, Object>> findByMobilePaymentId(Long id);
    
    @Query(value = "select 'Pago movil' as 'srvType', reference, createdat, amount from pago_movil where (reference != 'null' and reference != '') ORDER BY 3 DESC LIMIT 10", nativeQuery = true)
    public List<Map<String, Object>> findAllTransactionMobilePayments();
    
    @Query(value = "select 'Pago movil' as 'srvType', reference, createdat, amount from pago_movil where (reference != 'null' and reference != '')",
            countQuery = "select count(*) from pago_movil where (reference != 'null' and reference != '')",
            nativeQuery = true)
    public Page<List<Map<String, Object>>> findAllTransactionPageMobilePayments(Pageable pageable);
    
    @Query(value = "select 'Pago movil' as 'srvType', reference, createdat, amount from pago_movil where (DATE(createdat) between ?1 and ?2) and (reference != 'null' and reference != '') ORDER BY 3 DESC", nativeQuery = true)
    public List<Map<String, Object>> findByParamMobilePayments(Date fecIni, Date fecFin);
}
