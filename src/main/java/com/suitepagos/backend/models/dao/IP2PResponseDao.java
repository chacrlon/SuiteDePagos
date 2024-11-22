
package com.suitepagos.backend.models.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.suitepagos.backend.models.entity.P2PResponse;

public interface IP2PResponseDao extends PagingAndSortingRepository<P2PResponse, Long> {

	@Query(value = "select 'Vuelto' as 'srvType', t.referenceNumber as 'referenceNumber', CONCAT(p.trnDate, ' ' ,p.trnTime) as 'dateTime', p.amount as 'amount' from p2p p, p2p_response t where t.p2pid = p.p2pid and t.transactionid =?1 and (t.referenceNumber != 'null' and t.referenceNumber != '')", nativeQuery = true)
	public List<Map<String, Object>> findByTransactionId(Long id);

	@Query(value = "select p.srvType as 'srvType', t.referenceNumber as 'referenceNumber', p.trnDate as 'trnDate', p.trnTime as 'trnTime', STR_TO_DATE(DATE_FORMAT(STR_TO_DATE(CONCAT(trnDate, ' ',trnTime),\"%Y-%m-%d %H:%i:%s\"),\"%d/%m/%Y %h:%i:%s %p\"),\"%d/%m/%Y %h:%i:%s %p\") as 'dateTime', DATE_FORMAT(STR_TO_DATE(CONCAT(trnDate, ' ',trnTime),\"%Y-%m-%d %H:%i:%s\"),\"%d/%m/%Y %h:%i:%s %p\") as 'dateFormat', p.amount as 'amount' from p2p p, p2p_response t where t.p2pid = p.p2pid and (t.referenceNumber != 'null' and t.referenceNumber != '') ORDER BY 5 DESC LIMIT 5", nativeQuery = true)
	public List<Map<String, Object>> findAllTransaction();
	
	@Query(value = "SELECT reference as 'referenceNumber', STR_TO_DATE(DATE_FORMAT(STR_TO_DATE(datetime, \"%m/%d/%Y %h:%i:%s %p\"),\"%d/%m/%Y %h:%i:%s %p\"),\"%d/%m/%Y %h:%i:%s %p\") as 'dateTime', DATE_FORMAT(STR_TO_DATE(datetime, \"%m/%d/%Y %h:%i:%s %p\"),\"%d/%m/%Y %h:%i:%s %p\") as 'dateFormat', amount as 'amount', 'PCT' as 'srvType' FROM `card_payment_response` UNION select t.referenceNumber as 'referenceNumber', STR_TO_DATE(DATE_FORMAT(STR_TO_DATE(CONCAT(trnDate, ' ',trnTime),\"%Y-%m-%d %H:%i:%s\"),\"%d/%m/%Y %h:%i:%s %p\"),\"%d/%m/%Y %h:%i:%s %p\") as 'dateTime', DATE_FORMAT(STR_TO_DATE(CONCAT(trnDate, ' ',trnTime),\"%Y-%m-%d %H:%i:%s\"),\"%d/%m/%Y %h:%i:%s %p\") as 'dateFormat', p.amount as 'amount', p.srvType as 'srvType' from p2p p, p2p_response t where t.p2pid = p.p2pid and (t.referenceNumber != 'null' and t.referenceNumber != '') ORDER BY 2 DESC LIMIT 10", nativeQuery = true)
	public List<Map<String, Object>> findTenTransaction();
	
	@Query(value = "select p2p.srvType as 'srvType', t.referenceNumber as 'referenceNumber', p2p.trnDate as 'trnDate', p2p.trnTime as 'trnTime', p2p.amount as 'amount' from p2p, p2p_response t where t.p2pid = p2p.p2pid and (t.referenceNumber != 'null' and t.referenceNumber != '')",
			countQuery = "select count(*) from p2p, p2p_response t where t.p2pid = p2p.p2pid and (t.referenceNumber != 'null' and t.referenceNumber != '')",
			nativeQuery = true)
	public Page<List<Map<String, Object>>> findAllTransactionPage(Pageable pageable);
	
	@Query(value = "select p.srvType as 'srvType', t.referenceNumber as 'referenceNumber', p.trnDate as 'trnDate', p.trnTime as 'trnTime', p.amount as 'amount' from p2p p, p2p_response t where t.p2pid = p.p2pid and (p.trnDate between ?1 and ?2) and (t.referenceNumber != 'null' and t.referenceNumber != '')", nativeQuery = true)
	public List<Map<String, Object>> findByParam(Date fecIni, Date fecFin);
	
}
