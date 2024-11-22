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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "credential_P2P")
public class CredentialP2P implements Serializable {

    @Id
    @Column(name = "credentialid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long credentialid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "clientid", length = 50, unique = true)
    private String clientid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "clientsecret", length = 50, unique = true)
    private String clientsecret;

    @Column(name = "createdat")
    private String createdat;

    @Column(name = "modifiedat")
    private String modifiedat;

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

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientsecret() {
        return clientsecret;
    }

    public void setClientsecret(String clientsecret) {
        this.clientsecret = clientsecret;
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