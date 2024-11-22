package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {

	@Id
	@Column(name = "profileid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "no puede estar vacio")
	@Column(name = "name", length = 50)
	private String name;

	@NotEmpty(message = "no puede estar vacio")
	@Column(name = "description")
	private String description;

	@Column(name = "createdat")
	private String createdat;

	@Column(name = "modifiedat")
	private String modifiedat;

	@NotEmpty(message = "no puede estar vacio")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "profileRole", joinColumns = @JoinColumn(name = "profileid"), inverseJoinColumns = @JoinColumn(name = "roleid"))
	private List<Role> role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
