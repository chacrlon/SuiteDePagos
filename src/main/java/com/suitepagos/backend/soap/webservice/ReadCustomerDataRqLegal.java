
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
 *         &lt;element name="LegalCustomer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Organization" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OrgInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TINInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "legalCustomer",
    "account"
})
@XmlRootElement(name = "readCustomerData_Rq", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
public class ReadCustomerDataRqLegal {

    @XmlElement(name = "MsgRqHdr", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc", required = true)
    protected MsgRqHdr msgRqHdr;
    @XmlElement(name = "LegalCustomer", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
    protected ReadCustomerDataRqLegal.LegalCustomer legalCustomer;
    @XmlElement(name = "Account", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
    protected ReadCustomerDataRqLegal.Account account;

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
     * Obtiene el valor de la propiedad legalCustomer.
     * 
     * @return
     *     possible object is
     *     {@link ReadCustomerDataRqLegal.LegalCustomer }
     *     
     */
    public ReadCustomerDataRqLegal.LegalCustomer getLegalCustomer() {
        return legalCustomer;
    }

    /**
     * Define el valor de la propiedad legalCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCustomerDataRqLegal.LegalCustomer }
     *     
     */
    public void setLegalCustomer(ReadCustomerDataRqLegal.LegalCustomer value) {
        this.legalCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link ReadCustomerDataRqLegal.Account }
     *     
     */
    public ReadCustomerDataRqLegal.Account getAccount() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCustomerDataRqLegal.Account }
     *     
     */
    public void setAccount(ReadCustomerDataRqLegal.Account value) {
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

        @XmlElement(name = "AcctId", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
     *         &lt;element name="Organization" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OrgInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TINInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "organization"
    })
    public static class LegalCustomer {

        @XmlElement(name = "Organization", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRqLegal.LegalCustomer.Organization organization;

        /**
         * Obtiene el valor de la propiedad organization.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRqLegal.LegalCustomer.Organization }
         *     
         */
        public ReadCustomerDataRqLegal.LegalCustomer.Organization getOrganization() {
            return organization;
        }

        /**
         * Define el valor de la propiedad organization.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRqLegal.LegalCustomer.Organization }
         *     
         */
        public void setOrganization(ReadCustomerDataRqLegal.LegalCustomer.Organization value) {
            this.organization = value;
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
         *         &lt;element name="OrgInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TINInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "orgInfo"
        })
        public static class Organization {

            @XmlElement(name = "OrgInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo orgInfo;

            /**
             * Obtiene el valor de la propiedad orgInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo }
             *     
             */
            public ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo getOrgInfo() {
                return orgInfo;
            }

            /**
             * Define el valor de la propiedad orgInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo }
             *     
             */
            public void setOrgInfo(ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo value) {
                this.orgInfo = value;
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
             *         &lt;element name="TINInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "tinInfo"
            })
            public static class OrgInfo {

                @XmlElement(name = "TINInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo.TINInfo tinInfo;

                /**
                 * Obtiene el valor de la propiedad tinInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo.TINInfo }
                 *     
                 */
                public ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo.TINInfo getTINInfo() {
                    return tinInfo;
                }

                /**
                 * Define el valor de la propiedad tinInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo.TINInfo }
                 *     
                 */
                public void setTINInfo(ReadCustomerDataRqLegal.LegalCustomer.Organization.OrgInfo.TINInfo value) {
                    this.tinInfo = value;
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
                 *         &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "taxIdPrefix",
                    "taxId"
                })
                public static class TINInfo {

                    @XmlElement(name = "TaxIdPrefix", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String taxIdPrefix;
                    @XmlElement(name = "TaxId", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String taxId;

                    /**
                     * Obtiene el valor de la propiedad taxIdPrefix.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxIdPrefix() {
                        return taxIdPrefix;
                    }

                    /**
                     * Define el valor de la propiedad taxIdPrefix.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxIdPrefix(String value) {
                        this.taxIdPrefix = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxId() {
                        return taxId;
                    }

                    /**
                     * Define el valor de la propiedad taxId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxId(String value) {
                        this.taxId = value;
                    }

                }

            }

        }

    }

}
