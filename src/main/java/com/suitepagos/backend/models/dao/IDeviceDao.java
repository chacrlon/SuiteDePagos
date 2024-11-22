package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.Device;

public interface IDeviceDao extends JpaRepository<Device, Long>{
	
	@Query(value = "select * from device u where u.description=?1 and u.ipaddress=?2 and u.type=?3", nativeQuery = true)
	public Device findByData(String description, String ipaddress, String type);
	
}
