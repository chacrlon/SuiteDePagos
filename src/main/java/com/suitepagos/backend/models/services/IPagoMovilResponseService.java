package com.suitepagos.backend.models.services;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.PagoMovilResponse;

public interface IPagoMovilResponseService {

	public List<PagoMovilResponse> findAll();
	
	public Page<PagoMovilResponse> findAll(Pageable pageable);
	
	public PagoMovilResponse findById(Long id);
	
	public PagoMovilResponse save(PagoMovilResponse pmr);
	
}
