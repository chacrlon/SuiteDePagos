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
@Table(name = "device")
public class Device implements Serializable {

	@Id
	@Column(name = "deviceid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deviceId;

	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=255, message="tiene que ser de maximo 255 caracteres")
	@Column(name = "description", length = 255)
	private String description;
	
	@Pattern(regexp = "[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}", message="debe tener el formato: 255.255.255.255")
	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=20, message="tiene que ser de maximo 20 caracteres")
	@Column(name = "ipaddress", length = 20)
	private String ipAddress;

	@NotEmpty(message = "es un campo requerido y no puede estar vacío")
	@Size(max=30, message="tiene que ser de maximo 30 caracteres")
	@Column(name = "type", length = 30)
	private String type;

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	private static final long serialVersionUID = 1L;

}
