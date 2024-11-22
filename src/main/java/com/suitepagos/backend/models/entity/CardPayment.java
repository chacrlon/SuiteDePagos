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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cardPayment")
public class CardPayment implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Digits(integer = 10, fraction = 2, message = "Max: 10 enteros y 2 decimales")
    @NotNull(message = "No puede ser vacio")
    @Positive(message = "No puede ser negativo")
    @Column(name = "amount")
    private String Amount;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 255, message = "El campo no puede superar los 255 caracteres")
    @Column(name = "description", length = 255)
    private String Description;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 60, message = "El campo no puede superar los 60 caracteres")
    @Column(name = "cardholder", length = 60)
    private String CardHolder;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 15, message = "El campo no puede superar los 15 caracteres")
    @Column(name = "cardholderid", length = 15)
    private String CardHolderID;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 200, message = "El campo no puede superar los 16 caracteres")
    @Column(name = "cardnumber", length = 16)
    private String CardNumber;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 3, message = "El campo no puede superar los 3 caracteres")
    @Column(name = "cvc", length = 3)
    private String CVC;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 7, message = "El campo no puede superar los 7 caracteres")
    @Column(name = "expirationdate", length = 7)
    private String ExpirationDate;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 1, message = "El campo solo puede ser 1 o 0")
    @Column(name = "statusid", length = 1)
    private String StatusId;

    @NotEmpty(message = "No puede ser vacio")
    @Size(max = 255, message = "El campo no puede superar los 255 caracteres")
    @Column(name = "ip", length = 255)
    private String IP;

    @Size(max = 255, message = "El campo no puede superar los 255 caracteres")
    @Column(name = "ordernumber", length = 255)
    private String OrderNumber;

    @Size(max = 255, message = "El campo no puede superar los 255 caracteres")
    @Column(name = "address", length = 255)
    private String Address;

    @Size(max = 50, message = "El campo no puede superar los 50 caracteres")
    @Column(name = "city", length = 50)
    private String City;

    @Size(max = 8, message = "El campo no puede superar los 8 caracteres")
    @Column(name = "zipcode", length = 8)
    private String ZipCode;

    @Size(max = 50, message = "El campo no puede superar los 50 caracteres")
    @Column(name = "state", length = 50)
    private String State;

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

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCardHolder() {
        return CardHolder;
    }

    public void setCardHolder(String cardHolder) {
        CardHolder = cardHolder;
    }

    public String getCardHolderID() {
        return CardHolderID;
    }

    public void setCardHolderID(String cardHolderID) {
        CardHolderID = cardHolderID;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getCVC() {
        return CVC;
    }

    public void setCVC(String cVC) {
        CVC = cVC;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getStatusId() {
        return StatusId;
    }

    public void setStatusId(String statusId) {
        StatusId = statusId;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String iP) {
        IP = iP;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    private static final long serialVersionUID = 1L;
}
