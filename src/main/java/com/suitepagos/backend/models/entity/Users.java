package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
public class Users implements Serializable {

	@Id
	@Column(name = "userid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "no puede estar vacio")
	@Column(name = "username", unique = true)
	private String username;

	@Column(name = "password", length = 70, nullable = false)
	private String password;

	@Column(name = "enabled")
	private Boolean enabled;

	@NotEmpty(message = "no puede estar vacio")
	@Column(name = "name")
	private String name;

	@NotEmpty(message = "no puede estar vacio")
	@Column(name = "surname")
	private String surname;

	@NotEmpty(message = "no puede estar vacio")
	@Column(unique = true)
	private String email;

	@Pattern(regexp = "[A-Z]{1}[0-9]{4,14}", message = "debe tener el formato: V00000000")
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max = 15, message = "tiene que ser de maximo 15 caracteres")
	@Column(name = "customerid", length = 15)
	private String customerid;

	@Column(name = "createdat")
	private String createdat;

	@Column(name = "modifiedat")
	private String modifiedat;

	// @NotNull(message = "No puede estar vacio")
	@ManyToOne
	@JoinColumn(name = "companyid")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Company company;

	@NotNull(message = "No puede estar vacio")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profileid")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Profile profileid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Profile getProfileid() {
		return profileid;
	}

	public void setProfileid(Profile profileid) {
		this.profileid = profileid;
	}

	public String getEmail() {
		return email;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public String getModifiedat() {
		return modifiedat;
	}

	public void setModifiedat(String modifiedat) {
		this.modifiedat = modifiedat;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	private static final long serialVersionUID = 1L;
}