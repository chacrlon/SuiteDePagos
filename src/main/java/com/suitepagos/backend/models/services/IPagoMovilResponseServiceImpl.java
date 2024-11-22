
package com.suitepagos.backend.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IPagoMovilDao;
import com.suitepagos.backend.models.dao.IPagoMovilResponseDao;
import com.suitepagos.backend.models.entity.PagoMovil;
import com.suitepagos.backend.models.entity.PagoMovilResponse;

@Service
public class IPagoMovilResponseServiceImpl implements IPagoMovilResponseService {

	@Autowired
	private IPagoMovilResponseDao pm;
	
	@Override
	@Transactional(readOnly = true)
	public List<PagoMovilResponse> findAll() {
		return pm.findAll();
	}

	@Override
	public Page<PagoMovilResponse> findAll(Pageable pageable) {
	    return pm.findAll(pageable);
	}

	@Override
	public PagoMovilResponse findById(Long id) {
	    return pm.findById(id).orElse(null);
	}

	@Override
    public PagoMovilResponse save(PagoMovilResponse pmm) {
        return pm.save(pmm);
    }
	
}

