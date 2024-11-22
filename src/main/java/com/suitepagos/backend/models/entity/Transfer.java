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
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "transfer")
public class Transfer implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message ="no puede estar vacio")
    @Column(name = "reference", length = 15)
    private String reference;

    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @DecimalMin(value = "0.0", inclusive = false, message="debe ser mayor que 0")
    @Digits(integer=10, fraction=2, message="debe tener max: 10 enteros y 2 decimales (Solo números)")
    @Column(name = "amount", length = 12,nullable=false)
    private String amount;

    @Column(name="issueraccount")
    private String issueraccount;

    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @Pattern(regexp = "[A-Z]{1}[0-9]{4,14}", message="debe tener el formato: V00000000")
    @Size(max=15, message="tiene que ser de maximo 10 caracteres")
    @Column(name="cedemisor", length=10)
    private String cedEmisor;

    @Column(name = "createdat")
    private String createdat;

    @NotNull(message = "es requerido")
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIssueraccount() {
        return issueraccount;
    }

    public void setIssueraccount(String issueraccount) {
        this.issueraccount = issueraccount;
    }

    public String getCedEmisor() {
        return cedEmisor;
    }

    public void setCedEmisor(String cedEmisor) {
        this.cedEmisor = cedEmisor;
    }

    public String getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    private static final long serialVersionUID = 1L;
 
}
