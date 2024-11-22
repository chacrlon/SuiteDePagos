package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suitepagos.backend.models.entity.PagoMovilResponse;

public interface IPagoMovilResponseDao extends JpaRepository<PagoMovilResponse, Long> {

    
}
