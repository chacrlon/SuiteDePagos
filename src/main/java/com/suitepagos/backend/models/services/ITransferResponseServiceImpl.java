
package com.suitepagos.backend.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.ITransferResponseDao;
import com.suitepagos.backend.models.entity.TransferResponse;

@Service
public class ITransferResponseServiceImpl implements ITransferResponseService {

	@Autowired
	private ITransferResponseDao pm;
	
	@Override
	@Transactional(readOnly = true)
	public List<TransferResponse> findAll() {
		return pm.findAll();
	}

	@Override
	public Page<TransferResponse> findAll(Pageable pageable) {
	    return pm.findAll(pageable);
	}

	@Override
	public TransferResponse findById(Long id) {
	    return pm.findById(id).orElse(null);
	}

	@Override
    public TransferResponse save(TransferResponse pmm) {
        return pm.save(pmm);
    }
	
}

