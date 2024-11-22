package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="accountTo")
public class AccountTo implements Serializable{

	
	@Id
	@Column(name="accounttoid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountToId;
	
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=4, message="tiene que ser de maximo 4 caracteres")
	@Column(name="bankid", length=4)
	private String bankId;
	
	@Pattern(regexp = "[A-Z]{1}[0-9]{4,14}", message="debe tener el formato: V00000000")
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=15, message="tiene que ser de maximo 15 caracteres")
	@Column(name="customerid", length=15)
	private String customerId;
	
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=12, message="tiene que ser de maximo 12 caracteres")
	@Column(name="phonenum", length=12)
	private String phoneNum;

	public Long getAccountToId() {
		return accountToId;
	}

	public void setAccountToId(Long accountToId) {
		this.accountToId = accountToId;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
