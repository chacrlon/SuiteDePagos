package com.suitepagos.backend.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suitepagos.backend.models.services.SoapClientService;
import com.suitepagos.backend.soap.webservice.ApplicantData;
import com.suitepagos.backend.soap.webservice.MsgRqHdr;
import com.suitepagos.backend.soap.webservice.NetworkTrnInfo;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqNatural;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqNatural.NaturalCustomer;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqNatural.NaturalCustomer.CustInfo;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRqNatural.NaturalCustomer.CustInfo.PersonInfo.GovIssueIdent;
import com.suitepagos.backend.soap.webservice.ReadCustomerDataRsNatural;
import com.suitepagos.backend.soap.webservice.VBProtocol;

@RestController
public class SoapClientRestController {
    
    @Autowired
    private SoapClientService scs;
    
    @PostMapping("/naturalClient")
    public Map<String, Object> getNatural(@RequestBody ReadCustomerDataRqNatural request) {
        //return scs.getNaturalClient(request);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
        long miliseconds = System.currentTimeMillis();
        Date trnDate = new Date(miliseconds);

        String dateText =  dateFormatter.format(trnDate);
        String timeText = timeFormatter.format(trnDate);
        
        /*DIR: 8917 | EMAIL: 8922 | DATOS: 8900N*/
        
        /****** BEGIN CREATE NODE msgRqHdr ******/
        VBProtocol vbProtocol = new VBProtocol();
        vbProtocol.setVBProtocolInd(true);
        vbProtocol.setTransactionInd(false);
        
        ApplicantData applicantData = new ApplicantData();
        applicantData.setApplication("APIMGMT");
        
        NetworkTrnInfo networkTrnInfo = new NetworkTrnInfo();
        //networkTrnInfo.setTransactionCode("8900N");
        networkTrnInfo.setTransactionDate("2006-08-19");
        networkTrnInfo.setTransactionTime("18:48:33");
        networkTrnInfo.setBankId("01");
        networkTrnInfo.setAgencyCode("0591");
        networkTrnInfo.setChannelUserId("TEST");
        
        MsgRqHdr msgRqHdr= new MsgRqHdr();
        msgRqHdr.setMessageDate(dateText);
        msgRqHdr.setMessageTime(timeText);
        msgRqHdr.setRequestId("123456789");
        msgRqHdr.setSourceChannelCode("INT");
        msgRqHdr.setSupervisorCode("BAN0591W01");
        msgRqHdr.setOperatorCode("BAN0591W01");
        msgRqHdr.setApplicantData(applicantData);
        msgRqHdr.setVBProtocol(vbProtocol);
        msgRqHdr.setNetworkTrnInfo(networkTrnInfo);
        /****** END CREATE NODE msgRqHdr ******/
        
        /****** BEGIN CREATE NODE naturalCustomer ******/
        GovIssueIdent govIssueIdent = new GovIssueIdent();
        govIssueIdent.setIdentSerialNumPrefix(request.getNaturalCustomer().getCustInfo().getPersonInfo().getGovIssueIdent().getIdentSerialNumPrefix());
        govIssueIdent.setIdentSerialNum(request.getNaturalCustomer().getCustInfo().getPersonInfo().getGovIssueIdent().getIdentSerialNum());

        PersonInfo personInfo = new PersonInfo();
        personInfo.setGovIssueIdent(govIssueIdent);
        
        CustInfo custInfo = new CustInfo();
        custInfo.setPersonInfo(personInfo);
        
        NaturalCustomer naturalCustomer = new NaturalCustomer();
        naturalCustomer.setCustInfo(custInfo);
        /****** END CREATE NODE naturalCustomer ******/

        networkTrnInfo.setTransactionCode("8900N");
        msgRqHdr.setNetworkTrnInfo(networkTrnInfo);
        request.setMsgRqHdr(msgRqHdr);
        request.setNaturalCustomer(naturalCustomer);
        ReadCustomerDataRsNatural readCustomerDataBasicRsNatural = scs.getNaturalClient(request);
        
        networkTrnInfo.setTransactionCode("8917");
        msgRqHdr.setNetworkTrnInfo(networkTrnInfo);
        request.setMsgRqHdr(msgRqHdr);
        ReadCustomerDataRsNatural readCustomerDataDirRs = scs.getNaturalClient(request);
        
        networkTrnInfo.setTransactionCode("8922");
        msgRqHdr.setNetworkTrnInfo(networkTrnInfo);
        request.setMsgRqHdr(msgRqHdr);
        ReadCustomerDataRsNatural readCustomerDataMailRs = scs.getNaturalClient(request);
        
        Map<String, Object> response = new HashMap<>();
        
        response.put("Basic: ", readCustomerDataBasicRsNatural.getNaturalCustomer());
        response.put("Dir: ", readCustomerDataDirRs.getNaturalCustomer());
        response.put("Mail: ", readCustomerDataMailRs.getNaturalCustomer());
        
        return response;
    }
    
}
