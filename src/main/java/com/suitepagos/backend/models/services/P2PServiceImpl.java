
package com.suitepagos.backend.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.suitepagos.backend.models.dao.IP2PDao;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.Role;
import com.suitepagos.backend.models.entity.Users;

@Service
public class P2PServiceImpl implements Ip2pService {

	@Autowired
	private IP2PDao p2p;

	@Override
	@Transactional(readOnly = true)
	public List<P2P> findAll() {
		return (List<P2P>) p2p.findAll();
	}

	@Override
	public Page<P2P> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P2P findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P2P save(P2P pp) {
		return p2p.save(pp);
	}
	

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public P2P findByPaymentId(String paymentid) {
		return p2p.findByPaymentId(paymentid);
	}

	@Override
	@Transactional(readOnly = true)
	public P2P findByUserId(Long userid) {
		return p2p.findByUserId(userid);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Role findRole(Long id) {
		return p2p.findRole(id);
	}

}

