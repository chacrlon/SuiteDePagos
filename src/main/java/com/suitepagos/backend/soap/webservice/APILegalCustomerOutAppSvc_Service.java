
package com.suitepagos.backend.soap.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "APILegalCustomerOutAppSvc", targetNamespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc", wsdlLocation = "http://10.135.5.29:8001/APILegalCustomerOutAppSvc/proxy/APILegalCustomerOutAppSvc?wsdl")
public class APILegalCustomerOutAppSvc_Service
    extends Service
{

    private final static URL APILEGALCUSTOMEROUTAPPSVC_WSDL_LOCATION;
    private final static WebServiceException APILEGALCUSTOMEROUTAPPSVC_EXCEPTION;
    private final static QName APILEGALCUSTOMEROUTAPPSVC_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc", "APILegalCustomerOutAppSvc");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.135.5.29:8001/APILegalCustomerOutAppSvc/proxy/APILegalCustomerOutAppSvc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APILEGALCUSTOMEROUTAPPSVC_WSDL_LOCATION = url;
        APILEGALCUSTOMEROUTAPPSVC_EXCEPTION = e;
    }

    public APILegalCustomerOutAppSvc_Service() {
        super(__getWsdlLocation(), APILEGALCUSTOMEROUTAPPSVC_QNAME);
    }

    public APILegalCustomerOutAppSvc_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), APILEGALCUSTOMEROUTAPPSVC_QNAME, features);
    }

    public APILegalCustomerOutAppSvc_Service(URL wsdlLocation) {
        super(wsdlLocation, APILEGALCUSTOMEROUTAPPSVC_QNAME);
    }

    public APILegalCustomerOutAppSvc_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APILEGALCUSTOMEROUTAPPSVC_QNAME, features);
    }

    public APILegalCustomerOutAppSvc_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public APILegalCustomerOutAppSvc_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns APILegalCustomerOutAppSvc
     */
    @WebEndpoint(name = "APILegalCustomerOutAppSvcSOAP")
    public APILegalCustomerOutAppSvc getAPILegalCustomerOutAppSvcSOAP() {
        return super.getPort(new QName("http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc", "APILegalCustomerOutAppSvcSOAP"), APILegalCustomerOutAppSvc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns APILegalCustomerOutAppSvc
     */
    @WebEndpoint(name = "APILegalCustomerOutAppSvcSOAP")
    public APILegalCustomerOutAppSvc getAPILegalCustomerOutAppSvcSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc", "APILegalCustomerOutAppSvcSOAP"), APILegalCustomerOutAppSvc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APILEGALCUSTOMEROUTAPPSVC_EXCEPTION!= null) {
            throw APILEGALCUSTOMEROUTAPPSVC_EXCEPTION;
        }
        return APILEGALCUSTOMEROUTAPPSVC_WSDL_LOCATION;
    }

}
