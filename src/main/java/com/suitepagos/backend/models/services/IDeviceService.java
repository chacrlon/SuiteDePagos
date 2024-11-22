package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.Device;


public interface IDeviceService {
	
	public List<Device> findAll();
	
	public Device findByData(String description, String ipaddress, String type);
	
	public Page<Device> findAll(Pageable pageable);
	
	public Device findById(Long id);
	
	public Device save(Device device);
	
	public void delete(Long id);
}
