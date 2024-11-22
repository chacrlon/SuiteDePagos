package com.suitepagos.backend.models.entity;

import java.io.Serializable;

public class DataRqNatural implements Serializable {
        
    private String identSerialNumPrefix;
    private String identSerialNum;

    public String getIdentSerialNumPrefix() {
        return identSerialNumPrefix;
    }

    public String getIdentSerialNum() {
        return identSerialNum;
    }

}
