
package com.suitepagos.backend.soap.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MsgRsHdr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MsgRsHdr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrivateChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalStatusRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountDataOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderTypeReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailTypeReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupervisorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionConsecutive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedOperationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageDate" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}datePattern" minOccurs="0"/>
 *         &lt;element name="TransactionTime" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}timePattern" minOccurs="0"/>
 *         &lt;element name="LastStatusRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageTime" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}timePattern" minOccurs="0"/>
 *         &lt;element name="TransacctionDate" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}datePattern" minOccurs="0"/>
 *         &lt;element name="RequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRsHdr", namespace = "http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr", propOrder = {
    "privateChannelId",
    "finalStatusRequest",
    "countDataOut",
    "headerTypeReg",
    "detailTypeReg",
    "transactionCode",
    "supervisorCode",
    "operationType",
    "transactionConsecutive",
    "detailReg",
    "registerNumber",
    "transactionType",
    "requestId",
    "requestedOperationType",
    "messageDate",
    "transactionTime",
    "lastStatusRequest",
    "returnValue",
    "requestStatus",
    "messageTime",
    "transacctionDate",
    "requestNumber",
    "appName"
})
public class MsgRsHdr {

    @XmlElement(name = "PrivateChannelId")
    protected String privateChannelId;
    @XmlElement(name = "FinalStatusRequest")
    protected String finalStatusRequest;
    @XmlElement(name = "CountDataOut")
    protected String countDataOut;
    @XmlElement(name = "HeaderTypeReg")
    protected String headerTypeReg;
    @XmlElement(name = "DetailTypeReg")
    protected String detailTypeReg;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "SupervisorCode")
    protected String supervisorCode;
    @XmlElement(name = "OperationType")
    protected String operationType;
    @XmlElement(name = "TransactionConsecutive")
    protected String transactionConsecutive;
    @XmlElement(name = "DetailReg")
    protected String detailReg;
    @XmlElement(name = "RegisterNumber")
    protected List<String> registerNumber;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "RequestedOperationType")
    protected String requestedOperationType;
    @XmlElement(name = "MessageDate")
    protected String messageDate;
    @XmlElement(name = "TransactionTime")
    protected String transactionTime;
    @XmlElement(name = "LastStatusRequest")
    protected String lastStatusRequest;
    @XmlElement(name = "ReturnValue")
    protected String returnValue;
    @XmlElement(name = "RequestStatus")
    protected String requestStatus;
    @XmlElement(name = "MessageTime")
    protected String messageTime;
    @XmlElement(name = "TransacctionDate")
    protected String transacctionDate;
    @XmlElement(name = "RequestNumber")
    protected String requestNumber;
    @XmlElement(name = "AppName")
    protected String appName;

    /**
     * Obtiene el valor de la propiedad privateChannelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateChannelId() {
        return privateChannelId;
    }

    /**
     * Define el valor de la propiedad privateChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateChannelId(String value) {
        this.privateChannelId = value;
    }

    /**
     * Obtiene el valor de la propiedad finalStatusRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalStatusRequest() {
        return finalStatusRequest;
    }

    /**
     * Define el valor de la propiedad finalStatusRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalStatusRequest(String value) {
        this.finalStatusRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad countDataOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountDataOut() {
        return countDataOut;
    }

    /**
     * Define el valor de la propiedad countDataOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountDataOut(String value) {
        this.countDataOut = value;
    }

    /**
     * Obtiene el valor de la propiedad headerTypeReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderTypeReg() {
        return headerTypeReg;
    }

    /**
     * Define el valor de la propiedad headerTypeReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderTypeReg(String value) {
        this.headerTypeReg = value;
    }

    /**
     * Obtiene el valor de la propiedad detailTypeReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailTypeReg() {
        return detailTypeReg;
    }

    /**
     * Define el valor de la propiedad detailTypeReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailTypeReg(String value) {
        this.detailTypeReg = value;
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
     * Obtiene el valor de la propiedad supervisorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorCode() {
        return supervisorCode;
    }

    /**
     * Define el valor de la propiedad supervisorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorCode(String value) {
        this.supervisorCode = value;
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
     * Obtiene el valor de la propiedad detailReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailReg() {
        return detailReg;
    }

    /**
     * Define el valor de la propiedad detailReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailReg(String value) {
        this.detailReg = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegisterNumber() {
        if (registerNumber == null) {
            registerNumber = new ArrayList<String>();
        }
        return this.registerNumber;
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
     * Obtiene el valor de la propiedad requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Define el valor de la propiedad requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedOperationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedOperationType() {
        return requestedOperationType;
    }

    /**
     * Define el valor de la propiedad requestedOperationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedOperationType(String value) {
        this.requestedOperationType = value;
    }

    /**
     * Obtiene el valor de la propiedad messageDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDate() {
        return messageDate;
    }

    /**
     * Define el valor de la propiedad messageDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDate(String value) {
        this.messageDate = value;
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
     * Obtiene el valor de la propiedad lastStatusRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatusRequest() {
        return lastStatusRequest;
    }

    /**
     * Define el valor de la propiedad lastStatusRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStatusRequest(String value) {
        this.lastStatusRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad returnValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnValue() {
        return returnValue;
    }

    /**
     * Define el valor de la propiedad returnValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnValue(String value) {
        this.returnValue = value;
    }

    /**
     * Obtiene el valor de la propiedad requestStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Define el valor de la propiedad requestStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStatus(String value) {
        this.requestStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad messageTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTime() {
        return messageTime;
    }

    /**
     * Define el valor de la propiedad messageTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTime(String value) {
        this.messageTime = value;
    }

    /**
     * Obtiene el valor de la propiedad transacctionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacctionDate() {
        return transacctionDate;
    }

    /**
     * Define el valor de la propiedad transacctionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacctionDate(String value) {
        this.transacctionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad requestNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /**
     * Define el valor de la propiedad requestNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestNumber(String value) {
        this.requestNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad appName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Define el valor de la propiedad appName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

}
