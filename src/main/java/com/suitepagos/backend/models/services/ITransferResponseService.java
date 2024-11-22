package com.suitepagos.backend.models.services;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.TransferResponse;

public interface ITransferResponseService {

	public List<TransferResponse> findAll();
	
	public Page<TransferResponse> findAll(Pageable pageable);
	
	public TransferResponse findById(Long id);
	
	public TransferResponse save(TransferResponse tr);
	
}
