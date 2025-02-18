
package com.suitepagos.backend.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RecCtrlIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RecCtrlIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecCtrlIn", propOrder = {
    "maxRec"
})
public class RecCtrlIn {

    @XmlElement(name = "MaxRec")
    protected String maxRec;

    /**
     * Obtiene el valor de la propiedad maxRec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRec() {
        return maxRec;
    }

    /**
     * Define el valor de la propiedad maxRec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRec(String value) {
        this.maxRec = value;
    }

}
