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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "credentialCardPayment")
public class CredentialCardPayment implements Serializable {

    @Id
    @Column(name = "credentialid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long credentialid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "keyid", length = 50, unique = true)
    private String keyid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "publickey", length = 50, unique = true)
    private String publickey;

    @Column(name = "createdat")
    private String createdat;

    @Column(name = "modifiedat")
    private String modifiedat;
    
    @NotNull(message = "no puede estar vacio")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companyid")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Company company;

    public Long getCredentialid() {
        return credentialid;
    }

    public void setCredentialid(Long credentialid) {
        this.credentialid = credentialid;
    }

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
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
