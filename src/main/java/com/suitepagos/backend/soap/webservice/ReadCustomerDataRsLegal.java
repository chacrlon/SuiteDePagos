
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
 *         &lt;element name="LegalCustomer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="CustInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Organization" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IncAgrmt" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="InitialCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PaidUpCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OutstandingCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FormedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="FormedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OrgInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BranchesQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PortfolioProdSrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ContactInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PhoneUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="EmailUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="EmailStatus" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TINInfo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Income" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="GazetteNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ONTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TradeRegistry" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RegistryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RegistryDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="RegistryExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Taxes" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FinancialInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="EconActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SalesAmt" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostmanRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
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
 *                   &lt;element name="Taxes" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastFiscalYearDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Balance" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BalAmt" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *                             &lt;element name="WithdrawalsInfo" minOccurs="0">
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
 *                             &lt;element name="ElecTransInfo" minOccurs="0">
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
 *                             &lt;element name="BalanceInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BalanceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="EntName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PresenCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SalesInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SalesAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "msgRsHdr",
    "status",
    "legalCustomer"
})
@XmlRootElement(name = "readCustomerData_Rs", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
public class ReadCustomerDataRsLegal {

    @XmlElement(name = "MsgRsHdr", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc", required = true)
    protected MsgRsHdr msgRsHdr;
    @XmlElement(name = "Status", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
    protected Status status;
    @XmlElement(name = "LegalCustomer", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
    protected List<ReadCustomerDataRsLegal.LegalCustomer> legalCustomer;

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
     * Gets the value of the legalCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadCustomerDataRsLegal.LegalCustomer }
     * 
     * 
     */
    public List<ReadCustomerDataRsLegal.LegalCustomer> getLegalCustomer() {
        if (legalCustomer == null) {
            legalCustomer = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer>();
        }
        return this.legalCustomer;
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
     *         &lt;element name="CustInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Organization" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IncAgrmt" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InitialCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PaidUpCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OutstandingCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FormedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="FormedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OrgInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BranchesQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PortfolioProdSrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                                                 &lt;element name="EmailStatus" maxOccurs="unbounded" minOccurs="0">
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
     *                             &lt;element name="TINInfo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="GazetteNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ONTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TradeRegistry" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RegistryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RegistryDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="RegistryExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Taxes" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                             &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SalesAmt" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
     *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PostmanRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
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
     *         &lt;element name="Taxes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastFiscalYearDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Balance" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BalAmt" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
     *                   &lt;element name="WithdrawalsInfo" minOccurs="0">
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
     *                   &lt;element name="ElecTransInfo" minOccurs="0">
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
     *                   &lt;element name="BalanceInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BalanceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="EntName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PresenCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SalesInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SalesAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "custClass",
        "executiveId",
        "svcReason",
        "declineInfoReason",
        "custStatus",
        "custId",
        "custInfo",
        "organization",
        "addr",
        "taxes",
        "financialInfo",
        "risk",
        "custVerificationList",
        "regulatoryInfo"
    })
    public static class LegalCustomer {

        @XmlElement(name = "CustClass", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected String custClass;
        @XmlElement(name = "ExecutiveId", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected String executiveId;
        @XmlElement(name = "SvcReason", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected String svcReason;
        @XmlElement(name = "DeclineInfoReason", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected String declineInfoReason;
        @XmlElement(name = "CustStatus", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRsLegal.LegalCustomer.CustStatus custStatus;
        @XmlElement(name = "CustId", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRsLegal.LegalCustomer.CustId custId;
        @XmlElement(name = "CustInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRsLegal.LegalCustomer.CustInfo custInfo;
        @XmlElement(name = "Organization", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization> organization;
        @XmlElement(name = "Addr", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsLegal.LegalCustomer.Addr> addr;
        @XmlElement(name = "Taxes", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsLegal.LegalCustomer.Taxes> taxes;
        @XmlElement(name = "FinancialInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected List<ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo> financialInfo;
        @XmlElement(name = "Risk", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRsLegal.LegalCustomer.Risk risk;
        @XmlElement(name = "CustVerificationList", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRsLegal.LegalCustomer.CustVerificationList custVerificationList;
        @XmlElement(name = "RegulatoryInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
        protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo regulatoryInfo;

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
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustStatus }
         *     
         */
        public ReadCustomerDataRsLegal.LegalCustomer.CustStatus getCustStatus() {
            return custStatus;
        }

        /**
         * Define el valor de la propiedad custStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustStatus }
         *     
         */
        public void setCustStatus(ReadCustomerDataRsLegal.LegalCustomer.CustStatus value) {
            this.custStatus = value;
        }

        /**
         * Obtiene el valor de la propiedad custId.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustId }
         *     
         */
        public ReadCustomerDataRsLegal.LegalCustomer.CustId getCustId() {
            return custId;
        }

        /**
         * Define el valor de la propiedad custId.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustId }
         *     
         */
        public void setCustId(ReadCustomerDataRsLegal.LegalCustomer.CustId value) {
            this.custId = value;
        }

        /**
         * Obtiene el valor de la propiedad custInfo.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustInfo }
         *     
         */
        public ReadCustomerDataRsLegal.LegalCustomer.CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Define el valor de la propiedad custInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustInfo }
         *     
         */
        public void setCustInfo(ReadCustomerDataRsLegal.LegalCustomer.CustInfo value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization }
         * 
         * 
         */
        public List<ReadCustomerDataRsLegal.LegalCustomer.Organization> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization>();
            }
            return this.organization;
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
         * {@link ReadCustomerDataRsLegal.LegalCustomer.Addr }
         * 
         * 
         */
        public List<ReadCustomerDataRsLegal.LegalCustomer.Addr> getAddr() {
            if (addr == null) {
                addr = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Addr>();
            }
            return this.addr;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadCustomerDataRsLegal.LegalCustomer.Taxes }
         * 
         * 
         */
        public List<ReadCustomerDataRsLegal.LegalCustomer.Taxes> getTaxes() {
            if (taxes == null) {
                taxes = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Taxes>();
            }
            return this.taxes;
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
         * {@link ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo }
         * 
         * 
         */
        public List<ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo> getFinancialInfo() {
            if (financialInfo == null) {
                financialInfo = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo>();
            }
            return this.financialInfo;
        }

        /**
         * Obtiene el valor de la propiedad risk.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.Risk }
         *     
         */
        public ReadCustomerDataRsLegal.LegalCustomer.Risk getRisk() {
            return risk;
        }

        /**
         * Define el valor de la propiedad risk.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.Risk }
         *     
         */
        public void setRisk(ReadCustomerDataRsLegal.LegalCustomer.Risk value) {
            this.risk = value;
        }

        /**
         * Obtiene el valor de la propiedad custVerificationList.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustVerificationList }
         *     
         */
        public ReadCustomerDataRsLegal.LegalCustomer.CustVerificationList getCustVerificationList() {
            return custVerificationList;
        }

        /**
         * Define el valor de la propiedad custVerificationList.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.CustVerificationList }
         *     
         */
        public void setCustVerificationList(ReadCustomerDataRsLegal.LegalCustomer.CustVerificationList value) {
            this.custVerificationList = value;
        }

        /**
         * Obtiene el valor de la propiedad regulatoryInfo.
         * 
         * @return
         *     possible object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo }
         *     
         */
        public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo getRegulatoryInfo() {
            return regulatoryInfo;
        }

        /**
         * Define el valor de la propiedad regulatoryInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo }
         *     
         */
        public void setRegulatoryInfo(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo value) {
            this.regulatoryInfo = value;
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
         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PostmanRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PhoneNum" maxOccurs="unbounded" minOccurs="0">
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

            @XmlElement(name = "AddrCod", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String addrCod;
            @XmlElement(name = "AddrSubCod", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String addrSubCod;
            @XmlElement(name = "AddrType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String addrType;
            @XmlElement(name = "Country", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String country;
            @XmlElement(name = "StateProvCod", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String stateProvCod;
            @XmlElement(name = "StateProv", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String stateProv;
            @XmlElement(name = "City", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String city;
            @XmlElement(name = "Province", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String province;
            @XmlElement(name = "Parish", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String parish;
            @XmlElement(name = "PostalCode", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String postalCode;
            @XmlElement(name = "StreetType1", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String streetType1;
            @XmlElement(name = "Street1", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String street1;
            @XmlElement(name = "BuildingType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String buildingType;
            @XmlElement(name = "Building", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String building;
            @XmlElement(name = "Level", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String level;
            @XmlElement(name = "Number", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String number;
            @XmlElement(name = "SectorType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String sectorType;
            @XmlElement(name = "Sector", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String sector;
            @XmlElement(name = "P.O.B", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String pob;
            @XmlElement(name = "PostmanRoute", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String postmanRoute;
            @XmlElement(name = "HouseCondition", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String houseCondition;
            @XmlElement(name = "PhoneNum", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsLegal.LegalCustomer.Addr.PhoneNum> phoneNum;
            @XmlElement(name = "AddrUse", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String addrUse;
            @XmlElement(name = "CountryCode", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
             * {@link ReadCustomerDataRsLegal.LegalCustomer.Addr.PhoneNum }
             * 
             * 
             */
            public List<ReadCustomerDataRsLegal.LegalCustomer.Addr.PhoneNum> getPhoneNum() {
                if (phoneNum == null) {
                    phoneNum = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Addr.PhoneNum>();
                }
                return this.phoneNum;
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

                @XmlElement(name = "Phone", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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

            @XmlElement(name = "CustPermId", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
            "custType"
        })
        public static class CustInfo {

            @XmlElement(name = "CustType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String custType;

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

            @XmlElement(name = "CustStatusCode", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
            "foreignTransfersInd"
        })
        public static class CustVerificationList {

            @XmlElement(name = "ForeignTransfersInd", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String foreignTransfersInd;

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
         *         &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastFiscalYearDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Balance" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BalAmt" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "econActivity",
            "comScope",
            "comCategory",
            "lastFiscalYearDt",
            "balance"
        })
        public static class FinancialInfo {

            @XmlElement(name = "EconActivity", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String econActivity;
            @XmlElement(name = "ComScope", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String comScope;
            @XmlElement(name = "ComCategory", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String comCategory;
            @XmlElement(name = "LastFiscalYearDt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String lastFiscalYearDt;
            @XmlElement(name = "Balance", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance> balance;

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
             * Obtiene el valor de la propiedad lastFiscalYearDt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastFiscalYearDt() {
                return lastFiscalYearDt;
            }

            /**
             * Define el valor de la propiedad lastFiscalYearDt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastFiscalYearDt(String value) {
                this.lastFiscalYearDt = value;
            }

            /**
             * Gets the value of the balance property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the balance property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBalance().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance }
             * 
             * 
             */
            public List<ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance> getBalance() {
                if (balance == null) {
                    balance = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance>();
                }
                return this.balance;
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
             *         &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BalAmt" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "balType",
                "balAmt"
            })
            public static class Balance {

                @XmlElement(name = "BalType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String balType;
                @XmlElement(name = "BalAmt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance.BalAmt balAmt;

                /**
                 * Obtiene el valor de la propiedad balType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBalType() {
                    return balType;
                }

                /**
                 * Define el valor de la propiedad balType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBalType(String value) {
                    this.balType = value;
                }

                /**
                 * Obtiene el valor de la propiedad balAmt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance.BalAmt }
                 *     
                 */
                public ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance.BalAmt getBalAmt() {
                    return balAmt;
                }

                /**
                 * Define el valor de la propiedad balAmt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance.BalAmt }
                 *     
                 */
                public void setBalAmt(ReadCustomerDataRsLegal.LegalCustomer.FinancialInfo.Balance.BalAmt value) {
                    this.balAmt = value;
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
                    "amt"
                })
                public static class BalAmt {

                    @XmlElement(name = "Amt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected Double amt;

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
         *         &lt;element name="IncAgrmt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InitialCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PaidUpCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OutstandingCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FormedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="FormedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OrgInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BranchesQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PortfolioProdSrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                                       &lt;element name="EmailStatus" maxOccurs="unbounded" minOccurs="0">
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
         *                   &lt;element name="TINInfo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="GazetteNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ONTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TradeRegistry" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RegistryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RegistryDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="RegistryExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Taxes" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SalesAmt" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "incAgrmt",
            "orgInfo",
            "tradeRegistry",
            "taxes",
            "financialInfo"
        })
        public static class Organization {

            @XmlElement(name = "IncAgrmt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.Organization.IncAgrmt incAgrmt;
            @XmlElement(name = "OrgInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo orgInfo;
            @XmlElement(name = "TradeRegistry", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.Organization.TradeRegistry tradeRegistry;
            @XmlElement(name = "Taxes", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization.Taxes> taxes;
            @XmlElement(name = "FinancialInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo> financialInfo;

            /**
             * Obtiene el valor de la propiedad incAgrmt.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.IncAgrmt }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.Organization.IncAgrmt getIncAgrmt() {
                return incAgrmt;
            }

            /**
             * Define el valor de la propiedad incAgrmt.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.IncAgrmt }
             *     
             */
            public void setIncAgrmt(ReadCustomerDataRsLegal.LegalCustomer.Organization.IncAgrmt value) {
                this.incAgrmt = value;
            }

            /**
             * Obtiene el valor de la propiedad orgInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo getOrgInfo() {
                return orgInfo;
            }

            /**
             * Define el valor de la propiedad orgInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo }
             *     
             */
            public void setOrgInfo(ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo value) {
                this.orgInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad tradeRegistry.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.TradeRegistry }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.Organization.TradeRegistry getTradeRegistry() {
                return tradeRegistry;
            }

            /**
             * Define el valor de la propiedad tradeRegistry.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.TradeRegistry }
             *     
             */
            public void setTradeRegistry(ReadCustomerDataRsLegal.LegalCustomer.Organization.TradeRegistry value) {
                this.tradeRegistry = value;
            }

            /**
             * Gets the value of the taxes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.Taxes }
             * 
             * 
             */
            public List<ReadCustomerDataRsLegal.LegalCustomer.Organization.Taxes> getTaxes() {
                if (taxes == null) {
                    taxes = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization.Taxes>();
                }
                return this.taxes;
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
             * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo }
             * 
             * 
             */
            public List<ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo> getFinancialInfo() {
                if (financialInfo == null) {
                    financialInfo = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo>();
                }
                return this.financialInfo;
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
             *         &lt;element name="ComScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SalesAmt" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "econActivity",
                "comScope",
                "salesAmt"
            })
            public static class FinancialInfo {

                @XmlElement(name = "EconActivity", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String econActivity;
                @XmlElement(name = "ComScope", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String comScope;
                @XmlElement(name = "SalesAmt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo.SalesAmt salesAmt;

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
                 * Obtiene el valor de la propiedad salesAmt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo.SalesAmt }
                 *     
                 */
                public ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo.SalesAmt getSalesAmt() {
                    return salesAmt;
                }

                /**
                 * Define el valor de la propiedad salesAmt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo.SalesAmt }
                 *     
                 */
                public void setSalesAmt(ReadCustomerDataRsLegal.LegalCustomer.Organization.FinancialInfo.SalesAmt value) {
                    this.salesAmt = value;
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
                    "amt"
                })
                public static class SalesAmt {

                    @XmlElement(name = "Amt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected Double amt;

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
             *         &lt;element name="InitialCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PaidUpCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OutstandingCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FormedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="FormedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "initialCap",
                "paidUpCap",
                "outstandingCap",
                "formedDt",
                "formedCountry"
            })
            public static class IncAgrmt {

                @XmlElement(name = "InitialCap", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String initialCap;
                @XmlElement(name = "PaidUpCap", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String paidUpCap;
                @XmlElement(name = "OutstandingCap", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String outstandingCap;
                @XmlElement(name = "FormedDt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar formedDt;
                @XmlElement(name = "FormedCountry", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String formedCountry;

                /**
                 * Obtiene el valor de la propiedad initialCap.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInitialCap() {
                    return initialCap;
                }

                /**
                 * Define el valor de la propiedad initialCap.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInitialCap(String value) {
                    this.initialCap = value;
                }

                /**
                 * Obtiene el valor de la propiedad paidUpCap.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaidUpCap() {
                    return paidUpCap;
                }

                /**
                 * Define el valor de la propiedad paidUpCap.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaidUpCap(String value) {
                    this.paidUpCap = value;
                }

                /**
                 * Obtiene el valor de la propiedad outstandingCap.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOutstandingCap() {
                    return outstandingCap;
                }

                /**
                 * Define el valor de la propiedad outstandingCap.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOutstandingCap(String value) {
                    this.outstandingCap = value;
                }

                /**
                 * Obtiene el valor de la propiedad formedDt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFormedDt() {
                    return formedDt;
                }

                /**
                 * Define el valor de la propiedad formedDt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFormedDt(XMLGregorianCalendar value) {
                    this.formedDt = value;
                }

                /**
                 * Obtiene el valor de la propiedad formedCountry.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormedCountry() {
                    return formedCountry;
                }

                /**
                 * Define el valor de la propiedad formedCountry.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormedCountry(String value) {
                    this.formedCountry = value;
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
             *         &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BranchesQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PortfolioProdSrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *                             &lt;element name="EmailStatus" maxOccurs="unbounded" minOccurs="0">
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
             *         &lt;element name="TINInfo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="GazetteNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ONTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "numEmployees",
                "type",
                "name",
                "legalName",
                "branchesQty",
                "portfolioProdSrv",
                "contactInfo",
                "tinInfo",
                "income",
                "organizationType",
                "gazetteNum",
                "ontCode"
            })
            public static class OrgInfo {

                @XmlElement(name = "NumEmployees", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String numEmployees;
                @XmlElement(name = "Type", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String type;
                @XmlElement(name = "Name", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String name;
                @XmlElement(name = "LegalName", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String legalName;
                @XmlElement(name = "BranchesQty", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String branchesQty;
                @XmlElement(name = "PortfolioProdSrv", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String portfolioProdSrv;
                @XmlElement(name = "ContactInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo contactInfo;
                @XmlElement(name = "TINInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.TINInfo> tinInfo;
                @XmlElement(name = "Income", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.Income income;
                @XmlElement(name = "OrganizationType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String organizationType;
                @XmlElement(name = "GazetteNum", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String gazetteNum;
                @XmlElement(name = "ONTCode", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String ontCode;

                /**
                 * Obtiene el valor de la propiedad numEmployees.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumEmployees() {
                    return numEmployees;
                }

                /**
                 * Define el valor de la propiedad numEmployees.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumEmployees(String value) {
                    this.numEmployees = value;
                }

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
                 * Obtiene el valor de la propiedad legalName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLegalName() {
                    return legalName;
                }

                /**
                 * Define el valor de la propiedad legalName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLegalName(String value) {
                    this.legalName = value;
                }

                /**
                 * Obtiene el valor de la propiedad branchesQty.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBranchesQty() {
                    return branchesQty;
                }

                /**
                 * Define el valor de la propiedad branchesQty.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBranchesQty(String value) {
                    this.branchesQty = value;
                }

                /**
                 * Obtiene el valor de la propiedad portfolioProdSrv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPortfolioProdSrv() {
                    return portfolioProdSrv;
                }

                /**
                 * Define el valor de la propiedad portfolioProdSrv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPortfolioProdSrv(String value) {
                    this.portfolioProdSrv = value;
                }

                /**
                 * Obtiene el valor de la propiedad contactInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo }
                 *     
                 */
                public ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo getContactInfo() {
                    return contactInfo;
                }

                /**
                 * Define el valor de la propiedad contactInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo }
                 *     
                 */
                public void setContactInfo(ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo value) {
                    this.contactInfo = value;
                }

                /**
                 * Gets the value of the tinInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tinInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTINInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.TINInfo }
                 * 
                 * 
                 */
                public List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.TINInfo> getTINInfo() {
                    if (tinInfo == null) {
                        tinInfo = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.TINInfo>();
                    }
                    return this.tinInfo;
                }

                /**
                 * Obtiene el valor de la propiedad income.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.Income }
                 *     
                 */
                public ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.Income getIncome() {
                    return income;
                }

                /**
                 * Define el valor de la propiedad income.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.Income }
                 *     
                 */
                public void setIncome(ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.Income value) {
                    this.income = value;
                }

                /**
                 * Obtiene el valor de la propiedad organizationType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrganizationType() {
                    return organizationType;
                }

                /**
                 * Define el valor de la propiedad organizationType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrganizationType(String value) {
                    this.organizationType = value;
                }

                /**
                 * Obtiene el valor de la propiedad gazetteNum.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGazetteNum() {
                    return gazetteNum;
                }

                /**
                 * Define el valor de la propiedad gazetteNum.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGazetteNum(String value) {
                    this.gazetteNum = value;
                }

                /**
                 * Obtiene el valor de la propiedad ontCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getONTCode() {
                    return ontCode;
                }

                /**
                 * Define el valor de la propiedad ontCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setONTCode(String value) {
                    this.ontCode = value;
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
                 *                   &lt;element name="EmailStatus" maxOccurs="unbounded" minOccurs="0">
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

                    @XmlElement(name = "PhoneNum", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.PhoneNum> phoneNum;
                    @XmlElement(name = "Email", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email> email;

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
                     * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.PhoneNum }
                     * 
                     * 
                     */
                    public List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.PhoneNum> getPhoneNum() {
                        if (phoneNum == null) {
                            phoneNum = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.PhoneNum>();
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
                     * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email }
                     * 
                     * 
                     */
                    public List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email> getEmail() {
                        if (email == null) {
                            email = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email>();
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
                     *         &lt;element name="EmailStatus" maxOccurs="unbounded" minOccurs="0">
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

                        @XmlElement(name = "EmailAddr", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                        protected String emailAddr;
                        @XmlElement(name = "EmailUse", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                        protected String emailUse;
                        @XmlElement(name = "EmailStatus", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                        protected List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email.EmailStatus> emailStatus;
                        @XmlElement(name = "MainInd", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
                         * Gets the value of the emailStatus property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the emailStatus property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getEmailStatus().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email.EmailStatus }
                         * 
                         * 
                         */
                        public List<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email.EmailStatus> getEmailStatus() {
                            if (emailStatus == null) {
                                emailStatus = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.Organization.OrgInfo.ContactInfo.Email.EmailStatus>();
                            }
                            return this.emailStatus;
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

                            @XmlElement(name = "Status", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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

                        @XmlElement(name = "PhoneUse", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                        protected String phoneUse;
                        @XmlElement(name = "Phone", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
                 *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                    "amt"
                })
                public static class Income {

                    @XmlElement(name = "Amt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected Double amt;

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
                 *         &lt;element name="TINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TaxIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="MainInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "tinType",
                    "taxIdPrefix",
                    "taxId",
                    "expDt",
                    "issDt",
                    "mainInd",
                    "country"
                })
                public static class TINInfo {

                    @XmlElement(name = "TINType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String tinType;
                    @XmlElement(name = "TaxIdPrefix", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String taxIdPrefix;
                    @XmlElement(name = "TaxId", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String taxId;
                    @XmlElement(name = "ExpDt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expDt;
                    @XmlElement(name = "IssDt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar issDt;
                    @XmlElement(name = "MainInd", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String mainInd;
                    @XmlElement(name = "Country", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                    protected String country;

                    /**
                     * Obtiene el valor de la propiedad tinType.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTINType() {
                        return tinType;
                    }

                    /**
                     * Define el valor de la propiedad tinType.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTINType(String value) {
                        this.tinType = value;
                    }

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
             *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "taxType",
                "taxExemptInd"
            })
            public static class Taxes {

                @XmlElement(name = "TaxType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String taxType;
                @XmlElement(name = "TaxExemptInd", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String taxExemptInd;

                /**
                 * Obtiene el valor de la propiedad taxType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxType() {
                    return taxType;
                }

                /**
                 * Define el valor de la propiedad taxType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxType(String value) {
                    this.taxType = value;
                }

                /**
                 * Obtiene el valor de la propiedad taxExemptInd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxExemptInd() {
                    return taxExemptInd;
                }

                /**
                 * Define el valor de la propiedad taxExemptInd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxExemptInd(String value) {
                    this.taxExemptInd = value;
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
             *         &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RegistryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RegistryDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="RegistryExpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "registryName",
                "registryNum",
                "volume",
                "folioNumber",
                "registryDt",
                "registryExpDt"
            })
            public static class TradeRegistry {

                @XmlElement(name = "RegistryName", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String registryName;
                @XmlElement(name = "RegistryNum", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String registryNum;
                @XmlElement(name = "Volume", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String volume;
                @XmlElement(name = "FolioNumber", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String folioNumber;
                @XmlElement(name = "RegistryDt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar registryDt;
                @XmlElement(name = "RegistryExpDt", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar registryExpDt;

                /**
                 * Obtiene el valor de la propiedad registryName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegistryName() {
                    return registryName;
                }

                /**
                 * Define el valor de la propiedad registryName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegistryName(String value) {
                    this.registryName = value;
                }

                /**
                 * Obtiene el valor de la propiedad registryNum.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegistryNum() {
                    return registryNum;
                }

                /**
                 * Define el valor de la propiedad registryNum.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegistryNum(String value) {
                    this.registryNum = value;
                }

                /**
                 * Obtiene el valor de la propiedad volume.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVolume() {
                    return volume;
                }

                /**
                 * Define el valor de la propiedad volume.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVolume(String value) {
                    this.volume = value;
                }

                /**
                 * Obtiene el valor de la propiedad folioNumber.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFolioNumber() {
                    return folioNumber;
                }

                /**
                 * Define el valor de la propiedad folioNumber.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFolioNumber(String value) {
                    this.folioNumber = value;
                }

                /**
                 * Obtiene el valor de la propiedad registryDt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getRegistryDt() {
                    return registryDt;
                }

                /**
                 * Define el valor de la propiedad registryDt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setRegistryDt(XMLGregorianCalendar value) {
                    this.registryDt = value;
                }

                /**
                 * Obtiene el valor de la propiedad registryExpDt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getRegistryExpDt() {
                    return registryExpDt;
                }

                /**
                 * Define el valor de la propiedad registryExpDt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setRegistryExpDt(XMLGregorianCalendar value) {
                    this.registryExpDt = value;
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
         *         &lt;element name="WithdrawalsInfo" minOccurs="0">
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
         *         &lt;element name="ElecTransInfo" minOccurs="0">
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
         *         &lt;element name="BalanceInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BalanceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="EntName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PresenCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SalesInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SalesAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "balanceInfo",
            "transferInfo",
            "fundsSrc",
            "currencyOpe",
            "entName",
            "presenCountry",
            "salesInfo"
        })
        public static class RegulatoryInfo {

            @XmlElement(name = "AcctUse", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String acctUse;
            @XmlElement(name = "DepositsInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.DepositsInfo depositsInfo;
            @XmlElement(name = "WithdrawalsInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.WithdrawalsInfo withdrawalsInfo;
            @XmlElement(name = "ElecTransInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.ElecTransInfo elecTransInfo;
            @XmlElement(name = "BalanceInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.BalanceInfo balanceInfo;
            @XmlElement(name = "TransferInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected List<ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.TransferInfo> transferInfo;
            @XmlElement(name = "FundsSrc", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String fundsSrc;
            @XmlElement(name = "CurrencyOpe", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.CurrencyOpe currencyOpe;
            @XmlElement(name = "EntName", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String entName;
            @XmlElement(name = "PresenCountry", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String presenCountry;
            @XmlElement(name = "SalesInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.SalesInfo salesInfo;

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
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.DepositsInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.DepositsInfo getDepositsInfo() {
                return depositsInfo;
            }

            /**
             * Define el valor de la propiedad depositsInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.DepositsInfo }
             *     
             */
            public void setDepositsInfo(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.DepositsInfo value) {
                this.depositsInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad withdrawalsInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.WithdrawalsInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.WithdrawalsInfo getWithdrawalsInfo() {
                return withdrawalsInfo;
            }

            /**
             * Define el valor de la propiedad withdrawalsInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.WithdrawalsInfo }
             *     
             */
            public void setWithdrawalsInfo(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.WithdrawalsInfo value) {
                this.withdrawalsInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad elecTransInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.ElecTransInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.ElecTransInfo getElecTransInfo() {
                return elecTransInfo;
            }

            /**
             * Define el valor de la propiedad elecTransInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.ElecTransInfo }
             *     
             */
            public void setElecTransInfo(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.ElecTransInfo value) {
                this.elecTransInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad balanceInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.BalanceInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.BalanceInfo getBalanceInfo() {
                return balanceInfo;
            }

            /**
             * Define el valor de la propiedad balanceInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.BalanceInfo }
             *     
             */
            public void setBalanceInfo(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.BalanceInfo value) {
                this.balanceInfo = value;
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
             * {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.TransferInfo }
             * 
             * 
             */
            public List<ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.TransferInfo> getTransferInfo() {
                if (transferInfo == null) {
                    transferInfo = new ArrayList<ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.TransferInfo>();
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
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.CurrencyOpe }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.CurrencyOpe getCurrencyOpe() {
                return currencyOpe;
            }

            /**
             * Define el valor de la propiedad currencyOpe.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.CurrencyOpe }
             *     
             */
            public void setCurrencyOpe(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.CurrencyOpe value) {
                this.currencyOpe = value;
            }

            /**
             * Obtiene el valor de la propiedad entName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntName() {
                return entName;
            }

            /**
             * Define el valor de la propiedad entName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntName(String value) {
                this.entName = value;
            }

            /**
             * Obtiene el valor de la propiedad presenCountry.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPresenCountry() {
                return presenCountry;
            }

            /**
             * Define el valor de la propiedad presenCountry.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPresenCountry(String value) {
                this.presenCountry = value;
            }

            /**
             * Obtiene el valor de la propiedad salesInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.SalesInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.SalesInfo getSalesInfo() {
                return salesInfo;
            }

            /**
             * Define el valor de la propiedad salesInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.SalesInfo }
             *     
             */
            public void setSalesInfo(ReadCustomerDataRsLegal.LegalCustomer.RegulatoryInfo.SalesInfo value) {
                this.salesInfo = value;
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
             *         &lt;element name="BalanceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "balanceRange"
            })
            public static class BalanceInfo {

                @XmlElement(name = "BalanceRange", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String balanceRange;

                /**
                 * Obtiene el valor de la propiedad balanceRange.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBalanceRange() {
                    return balanceRange;
                }

                /**
                 * Define el valor de la propiedad balanceRange.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBalanceRange(String value) {
                    this.balanceRange = value;
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

                @XmlElement(name = "CurrencyName", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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

                @XmlElement(name = "DepositsQty", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String depositsQty;
                @XmlElement(name = "DepositsRange", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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

                @XmlElement(name = "ElecTransQty", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String elecTransQty;
                @XmlElement(name = "ElecTransRange", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
             *         &lt;element name="SalesAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "salesAvg"
            })
            public static class SalesInfo {

                @XmlElement(name = "SalesAvg", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String salesAvg;

                /**
                 * Obtiene el valor de la propiedad salesAvg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSalesAvg() {
                    return salesAvg;
                }

                /**
                 * Define el valor de la propiedad salesAvg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSalesAvg(String value) {
                    this.salesAvg = value;
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

                @XmlElement(name = "TransferCountry", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String transferCountry;
                @XmlElement(name = "TransferType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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

                @XmlElement(name = "WithdrawalsQty", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
                protected String withdrawalsQty;
                @XmlElement(name = "WithdrawalsRange", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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

            @XmlElement(name = "RiskInfo", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected ReadCustomerDataRsLegal.LegalCustomer.Risk.RiskInfo riskInfo;

            /**
             * Obtiene el valor de la propiedad riskInfo.
             * 
             * @return
             *     possible object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Risk.RiskInfo }
             *     
             */
            public ReadCustomerDataRsLegal.LegalCustomer.Risk.RiskInfo getRiskInfo() {
                return riskInfo;
            }

            /**
             * Define el valor de la propiedad riskInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link ReadCustomerDataRsLegal.LegalCustomer.Risk.RiskInfo }
             *     
             */
            public void setRiskInfo(ReadCustomerDataRsLegal.LegalCustomer.Risk.RiskInfo value) {
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

                @XmlElement(name = "Rating", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
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
         *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxExemptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "taxType",
            "taxExemptInd"
        })
        public static class Taxes {

            @XmlElement(name = "TaxType", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String taxType;
            @XmlElement(name = "TaxExemptInd", namespace = "http://xmlns.banesco.com/ApplicationService/APILegalCustomerOutAppSvc")
            protected String taxExemptInd;

            /**
             * Obtiene el valor de la propiedad taxType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxType() {
                return taxType;
            }

            /**
             * Define el valor de la propiedad taxType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxType(String value) {
                this.taxType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxExemptInd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxExemptInd() {
                return taxExemptInd;
            }

            /**
             * Define el valor de la propiedad taxExemptInd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxExemptInd(String value) {
                this.taxExemptInd = value;
            }

        }

    }

}
