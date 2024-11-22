package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suitepagos.backend.models.entity.TransferResponse;

public interface ITransferResponseDao extends JpaRepository<TransferResponse, Long> {

    
}
