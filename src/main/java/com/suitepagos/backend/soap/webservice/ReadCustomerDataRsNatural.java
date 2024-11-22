
package com.suitepagos.backend.soap.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="MsgRsHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}MsgRsHdr"/>
 *         &lt;element name="Status" type="{http://xmlns.banesco.com/EnterpriseObjects/Status}Status" minOccurs="0"/>
 *         &lt;element name="NaturalCustomer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmployeeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExecutiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SvcReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DeclineInfoReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustStatus" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustId" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ContactInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PhoneUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="EmailUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="EmailStatus" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="PersonInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BirthDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ResidenceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EduBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Dependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SonsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PersonName" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="LastSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OtherIdentDoc" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="GovIssueIdent" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="GovIssueIdentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="InmigrationInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PermanenceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="NationalizationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="EmploymentData" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OccupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StartDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EmploymentCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OrgInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CustId" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="Income" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LastIncomeDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ExtraIncome" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="IncomeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ExtIncomeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PensionerInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RetiredInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EmployInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExtIncomeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Addr" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AddrCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AddrSubCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StateProvCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Parish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StreetType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BuildingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LevelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostmanRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PhoneNum" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AddrUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FinancialInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EconActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreditCardCustQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BankCustQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Risk" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RiskInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="CustVerificationList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ForeignTransfersInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PEPAssociatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PEPRelationshipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PEPInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WorkingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RegulatoryInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AcctUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepositsInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DepositsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DepositsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="WithdrawalsInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="WithdrawalsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WithdrawalsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ElecTransInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ElecTransQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ElecTransRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TransferInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TransferCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FundsSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CurrencyOpe" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="Product" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "msgRsHdr",
    "status",
    "naturalCustomer"
})
@XmlRootElement(name = "readCustomerData_Rs", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
public class ReadCustomerDataRsNatural {

    @XmlElement(name = "MsgRsHdr", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc", required = true)
    protected MsgRsHdr msgRsHdr;
    @XmlElement(name = "Status", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
    protected Status status;
    @XmlElement(name = "NaturalCustomer", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
    protected List<ReadCustomerDataRsNatural.NaturalCustomer> naturalCustomer;

    /**
     * Obtiene el valor de la propiedad msgRsHdr.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdr }
     *     
     */
    public MsgRsHdr getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Define el valor de la propiedad msgRsHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdr }
     *     
     */
    public void setMsgRsHdr(MsgRsHdr value) {
        this.msgRsHdr = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the naturalCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naturalCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaturalCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadCustomerDataRs.NaturalCustomer }
     * 
     * 
     */
    public List<ReadCustomerDataRsNatural.NaturalCustomer> getNaturalCustomer() {
        if (naturalCustomer == null) {
            naturalCustomer = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer>();
        }
        return this.naturalCustomer;
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
     *         &lt;element name="CustClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmployeeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExecutiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SvcReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DeclineInfoReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustStatus" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustId" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ContactInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PhoneUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="EmailUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="EmailStatus" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="PersonInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BirthDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ResidenceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EduBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Dependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SonsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PersonName" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="LastSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OtherIdentDoc" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="GovIssueIdent" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="GovIssueIdentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="InmigrationInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PermanenceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="NationalizationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="EmploymentData" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OccupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StartDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EmploymentCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OrgInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CustId" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="Income" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LastIncomeDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ExtraIncome" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="IncomeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ExtIncomeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PensionerInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RetiredInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EmployInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExtIncomeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Addr" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AddrCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AddrSubCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StateProvCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Parish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StreetType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BuildingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LevelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PostmanRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PhoneNum" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AddrUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FinancialInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EconActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditCardCustQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BankCustQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Risk" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RiskInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="CustVerificationList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ForeignTransfersInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PEPAssociatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PEPRelationshipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PEPInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WorkingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RegulatoryInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AcctUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepositsInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DepositsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DepositsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="WithdrawalsInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="WithdrawalsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WithdrawalsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ElecTransInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ElecTransQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ElecTransRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TransferInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TransferCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FundsSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CurrencyOpe" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="Product" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "custClass",
        "employeeInd",
        "executiveId",
        "svcReason",
        "declineInfoReason",
        "custStatus",
        "custId",
        "custInfo",
        "employmentData",
        "addr",
        "financialInfo",
        "risk",
        "custVerificationList",
        "regulatoryInfo",
        "product"
    })
    public static class NaturalCustomer {

        @XmlElement(name = "CustClass", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected String custClass;
        @XmlElement(name = "EmployeeInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected String employeeInd;
        @XmlElement(name = "ExecutiveId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected String executiveId;
        @XmlElement(name = "SvcReason", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected String svcReason;
        @XmlElement(name = "DeclineInfoReason", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected String declineInfoReason;
        @XmlElement(name = "CustStatus", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRsNatural.NaturalCustomer.CustStatus custStatus;
        @XmlElement(name = "CustId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsNatural.NaturalCustomer.CustId> custId;
        @XmlElement(name = "CustInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRsNatural.NaturalCustomer.CustInfo custInfo;
        @XmlElement(name = "EmploymentData", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData> employmentData;
        @XmlElement(name = "Addr", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsNatural.NaturalCustomer.Addr> addr;
        @XmlElement(name = "FinancialInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsNatural.NaturalCustomer.FinancialInfo> financialInfo;
        @XmlElement(name = "Risk", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRsNatural.NaturalCustomer.Risk risk;
        @XmlElement(name = "CustVerificationList", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRsNatural.NaturalCustomer.CustVerificationList custVerificationList;
        @XmlElement(name = "RegulatoryInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo regulatoryInfo;
        @XmlElement(name = "Product", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
        protected ReadCustomerDataRsNatural.NaturalCustomer.Product product;

        /**
         * Obtiene el valor de la propiedad custClass.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustClass() {
            return custClass;
        }

        /**
         * Define el valor de la propiedad custClass.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustClass(String value) {
            this.custClass = value;
        }

        /**
         * Obtiene el valor de la propiedad employeeInd.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeInd() {
            return employeeInd;
        }

        /**
         * Define el valor de la propiedad employeeInd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeInd(String value) {
            this.employeeInd = value;
        }

        /**
         * Obtiene el valor de la propiedad executiveId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecutiveId() {
            return executiveId;
        }

        /**
         * Define el valor de la propiedad executiveId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecutiveId(String value) {
            this.executiveId = value;
        }

        /**
         * Obtiene el valor de la propiedad svcReason.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSvcReason() {
            return svcReason;
        }

        /**
         * Define el valor de la propiedad svcReason.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSvcReason(String value) {
            this.svcReason = value;
        }

        /**
         * Obtiene el valor de la propiedad declineInfoReason.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclineInfoReason() {
            return declineInfoReason;
        }

        /**
         * Define el valor de la propiedad declineInfoReason.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclineInfoReason(String value) {
            this.declineInfoReason = value;
        }

        /**
         * Obtiene el valor de la propiedad custStatus.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustStatus }
         *     
         */
        public ReadCustomerDataRsNatural.NaturalCustomer.CustStatus getCustStatus() {
            return custStatus;
        }

        /**
         * Define el valor de la propiedad custStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustStatus }
         *     
         */
        public void setCustStatus(ReadCustomerDataRsNatural.NaturalCustomer.CustStatus value) {
            this.custStatus = value;
        }

        /**
         * Gets the value of the custId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadCustomerDataRsNatural.NaturalCustomer.CustId }
         * 
         * 
         */
        public List<ReadCustomerDataRsNatural.NaturalCustomer.CustId> getCustId() {
            if (custId == null) {
                custId = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.CustId>();
            }
            return this.custId;
        }

        /**
         * Obtiene el valor de la propiedad custInfo.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo }
         *     
         */
        public ReadCustomerDataRsNatural.NaturalCustomer.CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Define el valor de la propiedad custInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo }
         *     
         */
        public void setCustInfo(ReadCustomerDataRsNatural.NaturalCustomer.CustInfo value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the employmentData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employmentData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmploymentData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData }
         * 
         * 
         */
        public List<ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData> getEmploymentData() {
            if (employmentData == null) {
                employmentData = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData>();
            }
            return this.employmentData;
        }

        /**
         * Gets the value of the addr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadCustomerDataRsNatural.NaturalCustomer.Addr }
         * 
         * 
         */
        public List<ReadCustomerDataRsNatural.NaturalCustomer.Addr> getAddr() {
            if (addr == null) {
                addr = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.Addr>();
            }
            return this.addr;
        }

        /**
         * Gets the value of the financialInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the financialInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFinancialInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadCustomerDataRsNatural.NaturalCustomer.FinancialInfo }
         * 
         * 
         */
        public List<ReadCustomerDataRsNatural.NaturalCustomer.FinancialInfo> getFinancialInfo() {
            if (financialInfo == null) {
                financialInfo = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.FinancialInfo>();
            }
            return this.financialInfo;
        }

        /**
         * Obtiene el valor de la propiedad risk.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Risk }
         *     
         */
        public ReadCustomerDataRsNatural.NaturalCustomer.Risk getRisk() {
            return risk;
        }

        /**
         * Define el valor de la propiedad risk.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Risk }
         *     
         */
        public void setRisk(ReadCustomerDataRsNatural.NaturalCustomer.Risk value) {
            this.risk = value;
        }

        /**
         * Obtiene el valor de la propiedad custVerificationList.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustVerificationList }
         *     
         */
        public ReadCustomerDataRsNatural.NaturalCustomer.CustVerificationList getCustVerificationList() {
            return custVerificationList;
        }

        /**
         * Define el valor de la propiedad custVerificationList.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustVerificationList }
         *     
         */
        public void setCustVerificationList(ReadCustomerDataRsNatural.NaturalCustomer.CustVerificationList value) {
            this.custVerificationList = value;
        }

        /**
         * Obtiene el valor de la propiedad regulatoryInfo.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo }
         *     
         */
        public ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo getRegulatoryInfo() {
            return regulatoryInfo;
        }

        /**
         * Define el valor de la propiedad regulatoryInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo }
         *     
         */
        public void setRegulatoryInfo(ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo value) {
            this.regulatoryInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad product.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Product }
         *     
         */
        public ReadCustomerDataRsNatural.NaturalCustomer.Product getProduct() {
            return product;
        }

        /**
         * Define el valor de la propiedad product.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Product }
         *     
         */
        public void setProduct(ReadCustomerDataRsNatural.NaturalCustomer.Product value) {
            this.product = value;
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
         *         &lt;element name="AddrCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AddrSubCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StateProvCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Parish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StreetType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BuildingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LevelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PostmanRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PhoneNum" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AddrUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "addrCod",
            "addrSubCod",
            "addrType",
            "country",
            "stateProvCod",
            "stateProv",
            "city",
            "province",
            "parish",
            "postalCode",
            "streetType1",
            "street1",
            "buildingType",
            "building",
            "level",
            "levelDesc",
            "number",
            "sectorType",
            "sector",
            "pob",
            "postmanRoute",
            "houseCondition",
            "phoneNum",
            "addrUse",
            "countryCode"
        })
        public static class Addr {

            @XmlElement(name = "AddrCod", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String addrCod;
            @XmlElement(name = "AddrSubCod", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String addrSubCod;
            @XmlElement(name = "AddrType", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String addrType;
            @XmlElement(name = "Country", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String country;
            @XmlElement(name = "StateProvCod", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String stateProvCod;
            @XmlElement(name = "StateProv", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String stateProv;
            @XmlElement(name = "City", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String city;
            @XmlElement(name = "Province", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String province;
            @XmlElement(name = "Parish", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String parish;
            @XmlElement(name = "PostalCode", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String postalCode;
            @XmlElement(name = "StreetType1", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String streetType1;
            @XmlElement(name = "Street1", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String street1;
            @XmlElement(name = "BuildingType", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String buildingType;
            @XmlElement(name = "Building", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String building;
            @XmlElement(name = "Level", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String level;
            @XmlElement(name = "LevelDesc", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String levelDesc;
            @XmlElement(name = "Number", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String number;
            @XmlElement(name = "SectorType", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String sectorType;
            @XmlElement(name = "Sector", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String sector;
            @XmlElement(name = "P.O.B", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String pob;
            @XmlElement(name = "PostmanRoute", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String postmanRoute;
            @XmlElement(name = "HouseCondition", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String houseCondition;
            @XmlElement(name = "PhoneNum", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.Addr.PhoneNum phoneNum;
            @XmlElement(name = "AddrUse", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String addrUse;
            @XmlElement(name = "CountryCode", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String countryCode;

            /**
             * Obtiene el valor de la propiedad addrCod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddrCod() {
                return addrCod;
            }

            /**
             * Define el valor de la propiedad addrCod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddrCod(String value) {
                this.addrCod = value;
            }

            /**
             * Obtiene el valor de la propiedad addrSubCod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddrSubCod() {
                return addrSubCod;
            }

            /**
             * Define el valor de la propiedad addrSubCod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddrSubCod(String value) {
                this.addrSubCod = value;
            }

            /**
             * Obtiene el valor de la propiedad addrType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddrType() {
                return addrType;
            }

            /**
             * Define el valor de la propiedad addrType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddrType(String value) {
                this.addrType = value;
            }

            /**
             * Obtiene el valor de la propiedad country.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * Define el valor de la propiedad country.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * Obtiene el valor de la propiedad stateProvCod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateProvCod() {
                return stateProvCod;
            }

            /**
             * Define el valor de la propiedad stateProvCod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateProvCod(String value) {
                this.stateProvCod = value;
            }

            /**
             * Obtiene el valor de la propiedad stateProv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateProv() {
                return stateProv;
            }

            /**
             * Define el valor de la propiedad stateProv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateProv(String value) {
                this.stateProv = value;
            }

            /**
             * Obtiene el valor de la propiedad city.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Define el valor de la propiedad city.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Obtiene el valor de la propiedad province.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvince() {
                return province;
            }

            /**
             * Define el valor de la propiedad province.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvince(String value) {
                this.province = value;
            }

            /**
             * Obtiene el valor de la propiedad parish.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParish() {
                return parish;
            }

            /**
             * Define el valor de la propiedad parish.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParish(String value) {
                this.parish = value;
            }

            /**
             * Obtiene el valor de la propiedad postalCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Define el valor de la propiedad postalCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Obtiene el valor de la propiedad streetType1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetType1() {
                return streetType1;
            }

            /**
             * Define el valor de la propiedad streetType1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetType1(String value) {
                this.streetType1 = value;
            }

            /**
             * Obtiene el valor de la propiedad street1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreet1() {
                return street1;
            }

            /**
             * Define el valor de la propiedad street1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreet1(String value) {
                this.street1 = value;
            }

            /**
             * Obtiene el valor de la propiedad buildingType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildingType() {
                return buildingType;
            }

            /**
             * Define el valor de la propiedad buildingType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildingType(String value) {
                this.buildingType = value;
            }

            /**
             * Obtiene el valor de la propiedad building.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuilding() {
                return building;
            }

            /**
             * Define el valor de la propiedad building.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuilding(String value) {
                this.building = value;
            }

            /**
             * Obtiene el valor de la propiedad level.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLevel() {
                return level;
            }

            /**
             * Define el valor de la propiedad level.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLevel(String value) {
                this.level = value;
            }

            /**
             * Obtiene el valor de la propiedad levelDesc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLevelDesc() {
                return levelDesc;
            }

            /**
             * Define el valor de la propiedad levelDesc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLevelDesc(String value) {
                this.levelDesc = value;
            }

            /**
             * Obtiene el valor de la propiedad number.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Define el valor de la propiedad number.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Obtiene el valor de la propiedad sectorType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSectorType() {
                return sectorType;
            }

            /**
             * Define el valor de la propiedad sectorType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSectorType(String value) {
                this.sectorType = value;
            }

            /**
             * Obtiene el valor de la propiedad sector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSector() {
                return sector;
            }

            /**
             * Define el valor de la propiedad sector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSector(String value) {
                this.sector = value;
            }

            /**
             * Obtiene el valor de la propiedad pob.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOB() {
                return pob;
            }

            /**
             * Define el valor de la propiedad pob.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOB(String value) {
                this.pob = value;
            }

            /**
             * Obtiene el valor de la propiedad postmanRoute.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostmanRoute() {
                return postmanRoute;
            }

            /**
             * Define el valor de la propiedad postmanRoute.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostmanRoute(String value) {
                this.postmanRoute = value;
            }

            /**
             * Obtiene el valor de la propiedad houseCondition.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHouseCondition() {
                return houseCondition;
            }

            /**
             * Define el valor de la propiedad houseCondition.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHouseCondition(String value) {
                this.houseCondition = value;
            }

            /**
             * Obtiene el valor de la propiedad phoneNum.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Addr.PhoneNum }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.Addr.PhoneNum getPhoneNum() {
                return phoneNum;
            }

            /**
             * Define el valor de la propiedad phoneNum.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Addr.PhoneNum }
             *     
             */
            public void setPhoneNum(ReadCustomerDataRsNatural.NaturalCustomer.Addr.PhoneNum value) {
                this.phoneNum = value;
            }

            /**
             * Obtiene el valor de la propiedad addrUse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddrUse() {
                return addrUse;
            }

            /**
             * Define el valor de la propiedad addrUse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddrUse(String value) {
                this.addrUse = value;
            }

            /**
             * Obtiene el valor de la propiedad countryCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Define el valor de la propiedad countryCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
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
             *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "phone"
            })
            public static class PhoneNum {

                @XmlElement(name = "Phone", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String phone;

                /**
                 * Obtiene el valor de la propiedad phone.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhone() {
                    return phone;
                }

                /**
                 * Define el valor de la propiedad phone.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhone(String value) {
                    this.phone = value;
                }

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
         *         &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "custPermId"
        })
        public static class CustId {

            @XmlElement(name = "CustPermId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String custPermId;

            /**
             * Obtiene el valor de la propiedad custPermId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustPermId() {
                return custPermId;
            }

            /**
             * Define el valor de la propiedad custPermId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustPermId(String value) {
                this.custPermId = value;
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
         *         &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ContactInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PhoneUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="EmailUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="EmailStatus" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="PersonInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BirthDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ResidenceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="EduBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Dependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SonsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PersonName" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="LastSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OtherIdentDoc" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="GovIssueIdent" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="GovIssueIdentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="InmigrationInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PermanenceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="NationalizationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "custType",
            "contactInfo",
            "personInfo"
        })
        public static class CustInfo {

            @XmlElement(name = "CustType", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String custType;
            @XmlElement(name = "ContactInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo contactInfo;
            @XmlElement(name = "PersonInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo personInfo;

            /**
             * Obtiene el valor de la propiedad custType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustType() {
                return custType;
            }

            /**
             * Define el valor de la propiedad custType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustType(String value) {
                this.custType = value;
            }

            /**
             * Obtiene el valor de la propiedad contactInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo getContactInfo() {
                return contactInfo;
            }

            /**
             * Define el valor de la propiedad contactInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo }
             *     
             */
            public void setContactInfo(ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo value) {
                this.contactInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad personInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo getPersonInfo() {
                return personInfo;
            }

            /**
             * Define el valor de la propiedad personInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo }
             *     
             */
            public void setPersonInfo(ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo value) {
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
             *         &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PhoneUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="EmailUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="EmailStatus" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "phoneNum",
                "email"
            })
            public static class ContactInfo {

                @XmlElement(name = "PhoneNum", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.PhoneNum> phoneNum;
                @XmlElement(name = "Email", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email> email;

                /**
                 * Gets the value of the phoneNum property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the phoneNum property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPhoneNum().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.PhoneNum }
                 * 
                 * 
                 */
                public List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.PhoneNum> getPhoneNum() {
                    if (phoneNum == null) {
                        phoneNum = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.PhoneNum>();
                    }
                    return this.phoneNum;
                }

                /**
                 * Gets the value of the email property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the email property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEmail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email }
                 * 
                 * 
                 */
                public List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email> getEmail() {
                    if (email == null) {
                        email = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email>();
                    }
                    return this.email;
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
                 *         &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="EmailUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="EmailStatus" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "emailAddr",
                    "emailUse",
                    "emailStatus",
                    "mainInd"
                })
                public static class Email {

                    @XmlElement(name = "EmailAddr", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String emailAddr;
                    @XmlElement(name = "EmailUse", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String emailUse;
                    @XmlElement(name = "EmailStatus", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email.EmailStatus emailStatus;
                    @XmlElement(name = "MainInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String mainInd;

                    /**
                     * Obtiene el valor de la propiedad emailAddr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmailAddr() {
                        return emailAddr;
                    }

                    /**
                     * Define el valor de la propiedad emailAddr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmailAddr(String value) {
                        this.emailAddr = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad emailUse.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmailUse() {
                        return emailUse;
                    }

                    /**
                     * Define el valor de la propiedad emailUse.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmailUse(String value) {
                        this.emailUse = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad emailStatus.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email.EmailStatus }
                     *     
                     */
                    public ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email.EmailStatus getEmailStatus() {
                        return emailStatus;
                    }

                    /**
                     * Define el valor de la propiedad emailStatus.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email.EmailStatus }
                     *     
                     */
                    public void setEmailStatus(ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.ContactInfo.Email.EmailStatus value) {
                        this.emailStatus = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad mainInd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMainInd() {
                        return mainInd;
                    }

                    /**
                     * Define el valor de la propiedad mainInd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMainInd(String value) {
                        this.mainInd = value;
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
                     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "status"
                    })
                    public static class EmailStatus {

                        @XmlElement(name = "Status", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                        protected String status;

                        /**
                         * Obtiene el valor de la propiedad status.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStatus() {
                            return status;
                        }

                        /**
                         * Define el valor de la propiedad status.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStatus(String value) {
                            this.status = value;
                        }

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
                 *         &lt;element name="PhoneUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "phoneUse",
                    "phone"
                })
                public static class PhoneNum {

                    @XmlElement(name = "PhoneUse", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String phoneUse;
                    @XmlElement(name = "Phone", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String phone;

                    /**
                     * Obtiene el valor de la propiedad phoneUse.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPhoneUse() {
                        return phoneUse;
                    }

                    /**
                     * Define el valor de la propiedad phoneUse.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPhoneUse(String value) {
                        this.phoneUse = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad phone.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPhone() {
                        return phone;
                    }

                    /**
                     * Define el valor de la propiedad phone.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPhone(String value) {
                        this.phone = value;
                    }

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
             *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BirthDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ResidenceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="EduBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Dependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SonsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PersonName" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="LastSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OtherIdentDoc" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="GovIssueIdent" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="GovIssueIdentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="InmigrationInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PermanenceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="NationalizationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "nationality",
                "maritalStatus",
                "birthDt",
                "birthCountry",
                "residenceCountry",
                "gender",
                "eduBackground",
                "dependents",
                "sonsNumber",
                "personName",
                "otherIdentDoc",
                "govIssueIdent",
                "inmigrationInfo"
            })
            public static class PersonInfo {

                @XmlElement(name = "Nationality", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String nationality;
                @XmlElement(name = "MaritalStatus", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String maritalStatus;
                @XmlElement(name = "BirthDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar birthDt;
                @XmlElement(name = "BirthCountry", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String birthCountry;
                @XmlElement(name = "ResidenceCountry", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String residenceCountry;
                @XmlElement(name = "Gender", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String gender;
                @XmlElement(name = "EduBackground", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String eduBackground;
                @XmlElement(name = "Dependents", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String dependents;
                @XmlElement(name = "SonsNumber", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String sonsNumber;
                @XmlElement(name = "PersonName", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.PersonName personName;
                @XmlElement(name = "OtherIdentDoc", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.OtherIdentDoc> otherIdentDoc;
                @XmlElement(name = "GovIssueIdent", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent> govIssueIdent;
                @XmlElement(name = "InmigrationInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.InmigrationInfo inmigrationInfo;

                /**
                 * Obtiene el valor de la propiedad nationality.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationality() {
                    return nationality;
                }

                /**
                 * Define el valor de la propiedad nationality.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationality(String value) {
                    this.nationality = value;
                }

                /**
                 * Obtiene el valor de la propiedad maritalStatus.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMaritalStatus() {
                    return maritalStatus;
                }

                /**
                 * Define el valor de la propiedad maritalStatus.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMaritalStatus(String value) {
                    this.maritalStatus = value;
                }

                /**
                 * Obtiene el valor de la propiedad birthDt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getBirthDt() {
                    return birthDt;
                }

                /**
                 * Define el valor de la propiedad birthDt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setBirthDt(XMLGregorianCalendar value) {
                    this.birthDt = value;
                }

                /**
                 * Obtiene el valor de la propiedad birthCountry.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBirthCountry() {
                    return birthCountry;
                }

                /**
                 * Define el valor de la propiedad birthCountry.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBirthCountry(String value) {
                    this.birthCountry = value;
                }

                /**
                 * Obtiene el valor de la propiedad residenceCountry.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResidenceCountry() {
                    return residenceCountry;
                }

                /**
                 * Define el valor de la propiedad residenceCountry.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResidenceCountry(String value) {
                    this.residenceCountry = value;
                }

                /**
                 * Obtiene el valor de la propiedad gender.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGender() {
                    return gender;
                }

                /**
                 * Define el valor de la propiedad gender.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGender(String value) {
                    this.gender = value;
                }

                /**
                 * Obtiene el valor de la propiedad eduBackground.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEduBackground() {
                    return eduBackground;
                }

                /**
                 * Define el valor de la propiedad eduBackground.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEduBackground(String value) {
                    this.eduBackground = value;
                }

                /**
                 * Obtiene el valor de la propiedad dependents.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDependents() {
                    return dependents;
                }

                /**
                 * Define el valor de la propiedad dependents.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDependents(String value) {
                    this.dependents = value;
                }

                /**
                 * Obtiene el valor de la propiedad sonsNumber.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSonsNumber() {
                    return sonsNumber;
                }

                /**
                 * Define el valor de la propiedad sonsNumber.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSonsNumber(String value) {
                    this.sonsNumber = value;
                }

                /**
                 * Obtiene el valor de la propiedad personName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.PersonName }
                 *     
                 */
                public ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.PersonName getPersonName() {
                    return personName;
                }

                /**
                 * Define el valor de la propiedad personName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.PersonName }
                 *     
                 */
                public void setPersonName(ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.PersonName value) {
                    this.personName = value;
                }

                /**
                 * Gets the value of the otherIdentDoc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherIdentDoc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherIdentDoc().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.OtherIdentDoc }
                 * 
                 * 
                 */
                public List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.OtherIdentDoc> getOtherIdentDoc() {
                    if (otherIdentDoc == null) {
                        otherIdentDoc = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.OtherIdentDoc>();
                    }
                    return this.otherIdentDoc;
                }

                /**
                 * Gets the value of the govIssueIdent property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the govIssueIdent property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGovIssueIdent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent }
                 * 
                 * 
                 */
                public List<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent> getGovIssueIdent() {
                    if (govIssueIdent == null) {
                        govIssueIdent = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent>();
                    }
                    return this.govIssueIdent;
                }

                /**
                 * Obtiene el valor de la propiedad inmigrationInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.InmigrationInfo }
                 *     
                 */
                public ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.InmigrationInfo getInmigrationInfo() {
                    return inmigrationInfo;
                }

                /**
                 * Define el valor de la propiedad inmigrationInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.InmigrationInfo }
                 *     
                 */
                public void setInmigrationInfo(ReadCustomerDataRsNatural.NaturalCustomer.CustInfo.PersonInfo.InmigrationInfo value) {
                    this.inmigrationInfo = value;
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
                 *         &lt;element name="GovIssueIdentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "govIssueIdentType",
                    "identSerialNumPrefix",
                    "identSerialNum",
                    "issDt",
                    "expDt",
                    "country"
                })
                public static class GovIssueIdent {

                    @XmlElement(name = "GovIssueIdentType", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String govIssueIdentType;
                    @XmlElement(name = "IdentSerialNumPrefix", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String identSerialNumPrefix;
                    @XmlElement(name = "IdentSerialNum", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String identSerialNum;
                    @XmlElement(name = "IssDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar issDt;
                    @XmlElement(name = "ExpDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expDt;
                    @XmlElement(name = "Country", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String country;

                    /**
                     * Obtiene el valor de la propiedad govIssueIdentType.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGovIssueIdentType() {
                        return govIssueIdentType;
                    }

                    /**
                     * Define el valor de la propiedad govIssueIdentType.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGovIssueIdentType(String value) {
                        this.govIssueIdentType = value;
                    }

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

                    /**
                     * Obtiene el valor de la propiedad issDt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getIssDt() {
                        return issDt;
                    }

                    /**
                     * Define el valor de la propiedad issDt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setIssDt(XMLGregorianCalendar value) {
                        this.issDt = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expDt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getExpDt() {
                        return expDt;
                    }

                    /**
                     * Define el valor de la propiedad expDt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setExpDt(XMLGregorianCalendar value) {
                        this.expDt = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad country.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountry() {
                        return country;
                    }

                    /**
                     * Define el valor de la propiedad country.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountry(String value) {
                        this.country = value;
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
                 *         &lt;element name="PermanenceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="NationalizationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "permanenceCondition",
                    "nationalizationInd"
                })
                public static class InmigrationInfo {

                    @XmlElement(name = "PermanenceCondition", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String permanenceCondition;
                    @XmlElement(name = "NationalizationInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String nationalizationInd;

                    /**
                     * Obtiene el valor de la propiedad permanenceCondition.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPermanenceCondition() {
                        return permanenceCondition;
                    }

                    /**
                     * Define el valor de la propiedad permanenceCondition.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPermanenceCondition(String value) {
                        this.permanenceCondition = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nationalizationInd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNationalizationInd() {
                        return nationalizationInd;
                    }

                    /**
                     * Define el valor de la propiedad nationalizationInd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNationalizationInd(String value) {
                        this.nationalizationInd = value;
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
                 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IdentSerialNumPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "type",
                    "identSerialNumPrefix",
                    "identSerialNum",
                    "issDt",
                    "expDt",
                    "country"
                })
                public static class OtherIdentDoc {

                    @XmlElement(name = "Type", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String type;
                    @XmlElement(name = "IdentSerialNumPrefix", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String identSerialNumPrefix;
                    @XmlElement(name = "IdentSerialNum", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String identSerialNum;
                    @XmlElement(name = "IssDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar issDt;
                    @XmlElement(name = "ExpDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expDt;
                    @XmlElement(name = "Country", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String country;

                    /**
                     * Obtiene el valor de la propiedad type.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Define el valor de la propiedad type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

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

                    /**
                     * Obtiene el valor de la propiedad issDt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getIssDt() {
                        return issDt;
                    }

                    /**
                     * Define el valor de la propiedad issDt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setIssDt(XMLGregorianCalendar value) {
                        this.issDt = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expDt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getExpDt() {
                        return expDt;
                    }

                    /**
                     * Define el valor de la propiedad expDt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setExpDt(XMLGregorianCalendar value) {
                        this.expDt = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad country.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountry() {
                        return country;
                    }

                    /**
                     * Define el valor de la propiedad country.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountry(String value) {
                        this.country = value;
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
                 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="LastSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "firstName",
                    "lastName",
                    "lastSecondName"
                })
                public static class PersonName {

                    @XmlElement(name = "FirstName", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String firstName;
                    @XmlElement(name = "LastName", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String lastName;
                    @XmlElement(name = "LastSecondName", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String lastSecondName;

                    /**
                     * Obtiene el valor de la propiedad firstName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFirstName() {
                        return firstName;
                    }

                    /**
                     * Define el valor de la propiedad firstName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFirstName(String value) {
                        this.firstName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lastName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLastName() {
                        return lastName;
                    }

                    /**
                     * Define el valor de la propiedad lastName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLastName(String value) {
                        this.lastName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lastSecondName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLastSecondName() {
                        return lastSecondName;
                    }

                    /**
                     * Define el valor de la propiedad lastSecondName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLastSecondName(String value) {
                        this.lastSecondName = value;
                    }

                }

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
         *         &lt;element name="CustStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "custStatusCode"
        })
        public static class CustStatus {

            @XmlElement(name = "CustStatusCode", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String custStatusCode;

            /**
             * Obtiene el valor de la propiedad custStatusCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustStatusCode() {
                return custStatusCode;
            }

            /**
             * Define el valor de la propiedad custStatusCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustStatusCode(String value) {
                this.custStatusCode = value;
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
         *         &lt;element name="ForeignTransfersInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PEPAssociatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PEPRelationshipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PEPInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WorkingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "foreignTransfersInd",
            "pepAssociatedInd",
            "pepRelationshipInd",
            "pepInd",
            "workingInd"
        })
        public static class CustVerificationList {

            @XmlElement(name = "ForeignTransfersInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String foreignTransfersInd;
            @XmlElement(name = "PEPAssociatedInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String pepAssociatedInd;
            @XmlElement(name = "PEPRelationshipInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String pepRelationshipInd;
            @XmlElement(name = "PEPInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String pepInd;
            @XmlElement(name = "WorkingInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String workingInd;

            /**
             * Obtiene el valor de la propiedad foreignTransfersInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForeignTransfersInd() {
                return foreignTransfersInd;
            }

            /**
             * Define el valor de la propiedad foreignTransfersInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForeignTransfersInd(String value) {
                this.foreignTransfersInd = value;
            }

            /**
             * Obtiene el valor de la propiedad pepAssociatedInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPEPAssociatedInd() {
                return pepAssociatedInd;
            }

            /**
             * Define el valor de la propiedad pepAssociatedInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPEPAssociatedInd(String value) {
                this.pepAssociatedInd = value;
            }

            /**
             * Obtiene el valor de la propiedad pepRelationshipInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPEPRelationshipInd() {
                return pepRelationshipInd;
            }

            /**
             * Define el valor de la propiedad pepRelationshipInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPEPRelationshipInd(String value) {
                this.pepRelationshipInd = value;
            }

            /**
             * Obtiene el valor de la propiedad pepInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPEPInd() {
                return pepInd;
            }

            /**
             * Define el valor de la propiedad pepInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPEPInd(String value) {
                this.pepInd = value;
            }

            /**
             * Obtiene el valor de la propiedad workingInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkingInd() {
                return workingInd;
            }

            /**
             * Define el valor de la propiedad workingInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkingInd(String value) {
                this.workingInd = value;
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
         *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OccupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StartDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EmploymentCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OrgInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CustId" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="Income" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LastIncomeDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ExtraIncome" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="IncomeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ExtIncomeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PensionerInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RetiredInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EmployInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExtIncomeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "jobTitle",
            "occupation",
            "occupDesc",
            "startDt",
            "employmentCondition",
            "orgInfo",
            "income",
            "extraIncome",
            "pensionerInd",
            "retiredInd",
            "employInd",
            "extIncomeInd"
        })
        public static class EmploymentData {

            @XmlElement(name = "JobTitle", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String jobTitle;
            @XmlElement(name = "Occupation", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String occupation;
            @XmlElement(name = "OccupDesc", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String occupDesc;
            @XmlElement(name = "StartDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String startDt;
            @XmlElement(name = "EmploymentCondition", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String employmentCondition;
            @XmlElement(name = "OrgInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo orgInfo;
            @XmlElement(name = "Income", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.Income income;
            @XmlElement(name = "ExtraIncome", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.ExtraIncome extraIncome;
            @XmlElement(name = "PensionerInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String pensionerInd;
            @XmlElement(name = "RetiredInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String retiredInd;
            @XmlElement(name = "EmployInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String employInd;
            @XmlElement(name = "ExtIncomeInd", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String extIncomeInd;

            /**
             * Obtiene el valor de la propiedad jobTitle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJobTitle() {
                return jobTitle;
            }

            /**
             * Define el valor de la propiedad jobTitle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJobTitle(String value) {
                this.jobTitle = value;
            }

            /**
             * Obtiene el valor de la propiedad occupation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOccupation() {
                return occupation;
            }

            /**
             * Define el valor de la propiedad occupation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOccupation(String value) {
                this.occupation = value;
            }

            /**
             * Obtiene el valor de la propiedad occupDesc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOccupDesc() {
                return occupDesc;
            }

            /**
             * Define el valor de la propiedad occupDesc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOccupDesc(String value) {
                this.occupDesc = value;
            }

            /**
             * Obtiene el valor de la propiedad startDt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartDt() {
                return startDt;
            }

            /**
             * Define el valor de la propiedad startDt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartDt(String value) {
                this.startDt = value;
            }

            /**
             * Obtiene el valor de la propiedad employmentCondition.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmploymentCondition() {
                return employmentCondition;
            }

            /**
             * Define el valor de la propiedad employmentCondition.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmploymentCondition(String value) {
                this.employmentCondition = value;
            }

            /**
             * Obtiene el valor de la propiedad orgInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo getOrgInfo() {
                return orgInfo;
            }

            /**
             * Define el valor de la propiedad orgInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo }
             *     
             */
            public void setOrgInfo(ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo value) {
                this.orgInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad income.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.Income }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.Income getIncome() {
                return income;
            }

            /**
             * Define el valor de la propiedad income.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.Income }
             *     
             */
            public void setIncome(ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.Income value) {
                this.income = value;
            }

            /**
             * Obtiene el valor de la propiedad extraIncome.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.ExtraIncome }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.ExtraIncome getExtraIncome() {
                return extraIncome;
            }

            /**
             * Define el valor de la propiedad extraIncome.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.ExtraIncome }
             *     
             */
            public void setExtraIncome(ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.ExtraIncome value) {
                this.extraIncome = value;
            }

            /**
             * Obtiene el valor de la propiedad pensionerInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPensionerInd() {
                return pensionerInd;
            }

            /**
             * Define el valor de la propiedad pensionerInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPensionerInd(String value) {
                this.pensionerInd = value;
            }

            /**
             * Obtiene el valor de la propiedad retiredInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetiredInd() {
                return retiredInd;
            }

            /**
             * Define el valor de la propiedad retiredInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetiredInd(String value) {
                this.retiredInd = value;
            }

            /**
             * Obtiene el valor de la propiedad employInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployInd() {
                return employInd;
            }

            /**
             * Define el valor de la propiedad employInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployInd(String value) {
                this.employInd = value;
            }

            /**
             * Obtiene el valor de la propiedad extIncomeInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtIncomeInd() {
                return extIncomeInd;
            }

            /**
             * Define el valor de la propiedad extIncomeInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtIncomeInd(String value) {
                this.extIncomeInd = value;
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
             *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="IncomeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ExtIncomeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "amt",
                "incomeSource",
                "extIncomeSeq"
            })
            public static class ExtraIncome {

                @XmlElement(name = "Amt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected Double amt;
                @XmlElement(name = "IncomeSource", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String incomeSource;
                @XmlElement(name = "ExtIncomeSeq", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String extIncomeSeq;

                /**
                 * Obtiene el valor de la propiedad amt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getAmt() {
                    return amt;
                }

                /**
                 * Define el valor de la propiedad amt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setAmt(Double value) {
                    this.amt = value;
                }

                /**
                 * Obtiene el valor de la propiedad incomeSource.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIncomeSource() {
                    return incomeSource;
                }

                /**
                 * Define el valor de la propiedad incomeSource.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIncomeSource(String value) {
                    this.incomeSource = value;
                }

                /**
                 * Obtiene el valor de la propiedad extIncomeSeq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtIncomeSeq() {
                    return extIncomeSeq;
                }

                /**
                 * Define el valor de la propiedad extIncomeSeq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtIncomeSeq(String value) {
                    this.extIncomeSeq = value;
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
             *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LastIncomeDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "amt",
                "freq",
                "lastIncomeDt"
            })
            public static class Income {

                @XmlElement(name = "Amt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected Double amt;
                @XmlElement(name = "Freq", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String freq;
                @XmlElement(name = "LastIncomeDt", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar lastIncomeDt;

                /**
                 * Obtiene el valor de la propiedad amt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getAmt() {
                    return amt;
                }

                /**
                 * Define el valor de la propiedad amt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setAmt(Double value) {
                    this.amt = value;
                }

                /**
                 * Obtiene el valor de la propiedad freq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFreq() {
                    return freq;
                }

                /**
                 * Define el valor de la propiedad freq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFreq(String value) {
                    this.freq = value;
                }

                /**
                 * Obtiene el valor de la propiedad lastIncomeDt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLastIncomeDt() {
                    return lastIncomeDt;
                }

                /**
                 * Define el valor de la propiedad lastIncomeDt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLastIncomeDt(XMLGregorianCalendar value) {
                    this.lastIncomeDt = value;
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
             *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CustId" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "orgId",
                "name",
                "comScope",
                "custId"
            })
            public static class OrgInfo {

                @XmlElement(name = "OrgId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String orgId;
                @XmlElement(name = "Name", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String name;
                @XmlElement(name = "ComScope", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String comScope;
                @XmlElement(name = "CustId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo.CustId custId;

                /**
                 * Obtiene el valor de la propiedad orgId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrgId() {
                    return orgId;
                }

                /**
                 * Define el valor de la propiedad orgId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrgId(String value) {
                    this.orgId = value;
                }

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad comScope.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComScope() {
                    return comScope;
                }

                /**
                 * Define el valor de la propiedad comScope.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComScope(String value) {
                    this.comScope = value;
                }

                /**
                 * Obtiene el valor de la propiedad custId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo.CustId }
                 *     
                 */
                public ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo.CustId getCustId() {
                    return custId;
                }

                /**
                 * Define el valor de la propiedad custId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo.CustId }
                 *     
                 */
                public void setCustId(ReadCustomerDataRsNatural.NaturalCustomer.EmploymentData.OrgInfo.CustId value) {
                    this.custId = value;
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
                 *         &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "custPermId"
                })
                public static class CustId {

                    @XmlElement(name = "CustPermId", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                    protected String custPermId;

                    /**
                     * Obtiene el valor de la propiedad custPermId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCustPermId() {
                        return custPermId;
                    }

                    /**
                     * Define el valor de la propiedad custPermId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCustPermId(String value) {
                        this.custPermId = value;
                    }

                }

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
         *         &lt;element name="EconActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditCardCustQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BankCustQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "econActivity",
            "comCategory",
            "creditCardCustQty",
            "bankCustQty"
        })
        public static class FinancialInfo {

            @XmlElement(name = "EconActivity", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String econActivity;
            @XmlElement(name = "ComCategory", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String comCategory;
            @XmlElement(name = "CreditCardCustQty", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String creditCardCustQty;
            @XmlElement(name = "BankCustQty", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String bankCustQty;

            /**
             * Obtiene el valor de la propiedad econActivity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEconActivity() {
                return econActivity;
            }

            /**
             * Define el valor de la propiedad econActivity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEconActivity(String value) {
                this.econActivity = value;
            }

            /**
             * Obtiene el valor de la propiedad comCategory.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComCategory() {
                return comCategory;
            }

            /**
             * Define el valor de la propiedad comCategory.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComCategory(String value) {
                this.comCategory = value;
            }

            /**
             * Obtiene el valor de la propiedad creditCardCustQty.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCardCustQty() {
                return creditCardCustQty;
            }

            /**
             * Define el valor de la propiedad creditCardCustQty.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCardCustQty(String value) {
                this.creditCardCustQty = value;
            }

            /**
             * Obtiene el valor de la propiedad bankCustQty.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankCustQty() {
                return bankCustQty;
            }

            /**
             * Define el valor de la propiedad bankCustQty.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankCustQty(String value) {
                this.bankCustQty = value;
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
         *         &lt;element name="ProdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "prodDesc"
        })
        public static class Product {

            @XmlElement(name = "ProdDesc", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String prodDesc;

            /**
             * Obtiene el valor de la propiedad prodDesc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProdDesc() {
                return prodDesc;
            }

            /**
             * Define el valor de la propiedad prodDesc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProdDesc(String value) {
                this.prodDesc = value;
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
         *         &lt;element name="AcctUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DepositsInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DepositsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DepositsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="WithdrawalsInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="WithdrawalsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WithdrawalsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ElecTransInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ElecTransQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ElecTransRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TransferInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TransferCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FundsSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CurrencyOpe" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "acctUse",
            "depositsInfo",
            "withdrawalsInfo",
            "elecTransInfo",
            "transferInfo",
            "fundsSrc",
            "currencyOpe"
        })
        public static class RegulatoryInfo {

            @XmlElement(name = "AcctUse", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String acctUse;
            @XmlElement(name = "DepositsInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.DepositsInfo depositsInfo;
            @XmlElement(name = "WithdrawalsInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.WithdrawalsInfo> withdrawalsInfo;
            @XmlElement(name = "ElecTransInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.ElecTransInfo> elecTransInfo;
            @XmlElement(name = "TransferInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.TransferInfo> transferInfo;
            @XmlElement(name = "FundsSrc", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected String fundsSrc;
            @XmlElement(name = "CurrencyOpe", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.CurrencyOpe currencyOpe;

            /**
             * Obtiene el valor de la propiedad acctUse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctUse() {
                return acctUse;
            }

            /**
             * Define el valor de la propiedad acctUse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctUse(String value) {
                this.acctUse = value;
            }

            /**
             * Obtiene el valor de la propiedad depositsInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.DepositsInfo }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.DepositsInfo getDepositsInfo() {
                return depositsInfo;
            }

            /**
             * Define el valor de la propiedad depositsInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.DepositsInfo }
             *     
             */
            public void setDepositsInfo(ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.DepositsInfo value) {
                this.depositsInfo = value;
            }

            /**
             * Gets the value of the withdrawalsInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the withdrawalsInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWithdrawalsInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.WithdrawalsInfo }
             * 
             * 
             */
            public List<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.WithdrawalsInfo> getWithdrawalsInfo() {
                if (withdrawalsInfo == null) {
                    withdrawalsInfo = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.WithdrawalsInfo>();
                }
                return this.withdrawalsInfo;
            }

            /**
             * Gets the value of the elecTransInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the elecTransInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElecTransInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.ElecTransInfo }
             * 
             * 
             */
            public List<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.ElecTransInfo> getElecTransInfo() {
                if (elecTransInfo == null) {
                    elecTransInfo = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.ElecTransInfo>();
                }
                return this.elecTransInfo;
            }

            /**
             * Gets the value of the transferInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transferInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransferInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.TransferInfo }
             * 
             * 
             */
            public List<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.TransferInfo> getTransferInfo() {
                if (transferInfo == null) {
                    transferInfo = new ArrayList<ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.TransferInfo>();
                }
                return this.transferInfo;
            }

            /**
             * Obtiene el valor de la propiedad fundsSrc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFundsSrc() {
                return fundsSrc;
            }

            /**
             * Define el valor de la propiedad fundsSrc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFundsSrc(String value) {
                this.fundsSrc = value;
            }

            /**
             * Obtiene el valor de la propiedad currencyOpe.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.CurrencyOpe }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.CurrencyOpe getCurrencyOpe() {
                return currencyOpe;
            }

            /**
             * Define el valor de la propiedad currencyOpe.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.CurrencyOpe }
             *     
             */
            public void setCurrencyOpe(ReadCustomerDataRsNatural.NaturalCustomer.RegulatoryInfo.CurrencyOpe value) {
                this.currencyOpe = value;
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
             *         &lt;element name="CurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "currencyName"
            })
            public static class CurrencyOpe {

                @XmlElement(name = "CurrencyName", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String currencyName;

                /**
                 * Obtiene el valor de la propiedad currencyName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyName() {
                    return currencyName;
                }

                /**
                 * Define el valor de la propiedad currencyName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyName(String value) {
                    this.currencyName = value;
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
             *         &lt;element name="DepositsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DepositsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "depositsQty",
                "depositsRange"
            })
            public static class DepositsInfo {

                @XmlElement(name = "DepositsQty", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String depositsQty;
                @XmlElement(name = "DepositsRange", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String depositsRange;

                /**
                 * Obtiene el valor de la propiedad depositsQty.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDepositsQty() {
                    return depositsQty;
                }

                /**
                 * Define el valor de la propiedad depositsQty.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDepositsQty(String value) {
                    this.depositsQty = value;
                }

                /**
                 * Obtiene el valor de la propiedad depositsRange.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDepositsRange() {
                    return depositsRange;
                }

                /**
                 * Define el valor de la propiedad depositsRange.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDepositsRange(String value) {
                    this.depositsRange = value;
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
             *         &lt;element name="ElecTransQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ElecTransRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "elecTransQty",
                "elecTransRange"
            })
            public static class ElecTransInfo {

                @XmlElement(name = "ElecTransQty", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String elecTransQty;
                @XmlElement(name = "ElecTransRange", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String elecTransRange;

                /**
                 * Obtiene el valor de la propiedad elecTransQty.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElecTransQty() {
                    return elecTransQty;
                }

                /**
                 * Define el valor de la propiedad elecTransQty.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElecTransQty(String value) {
                    this.elecTransQty = value;
                }

                /**
                 * Obtiene el valor de la propiedad elecTransRange.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElecTransRange() {
                    return elecTransRange;
                }

                /**
                 * Define el valor de la propiedad elecTransRange.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElecTransRange(String value) {
                    this.elecTransRange = value;
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
             *         &lt;element name="TransferCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "transferCountry",
                "transferType"
            })
            public static class TransferInfo {

                @XmlElement(name = "TransferCountry", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String transferCountry;
                @XmlElement(name = "TransferType", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String transferType;

                /**
                 * Obtiene el valor de la propiedad transferCountry.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransferCountry() {
                    return transferCountry;
                }

                /**
                 * Define el valor de la propiedad transferCountry.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransferCountry(String value) {
                    this.transferCountry = value;
                }

                /**
                 * Obtiene el valor de la propiedad transferType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransferType() {
                    return transferType;
                }

                /**
                 * Define el valor de la propiedad transferType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransferType(String value) {
                    this.transferType = value;
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
             *         &lt;element name="WithdrawalsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WithdrawalsRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "withdrawalsQty",
                "withdrawalsRange"
            })
            public static class WithdrawalsInfo {

                @XmlElement(name = "WithdrawalsQty", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String withdrawalsQty;
                @XmlElement(name = "WithdrawalsRange", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String withdrawalsRange;

                /**
                 * Obtiene el valor de la propiedad withdrawalsQty.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWithdrawalsQty() {
                    return withdrawalsQty;
                }

                /**
                 * Define el valor de la propiedad withdrawalsQty.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWithdrawalsQty(String value) {
                    this.withdrawalsQty = value;
                }

                /**
                 * Obtiene el valor de la propiedad withdrawalsRange.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWithdrawalsRange() {
                    return withdrawalsRange;
                }

                /**
                 * Define el valor de la propiedad withdrawalsRange.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWithdrawalsRange(String value) {
                    this.withdrawalsRange = value;
                }

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
         *         &lt;element name="RiskInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "riskInfo"
        })
        public static class Risk {

            @XmlElement(name = "RiskInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
            protected ReadCustomerDataRsNatural.NaturalCustomer.Risk.RiskInfo riskInfo;

            /**
             * Obtiene el valor de la propiedad riskInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Risk.RiskInfo }
             *     
             */
            public ReadCustomerDataRsNatural.NaturalCustomer.Risk.RiskInfo getRiskInfo() {
                return riskInfo;
            }

            /**
             * Define el valor de la propiedad riskInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsNatural.NaturalCustomer.Risk.RiskInfo }
             *     
             */
            public void setRiskInfo(ReadCustomerDataRsNatural.NaturalCustomer.Risk.RiskInfo value) {
                this.riskInfo = value;
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
             *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "rating"
            })
            public static class RiskInfo {

                @XmlElement(name = "Rating", namespace = "http://xmlns.banesco.com/ApplicationService/APINaturalCustomerOutAppSvc")
                protected String rating;

                /**
                 * Obtiene el valor de la propiedad rating.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRating() {
                    return rating;
                }

                /**
                 * Define el valor de la propiedad rating.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRating(String value) {
                    this.rating = value;
                }

            }

        }

    }

}
