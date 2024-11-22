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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cardPaymentRequest")
public class CardPaymentRequest implements Serializable {

    @Id
    @Column(name = "cardpaymentrequestid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardpaymentrequestid;

    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @Size(max = 12, message = "tiene que ser de maximo 12 caracteres")
    @Column(name = "phonenum", length = 12)
    private String phoneNum;

    @Email(message = "no es una dirección de correo bien formada")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @DecimalMin(value = "0.0", inclusive = false, message = "debe ser mayor que 0")
    @Digits(integer = 10, fraction = 2, message = "debe tener max: 10 enteros y 2 decimales (Solo números)")
    @Column(name = "amount", length = 12, nullable = false)
    private String amount;

    @Size(max = 14, message = "tiene que ser de maximo 22 caracteres")
    @Column(name = "paymentid", nullable = false, length = 14)
    private String paymentId;

    @Column(name = "createdat")
    private String createdat;

    @NotEmpty(message = "es un campo requerido y no puede estar vacío")
    @Size(max = 60, message = "tiene que ser de maximo 60 caracteres")
    @Column(name = "concept", length = 60, nullable = false)
    private String concept;

    @NotNull(message = "es requerido")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Users user;

    public Long getCardpaymentrequestid() {
        return cardpaymentrequestid;
    }

    public void setCardpaymentrequestid(Long cardpaymentrequestid) {
        this.cardpaymentrequestid = cardpaymentrequestid;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }

    private static final long serialVersionUID = 1L;
}
