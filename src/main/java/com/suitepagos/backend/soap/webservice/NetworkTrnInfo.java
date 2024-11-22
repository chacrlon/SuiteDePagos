
package com.suitepagos.backend.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NetworkTrnInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NetworkTrnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionConsecutive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}datePattern" minOccurs="0"/>
 *         &lt;element name="TransactionTime" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}timePattern" minOccurs="0"/>
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationExecIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfiguredTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTrnInfo", propOrder = {
    "transactionConsecutive",
    "registerNumber",
    "originatorName",
    "operationType",
    "transactionType",
    "transactionCode",
    "transactionDate",
    "transactionTime",
    "bankId",
    "agencyCode",
    "channelId",
    "channelUserId",
    "operationExecIndicator",
    "configuredTransactionCode",
    "desc",
    "userId",
    "userType"
})
public class NetworkTrnInfo {

    @XmlElement(name = "TransactionConsecutive")
    protected String transactionConsecutive;
    @XmlElement(name = "RegisterNumber")
    protected String registerNumber;
    @XmlElement(name = "OriginatorName")
    protected String originatorName;
    @XmlElement(name = "OperationType")
    protected String operationType;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "TransactionDate")
    protected String transactionDate;
    @XmlElement(name = "TransactionTime")
    protected String transactionTime;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "ChannelId")
    protected String channelId;
    @XmlElement(name = "ChannelUserId")
    protected String channelUserId;
    @XmlElement(name = "OperationExecIndicator")
    protected String operationExecIndicator;
    @XmlElement(name = "ConfiguredTransactionCode")
    protected String configuredTransactionCode;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "UserType")
    protected String userType;

    /**
     * Obtiene el valor de la propiedad transactionConsecutive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionConsecutive() {
        return transactionConsecutive;
    }

    /**
     * Define el valor de la propiedad transactionConsecutive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionConsecutive(String value) {
        this.transactionConsecutive = value;
    }

    /**
     * Obtiene el valor de la propiedad registerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Define el valor de la propiedad registerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNumber(String value) {
        this.registerNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad originatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorName() {
        return originatorName;
    }

    /**
     * Define el valor de la propiedad originatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorName(String value) {
        this.originatorName = value;
    }

    /**
     * Obtiene el valor de la propiedad operationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Define el valor de la propiedad operationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Define el valor de la propiedad transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Define el valor de la propiedad transactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Define el valor de la propiedad transactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * Define el valor de la propiedad transactionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTime(String value) {
        this.transactionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad bankId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Define el valor de la propiedad bankId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Obtiene el valor de la propiedad agencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Define el valor de la propiedad agencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Obtiene el valor de la propiedad channelUserId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelUserId() {
        return channelUserId;
    }

    /**
     * Define el valor de la propiedad channelUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelUserId(String value) {
        this.channelUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad operationExecIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationExecIndicator() {
        return operationExecIndicator;
    }

    /**
     * Define el valor de la propiedad operationExecIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationExecIndicator(String value) {
        this.operationExecIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad configuredTransactionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredTransactionCode() {
        return configuredTransactionCode;
    }

    /**
     * Define el valor de la propiedad configuredTransactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredTransactionCode(String value) {
        this.configuredTransactionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Obtiene el valor de la propiedad userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Define el valor de la propiedad userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
