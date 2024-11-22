
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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "electronicDebit")
public class ElectronicDebit implements Serializable {

    @Id
    @Column(name = "ceid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "no puede estar vacio")
    @DecimalMin(value = "0.0", inclusive = false, message = "No puede haber letras")
    @Column(name = "phone")
    private String phone;

    @Email(message = "no es una dirección de correo bien formada")
    @Column(name = "email")
    private String email;

    @Digits(integer = 10, fraction = 2, message = "Max: 10 enteros y 2 decimales y no contener caracteres especiales")
    @NotEmpty(message = "no puede estar vacio")
    @DecimalMin(value = "0.0", inclusive = false, message = "debe ser mayor que 0 y no contener caracteres especiales")
    @Column(name = "amount")
    private String amount;

    @Size(max = 14, message = "El campo no puede superar los 14 caracteres")
    @Column(name = "paymentid", length = 14)
    private String paymentid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "concept")
    private String concept;

    // @NotNull(message="No puede ser vacio")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Users userid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String i) {
        this.paymentid = i;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    private static final long serialVersionUID = 1L;

}