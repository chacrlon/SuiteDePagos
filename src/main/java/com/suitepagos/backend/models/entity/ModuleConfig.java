package com.suitepagos.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ModuleConfig")
public class ModuleConfig implements Serializable {

    @Id
    @Column(name = "moduleid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moduleid;

    @NotEmpty(message = "no puede estar vacio")
    @Column(name = "name", unique = true)
    private String name;

    public Long getModuleid() {
        return moduleid;
    }

    public void setModuleid(Long moduleid) {
        this.moduleid = moduleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static final long serialVersionUID = 1L;
}
