package com.suitepagos.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountFrom")
public class AccountFrom implements Serializable {


	@Id
	@Column(name="accountfromid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountFromId;
	
	@Column(name="bankid", length=4)
	private String bankId;


	public Long getAccountFromId() {
		return accountFromId;
	}

	public void setAccountFromId(Long accountFromId) {
		this.accountFromId = accountFromId;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	private static final long serialVersionUID = 1L;

}
