
package com.suitepagos.backend.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VBProtocol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VBProtocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VBProtocolInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VBProtocol", propOrder = {
    "vbProtocolInd",
    "transactionInd"
})
public class VBProtocol {

    @XmlElement(name = "VBProtocolInd", defaultValue = "false")
    protected Boolean vbProtocolInd;
    @XmlElement(name = "TransactionInd", defaultValue = "false")
    protected Boolean transactionInd;

    /**
     * Obtiene el valor de la propiedad vbProtocolInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVBProtocolInd() {
        return vbProtocolInd;
    }

    /**
     * Define el valor de la propiedad vbProtocolInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVBProtocolInd(Boolean value) {
        this.vbProtocolInd = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactionInd() {
        return transactionInd;
    }

    /**
     * Define el valor de la propiedad transactionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactionInd(Boolean value) {
        this.transactionInd = value;
    }

}
