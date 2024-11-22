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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "company")
public class Company implements Serializable {

    @Id
    @Column(name = "companyid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyid;

    @Pattern(regexp = "[A-Z]{1}[0-9]{4,14}", message = "debe tener el formato: V00000000")
    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @Size(max = 15, message = "tiene que ser de maximo 15 caracteres")
    @Column(name = "customerid", length = 15)
    private String customerid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "no puede estar vacio")
    @Column(unique = true)
    private String email;

    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @Size(max = 12, message = "tiene que ser de maximo 12 caracteres")
    @Column(name = "phonenum", length = 12)
    private String phoneNum;

    // @NotNull(message = "no puede estar vacio")
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "companyModule", joinColumns = @JoinColumn(name = "companyid"), inverseJoinColumns = @JoinColumn(name = "moduleid"))
    private List<ModuleConfig> module;

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<ModuleConfig> getModule() {
        return module;
    }

    public void setModule(List<ModuleConfig> module) {
        this.module = module;
    }

    private static final long serialVersionUID = 1L;
}
