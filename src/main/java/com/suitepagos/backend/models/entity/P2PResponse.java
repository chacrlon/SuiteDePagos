package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="p2pResponse")
public class P2PResponse implements Serializable{

	@Id
	@Column(name="transactionid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="statuscode")
	private String statusCode;
	
	@Column(name="statusdesc")
	private String statusDesc;
	
	@Column(name="referencenumber",nullable = true)
	private String referenceNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "p2pid", referencedColumnName = "p2pid")
	private P2P p2pid;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public P2P getP2pid() {
		return p2pid;
	}

	public void setP2pid(P2P p2pid) {
		this.p2pid = p2pid;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
