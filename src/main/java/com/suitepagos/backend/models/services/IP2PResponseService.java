package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.suitepagos.backend.models.entity.P2PResponse;

public interface IP2PResponseService {

	public List<Map<String, Object>> findByTransactionId(Long id);

	public List<Map<String, Object>> findAllTransaction();
	
	public List<Map<String, Object>> findTenTransaction();

	public Page<List<Map<String, Object>>> findAllTransactionPage(Pageable pageable);

	public List<Map<String, Object>> findByParam(Date fecIni, Date fecFin);

	public P2PResponse save(P2PResponse p2pp);
}
