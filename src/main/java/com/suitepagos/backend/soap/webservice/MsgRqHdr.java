
package com.suitepagos.backend.soap.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MsgRqHdr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageDate" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}datePattern" minOccurs="0"/>
 *         &lt;element name="MessageTime" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}timePattern" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastStatusRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalStatusRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResumeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReverseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupervisorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedOperationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkTrnInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}NetworkTrnInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicantData" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}ApplicantData" minOccurs="0"/>
 *         &lt;element name="RecCtrlIn" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}RecCtrlIn" minOccurs="0"/>
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VBProtocol" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}VBProtocol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRqHdr", propOrder = {
    "messageDate",
    "messageTime",
    "requestId",
    "lastStatusRequest",
    "finalStatusRequest",
    "resumeId",
    "reverseId",
    "lineId",
    "sourceChannelCode",
    "supervisorCode",
    "operatorCode",
    "requestedOperationType",
    "networkTrnInfo",
    "applicantData",
    "recCtrlIn",
    "returnValue",
    "messageId",
    "priority",
    "vbProtocol"
})
public class MsgRqHdr {

    @XmlElement(name = "MessageDate")
    protected String messageDate;
    @XmlElement(name = "MessageTime")
    protected String messageTime;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "LastStatusRequest")
    protected String lastStatusRequest;
    @XmlElement(name = "FinalStatusRequest")
    protected String finalStatusRequest;
    @XmlElement(name = "ResumeId")
    protected String resumeId;
    @XmlElement(name = "ReverseId")
    protected String reverseId;
    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "SourceChannelCode")
    protected String sourceChannelCode;
    @XmlElement(name = "SupervisorCode")
    protected String supervisorCode;
    @XmlElement(name = "OperatorCode")
    protected String operatorCode;
    @XmlElement(name = "RequestedOperationType")
    protected String requestedOperationType;
    @XmlElement(name = "NetworkTrnInfo")
    //protected List<NetworkTrnInfo> networkTrnInfo;
    protected NetworkTrnInfo networkTrnInfo; /***** ERIKSON - old List<> *****/
    @XmlElement(name = "ApplicantData")
    protected ApplicantData applicantData;
    @XmlElement(name = "RecCtrlIn")
    protected RecCtrlIn recCtrlIn;
    @XmlElement(name = "ReturnValue")
    protected String returnValue;
    @XmlElement(name = "MessageId")
    protected String messageId;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "VBProtocol")
    protected VBProtocol vbProtocol;

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
     * Obtiene el valor de la propiedad resumeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumeId() {
        return resumeId;
    }

    /**
     * Define el valor de la propiedad resumeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumeId(String value) {
        this.resumeId = value;
    }

    /**
     * Obtiene el valor de la propiedad reverseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseId() {
        return reverseId;
    }

    /**
     * Define el valor de la propiedad reverseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseId(String value) {
        this.reverseId = value;
    }

    /**
     * Obtiene el valor de la propiedad lineId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Define el valor de la propiedad lineId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceChannelCode() {
        return sourceChannelCode;
    }

    /**
     * Define el valor de la propiedad sourceChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceChannelCode(String value) {
        this.sourceChannelCode = value;
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
     * Obtiene el valor de la propiedad operatorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Define el valor de la propiedad operatorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
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

    /***** ERIKSON *****/
    /**
     * Gets the value of the networkTrnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkTrnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkTrnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkTrnInfo }
     * 
     * 
     */
    public NetworkTrnInfo getNetworkTrnInfo() {
        if (networkTrnInfo == null) {
            networkTrnInfo = new NetworkTrnInfo();
        }
        return this.networkTrnInfo;
    }

    /**
     * Define el valor de la propiedad networkTrnInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTrnInfo }
     *     
     */
    public void setNetworkTrnInfo(NetworkTrnInfo value) {
        this.networkTrnInfo = value;
    }
    /***** ERIKSON *****/

    /**
     * Obtiene el valor de la propiedad applicantData.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantData }
     *     
     */
    public ApplicantData getApplicantData() {
        return applicantData;
    }

    /**
     * Define el valor de la propiedad applicantData.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantData }
     *     
     */
    public void setApplicantData(ApplicantData value) {
        this.applicantData = value;
    }

    /**
     * Obtiene el valor de la propiedad recCtrlIn.
     * 
     * @return
     *     possible object is
     *     {@link RecCtrlIn }
     *     
     */
    public RecCtrlIn getRecCtrlIn() {
        return recCtrlIn;
    }

    /**
     * Define el valor de la propiedad recCtrlIn.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCtrlIn }
     *     
     */
    public void setRecCtrlIn(RecCtrlIn value) {
        this.recCtrlIn = value;
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
     * Obtiene el valor de la propiedad messageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Define el valor de la propiedad messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Obtiene el valor de la propiedad vbProtocol.
     * 
     * @return
     *     possible object is
     *     {@link VBProtocol }
     *     
     */
    public VBProtocol getVBProtocol() {
        return vbProtocol;
    }

    /**
     * Define el valor de la propiedad vbProtocol.
     * 
     * @param value
     *     allowed object is
     *     {@link VBProtocol }
     *     
     */
    public void setVBProtocol(VBProtocol value) {
        this.vbProtocol = value;
    }

}
