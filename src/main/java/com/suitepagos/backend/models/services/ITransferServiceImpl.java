
package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.ITransferDao;
import com.suitepagos.backend.models.entity.Transfer;

@Service
public class ITransferServiceImpl implements ITransferService {

    @Autowired
    private ITransferDao it;

    @Override
    @Transactional(readOnly = true)
    public List<Transfer> findAll() {
        return it.findAll();
    }

    @Override
    public Page<Transfer> findAll(Pageable pageable) {
        return it.findAll(pageable);
    }

    @Override
    public Transfer findById(Long id) {
        return it.findById(id).orElse(null);
    }

    @Override
    public Transfer save(Transfer t) {
        return it.save(t);
    }
    
 // --------------------METODOS DE CONSULTAS--------------------   
    @Override
    @Transactional(readOnly = true)
    public String existData(String referecia, String monto, String cuentaemisor) {
        return it.existData(referecia, monto, cuentaemisor);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findByIdTransfer(Long id) {
        return it.findByIdTransfer(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findAllTransactionTransfer() {
        return it.findAllTransactionTransfer();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<List<Map<String, Object>>> findAllTransactionPageTransfer(Pageable pageable) {
        return it.findAllTransactionPageTransfer(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findByParamTransfer(Date fecIni, Date fecFin) {
        return it.findByParamTransfer(fecIni, fecFin);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findTenTransactionTransfer() {
        return it.findTenTransactionTransfer();
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findTenTransactionSuitePagos() {
        return it.findTenTransactionSuitePagos();
    }

}
