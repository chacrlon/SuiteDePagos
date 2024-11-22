
package com.suitepagos.backend.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgRqHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}MsgRqHdr"/>
 *         &lt;element name="NaturalCustomer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PersonInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GovIssueIdent" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Account" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgRqHdr",
    "naturalCustomer",
    "account"
})
@XmlRootElement(name = "readCustomerData_Rq", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
public class ReadCustomerDataRqNatural {

    @XmlElement(name = "MsgRqHdr", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc", required = true)
    protected MsgRqHdr msgRqHdr;
    @XmlElement(name = "NaturalCustomer", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
    protected ReadCustomerDataRqNatural.NaturalCustomer naturalCustomer;
    @XmlElement(name = "Account", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
    protected ReadCustomerDataRqNatural.Account account;

    /**
     * Obtiene el valor de la propiedad msgRqHdr.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdr }
     *     
     */
    public MsgRqHdr getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Define el valor de la propiedad msgRqHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdr }
     *     
     */
    public void setMsgRqHdr(MsgRqHdr value) {
        this.msgRqHdr = value;
    }

    /**
     * Obtiene el valor de la propiedad naturalCustomer.
     * 
     * @return
     *     possible object is
     *     {@link ReadCustomerDataRq.NaturalCustomer }
     *     
     */
    public ReadCustomerDataRqNatural.NaturalCustomer getNaturalCustomer() {
        return naturalCustomer;
    }

    /**
     * Define el valor de la propiedad naturalCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCustomerDataRq.NaturalCustomer }
     *     
     */
    public void setNaturalCustomer(ReadCustomerDataRqNatural.NaturalCustomer value) {
        this.naturalCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link ReadCustomerDataRq.Account }
     *     
     */
    public ReadCustomerDataRqNatural.Account getAccount() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCustomerDataRq.Account }
     *     
     */
    public void setAccount(ReadCustomerDataRqNatural.Account value) {
        this.account = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acctId"
    })
    public static class Account {

        @XmlElement(name = "AcctId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected String acctId;

        /**
         * Obtiene el valor de la propiedad acctId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctId() {
            return acctId;
        }

        /**
         * Define el valor de la propiedad acctId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctId(String value) {
            this.acctId = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PersonInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GovIssueIdent" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custInfo"
    })
    public static class NaturalCustomer {

        @XmlElement(name = "CustInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRqNatural.NaturalCustomer.CustInfo custInfo;

        /**
         * Obtiene el valor de la propiedad custInfo.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRq.NaturalCustomer.CustInfo }
         *     
         */
        public ReadCustomerDataRqNatural.NaturalCustomer.CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Define el valor de la propiedad custInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRq.NaturalCustomer.CustInfo }
         *     
         */
        public void setCustInfo(ReadCustomerDataRqNatural.NaturalCustomer.CustInfo value) {
            this.custInfo = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PersonInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GovIssueIdent" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "personInfo"
        })
        public static class CustInfo {

            @XmlElement(name = "PersonInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo personInfo;

            /**
             * Obtiene el valor de la propiedad personInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRq.NaturalCustomer.CustInfo.PersonInfo }
             *     
             */
            public ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo getPersonInfo() {
                return personInfo;
            }

            /**
             * Define el valor de la propiedad personInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRq.NaturalCustomer.CustInfo.PersonInfo }
             *     
             */
            public void setPersonInfo(ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo value) {
                this.personInfo = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="GovIssueIdent" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "govIssueIdent"
            })
            public static class PersonInfo {

                @XmlElement(name = "GovIssueIdent", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent govIssueIdent;

                /**
                 * Obtiene el valor de la propiedad govIssueIdent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRq.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent }
                 *     
                 */
                public ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent getGovIssueIdent() {
                    return govIssueIdent;
                }

                /**
                 * Define el valor de la propiedad govIssueIdent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRq.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent }
                 *     
                 */
                public void setGovIssueIdent(ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent value) {
                    this.govIssueIdent = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "identSerialNumPrefix",
                    "identSerialNum"
                })
                public static class GovIssueIdent {

                    @XmlElement(name = "IdentSerialNumPrefix", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String identSerialNumPrefix;
                    @XmlElement(name = "IdentSerialNum", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String identSerialNum;

                    /**
                     * Obtiene el valor de la propiedad identSerialNumPrefix.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentSerialNumPrefix() {
                        return identSerialNumPrefix;
                    }

                    /**
                     * Define el valor de la propiedad identSerialNumPrefix.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentSerialNumPrefix(String value) {
                        this.identSerialNumPrefix = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad identSerialNum.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentSerialNum() {
                        return identSerialNum;
                    }

                    /**
                     * Define el valor de la propiedad identSerialNum.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentSerialNum(String value) {
                        this.identSerialNum = value;
                    }

                }

            }

        }

    }

}
