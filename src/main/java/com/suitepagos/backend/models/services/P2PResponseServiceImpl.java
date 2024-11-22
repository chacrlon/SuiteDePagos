
package com.suitepagos.backend.models.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IP2PResponseDao;
import com.suitepagos.backend.models.entity.P2PResponse;

@Service
public class P2PResponseServiceImpl implements IP2PResponseService {

	@Autowired
	private IP2PResponseDao it;

	@Override
	@Transactional(readOnly = true)
	public List<Map<String, Object>> findByTransactionId(Long id) {
		return it.findByTransactionId(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Map<String, Object>> findAllTransaction() {
		return it.findAllTransaction();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Map<String, Object>> findTenTransaction() {
		return it.findTenTransaction();
	}

	@Override
	public P2PResponse save(P2PResponse p2pp) {
		return it.save(p2pp);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Map<String, Object>> findByParam(Date fecIni, Date fecFin) {
		return it.findByParam(fecIni, fecFin);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<List<Map<String, Object>>> findAllTransactionPage(Pageable pageable) {
		return it.findAllTransactionPage(pageable);
	}

}
