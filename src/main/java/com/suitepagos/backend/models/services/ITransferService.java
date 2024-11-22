package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.Transfer;

public interface ITransferService {

	public List<Transfer> findAll();
	
	public Page<Transfer> findAll(Pageable pageable);
	
	public Transfer findById(Long id);
	
	public Transfer save(Transfer t);
	
	public String existData(String referecia, String monto, String cuentaemisor);
	
	// --------------------METODOS DE CONSULTAS--------------------
    public List<Map<String, Object>> findByIdTransfer(Long id);

    public List<Map<String, Object>> findAllTransactionTransfer();

    public Page<List<Map<String, Object>>> findAllTransactionPageTransfer(Pageable pageable);

    public List<Map<String, Object>> findByParamTransfer(Date fecIni, Date fecFin);
    
    public List<Map<String, Object>> findTenTransactionTransfer();
    
    public List<Map<String, Object>> findTenTransactionSuitePagos();
	
}
