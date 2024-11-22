package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.Role;
import com.suitepagos.backend.models.entity.Users;

public interface Ip2pService {

	public List<P2P> findAll();
	
	public Page<P2P> findAll(Pageable pageable);
	
	public P2P findById(Long id);
	
	public P2P save(P2P p2p);
	
	public void delete(Long id);
	
	public P2P findByPaymentId(String paymentid);
	
	public List<Users> findAllUser();
	
	public P2P findByUserId(Long userid);
	
	public Role findRole(Long id);
}
