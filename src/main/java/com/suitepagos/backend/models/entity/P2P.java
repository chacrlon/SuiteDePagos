package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "p2p")
public class P2P implements Serializable {

	@Id
	@Column(name = "p2pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="es requerido")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deviceid")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@Valid
	private Device device;

	@OneToOne
	@JoinColumn(name = "accountfromid", updatable = false, nullable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private AccountFrom accountFrom;

	@NotNull(message="es requerido")
	@OneToOne
	@JoinColumn(name = "accounttoid", updatable = false, nullable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@Valid
	private AccountTo accountTo;
	
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@DecimalMin(value = "0.0", inclusive = false, message="debe ser mayor que 0")
    @Digits(integer=10, fraction=2, message="debe tener max: 10 enteros y 2 decimales (Solo números)")
	@Column(name = "amount", length = 12,nullable=false)
	private String amount;
	
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=60, message="tiene que ser de maximo 60 caracteres")
	@Column(name = "concept", length = 60,nullable=false)
	private String concept;
	
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=22, message="tiene que ser de maximo 22 caracteres")
	@Column(name = "paymentid",nullable=false, length = 22)
	private String paymentId;

	@Column(name = "trndate")
	@Temporal(TemporalType.DATE)
	private Date trnDate;

	@Column(name = "trntime", length = 8)
	private String trnTime;

	@Column(name = "srvtype", length = 3)
	private String srvType;

	@NotNull(message="es requerido")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Users user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public AccountFrom getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(AccountFrom accountFrom) {
		this.accountFrom = accountFrom;
	}

	public AccountTo getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(AccountTo accountTo) {
		this.accountTo = accountTo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Date getTrnDate() {
		return trnDate;
	}

	public void setTrnDate(Date trnDate) {
		this.trnDate = trnDate;
	}

	public String getTrnTime() {
		return trnTime;
	}

	public void setTrnTime(String trnTime) {
		this.trnTime = trnTime;
	}

	public String getSrvType() {
		return srvType;
	}

	public void setSrvType(String srvType) {
		this.srvType = srvType;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;
}
