
package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IPagoMovilDao;
import com.suitepagos.backend.models.entity.PagoMovil;

@Service
public class IPagoMovilServiceImpl implements IPagoMovilService {

    @Autowired
    private IPagoMovilDao pm;

    @Override
    @Transactional(readOnly = true)
    public List<PagoMovil> findAll() {
        return pm.findAll();
    }

    @Override
    public Page<PagoMovil> findAll(Pageable pageable) {
        return pm.findAll(pageable);
    }

    @Override
    public PagoMovil findById(Long id) {
        return pm.findById(id).orElse(null);
    }

    @Override
    public PagoMovil save(PagoMovil pmm) {
        return pm.save(pmm);
    }

    // --------------------METODOS DE CONSULTAS--------------------   
    @Override
    @Transactional(readOnly = true)
    public String existData(String referecia, String monto, String telPag) {
        return pm.existData(referecia, monto, telPag);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findByMobilePaymentId(Long id) {
        return pm.findByMobilePaymentId(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findAllTransactionMobilePayments() {
        return pm.findAllTransactionMobilePayments();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<List<Map<String, Object>>> findAllTransactionPageMobilePayments(Pageable pageable) {
        return pm.findAllTransactionPageMobilePayments(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findByParamMobilePayments(Date fecIni, Date fecFin) {
        return pm.findByParamMobilePayments(fecIni, fecFin);
    }

}
