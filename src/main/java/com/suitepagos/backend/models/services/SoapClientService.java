package com.suitepagos.backend.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqLegal;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqNatural;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRsLegal;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRsNatural;


@Service
public class SoapClientService {
    
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public ReadCustomerDataRsNatural getNaturalClient(ReadCustomerDataRqNatural request) {
        template = new WebServiceTemplate(marshaller);
        ReadCustomerDataRsNatural readCustomerDataRsNatural = (ReadCustomerDataRsNatural) template.marshalSendAndReceive("http://10.135.5.29:8001/APINaturalCustomerOutAppSvc/proxy/APINaturalCustomerOutAppSvc",
                request);
        return readCustomerDataRsNatural;
    }
    
    public ReadCustomerDataRsLegal getLegalClient(ReadCustomerDataRqLegal request) {
        template = new WebServiceTemplate(marshaller);
        ReadCustomerDataRsLegal readCustomerDataRsLegal = (ReadCustomerDataRsLegal) template.marshalSendAndReceive("http://10.135.5.29:8001/APILegalCustomerOutAppSvc/proxy/APILegalCustomerOutAppSvc",
                request);
        return readCustomerDataRsLegal;
    }
    
}
