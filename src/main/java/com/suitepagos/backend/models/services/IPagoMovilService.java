package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.PagoMovil;

public interface IPagoMovilService {

    public List<PagoMovil> findAll();

    public Page<PagoMovil> findAll(Pageable pageable);

    public PagoMovil findById(Long id);

    public PagoMovil save(PagoMovil pm);

    public String existData(String referecia, String monto, String telPag);

    // --------------------METODOS DE CONSULTAS--------------------
    public List<Map<String, Object>> findByMobilePaymentId(Long id);

    public List<Map<String, Object>> findAllTransactionMobilePayments();
    
    public Page<List<Map<String, Object>>> findAllTransactionPageMobilePayments(Pageable pageable);

    public List<Map<String, Object>> findByParamMobilePayments(Date fecIni, Date fecFin);
}
