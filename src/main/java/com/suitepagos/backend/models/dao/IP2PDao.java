
package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.Role;

public interface IP2PDao extends JpaRepository<P2P, Long>{
	
	@Query(value = "SELECT * FROM p2p p WHERE p.userid =?1", nativeQuery = true)
	public P2P findByUserId(Long userid);
	
	@Query(value = "select * from p2p p, p2p_response pr where pr.p2pid = p.p2pid and statuscode = '200' and p.paymentid=?1", nativeQuery = true)
	public P2P findByPaymentId(String paymentid);

	@Query(value = "SELECT r.* FROM user as u, profile as p, profile_role as pr, role as r WHERE p.profileid = u.profileid and pr.profileid = p.profileid and r.roleid = pr.roleid and u.userid = 1 and r.name = 'AUV'", nativeQuery = true)
	public Role findRole(Long id);
}
