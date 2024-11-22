package com.suitepagos.backend.models.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CardPaymentResponse")
public class CardPaymentResponse implements Serializable {

    @Id
    @Column(name = "idicr")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idicr;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "success")
    private String success;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "message")
    private String message;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "id2")
    private String id;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "code")
    private String code;

    // @NotNull(message="no puede estar vacio")
    @Column(name = "reference")
    private String reference;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "voucher", length = 65555)
    private String voucher;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "ordernumber")
    private String ordernumber;

    // @NotNull(message="no puede estar vacio")
    @Column(name = "sequence")
    private String sequence;

    // @NotNull(message="no puede estar vacio")
    @Column(name = "approval")
    private String approval;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "lote")
    private String lote;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "responsecode")
    private String responsecode;

    // @NotNull(message="no puede estar vacio")
    @Column(name = "deferred")
    private String deferred;

    // @NotNull(message ="no puede estar vacio")
    @Column(name = "datetime")
    private String datetime;

    // @NotNull(message="no puede estar vacio")
    @Column(name = "amount")
    private String amount;

    // @NotNull(message="no puede estar vacio")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private CardPayment icid;

    public Long getIdicr() {
        return idicr;
    }

    public void setIdicr(Long idicr) {
        this.idicr = idicr;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    public String getDeferred() {
        return deferred;
    }

    public void setDeferred(String deferred) {
        this.deferred = deferred;
    }
    
    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public CardPayment getIcid() {
        return icid;
    }

    public void setIcid(CardPayment icid) {
        this.icid = icid;
    }

    private static final long serialVersionUID = 1L;
}
