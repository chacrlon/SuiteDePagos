package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IDeviceDao;
import com.suitepagos.backend.models.entity.Device;

@Service
public class DeviceServiceImpl implements IDeviceService {

	@Autowired
	private IDeviceDao deviceDao;

	@Override
	@Transactional(readOnly = true)
	public List<Device> findAll() {
		return (List<Device>) deviceDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Device> findAll(Pageable pageable) {
		return deviceDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Device findById(Long id) {
		return deviceDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Device save(Device device) {
		return deviceDao.save(device);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		deviceDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Device findByData(String description, String ipaddress, String type) {
		return deviceDao.findByData(description, ipaddress, type);
	}
}
