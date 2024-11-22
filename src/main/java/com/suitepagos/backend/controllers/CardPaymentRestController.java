package com.suitepagos.backend.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suitepagos.backend.models.entity.CardPayment;
import com.suitepagos.backend.models.entity.CardPaymentRequest;
import com.suitepagos.backend.models.entity.CardPaymentResponse;
import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.services.ICardPaymentRequestService;
import com.suitepagos.backend.models.services.ICardPaymentResponseService;
import com.suitepagos.backend.models.services.ICardPaymentService;
import com.suitepagos.backend.models.services.UserService;
import com.suitepagos.backend.utils.MyErrorHandler;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class CardPaymentRestController {
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Autowired
    private ICardPaymentService cps;

    @Autowired
    private ICardPaymentResponseService cprs;
    
    @Autowired
    private ICardPaymentRequestService cardPaymentService;

    private static final String INTERNATIONAL_CARD_URL = "https://api.instapago.com/Payment";
    /********* NEW ERIKSON ********/
    private static final String CREDENTIALCARDPAYMENT_URL = "http://localhost:8080/credentialCardPayment/{companyid}";
    /********* NEW ERIKSON ********/

    @RequestMapping(value = "/CardPayment", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> icOperation(@Valid @RequestBody CardPayment cp, BindingResult result)
            throws IOException, ParseException {

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
        long miliseconds = System.currentTimeMillis();
        Date trnDate = new Date(miliseconds);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.sql.Date fechaConvertida=null;
        String dateText = dateFormatter.format(trnDate);
        String trnTime = timeFormatter.format(trnDate);

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.setErrorHandler(new MyErrorHandler());

        ObjectMapper mapper = new JsonMapper();
        // String jsonString = mapper.writeValueAsString(cp);
        ObjectNode icNode = mapper.createObjectNode();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        /********** BEGIN validations json **********/
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors().stream()
                    .map(err -> "'" + err.getField() + "' " + err.getDefaultMessage()).collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        if (cp.getUser().getId() == null) {
            response.put("errors", "'UserId' es un campo requerido y no puede estar vacío");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }
        /********** END validations json **********/

        /*********** BEGIN control of user ***********/
        Users users = userService.findByUserId(cp.getUser().getId());

        if (users == null) {
            response.put("message", "Error interno de la aplicación - usuario no existe");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        /*********** END control of user ***********/

        /********* NEW ERIKSON ********/
        Map<String, String> paramCredentialCardPayment = new HashMap<>();
        paramCredentialCardPayment.put("companyid", users.getCompany().getCompanyid().toString());

        String responsekeyId = restTemplate.getForObject(CREDENTIALCARDPAYMENT_URL, String.class,
                paramCredentialCardPayment);
        JsonNode jsonresponsekeyId = mapper.readTree(responsekeyId);

        String KeyId = null;
        String PublicKeyId = null;
        if (jsonresponsekeyId.get("statusCode").asInt() == 200) {
            KeyId = jsonresponsekeyId.path("credentialCardPayment").get("keyid").asText();
            PublicKeyId = jsonresponsekeyId.path("credentialCardPayment").get("publickey").asText();
        } else {
            response.put("statusCode", HttpStatus.NOT_FOUND.value());
            response.put("message", "Credenciales no configuradas");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        /********* NEW ERIKSON ********/

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("KeyId", KeyId);
        params.add("PublicKeyId", PublicKeyId);
        params.add("Amount", cp.getAmount());
        params.add("Description", cp.getDescription());
        params.add("CardHolder", cp.getCardHolder());
        params.add("CardHolderID", cp.getCardHolderID());
        params.add("CardNumber", cp.getCardNumber());
        params.add("CVC", cp.getCVC());
        params.add("ExpirationDate", cp.getExpirationDate());
        params.add("StatusId", cp.getStatusId());
        params.add("IP", cp.getIP());
        params.add("OrderNumber", cp.getOrderNumber());
        params.add("Address", cp.getAddress());
        params.add("City", cp.getCity());
        params.add("ZipCode", cp.getZipCode());
        params.add("State", cp.getState());
        params.add("userid", cp.getUser().getId().toString());
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

        try {
            cp.setAmount(cp.getAmount());
            cp.setDescription(cp.getDescription());
            cp.setCardHolder(cp.getCardHolder());
            cp.setCardHolderID(cp.getCardHolderID());
            /*********** CardNumber Encryption ***********/
            String cardNumberEncrypt = cp.getCardNumber();
            String passwordBcrypt = passwordEncoder.encode(cardNumberEncrypt);
            /***********  ***********/
            cp.setCardNumber(passwordBcrypt);
            cp.setCVC(cp.getCVC());
            cp.setExpirationDate(cp.getExpirationDate());
            cp.setStatusId(cp.getStatusId());
            cp.setIP(cp.getIP());
            cp.setOrderNumber(cp.getOrderNumber());
            cp.setAddress(cp.getAddress());
            cp.setCity(cp.getCity());
            cp.setZipCode(cp.getZipCode());
            cp.setState(cp.getState());
            cp.setUser(users);
            CardPayment icNew = cps.save(cp);

        } catch (DataAccessException e) {
            response.put("message", "Error interno al insertar transaccion en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        ResponseEntity<String> icResponseEntity = restTemplate.postForEntity(INTERNATIONAL_CARD_URL, requestEntity,
                String.class);

        /*********** BEGIN control of response ***********/
        JsonNode jsonResponse = mapper.readTree(icResponseEntity.getBody());

        Integer statusCodeNode = icResponseEntity.getStatusCodeValue();
        String statusCodeNodeString = String.valueOf(statusCodeNode);

        String Success = null;
        String Message = null;
        String Id = null;
        String Code = statusCodeNodeString;
        String Reference = null;
        String Voucher = null;
        String OrderNumber = null;
        String Sequence = null;
        String Approval = null;
        String Lote = null;
        String ResponseCode = null;
        String Deferred = null;
        String DateTime = (dateText + " " + trnTime);
        try {
            Date parsed =  (Date) dateFormat.parse(DateTime);
            fechaConvertida = new java.sql.Date(parsed.getTime());
        } catch(Exception e) {
            System.out.println("Error occurred"+ e.getMessage());
        }
        String Amount = null;
        System.out.println( "La fecha y hora actuales son 3 : " + DateTime);
        String statusDescNode = null;
        String referenceNumberNode = null;
        Code = jsonResponse.path("code").asText();
        if (statusCodeNode >= 200 && statusCodeNode < 300) {
            Success = jsonResponse.path("success").asText();
            Message = jsonResponse.path("message").asText();
            Id = jsonResponse.path("id").asText();
            Code = jsonResponse.path("code").asText();
            Reference = jsonResponse.path("reference").asText();
            Voucher = jsonResponse.path("voucher").asText();
            OrderNumber = jsonResponse.path("ordernumber").asText();
            Sequence = jsonResponse.path("sequence").asText();
            Approval = jsonResponse.path("approval").asText();
            Lote = jsonResponse.path("lote").asText();
            ResponseCode = jsonResponse.path("responsecode").asText();
            Deferred = jsonResponse.path("deferred").asText();
            DateTime = DateTime;
            Amount = jsonResponse.path("amount").asText();

        } else {
            Message = icResponseEntity.getStatusCode().name();
            Code = statusCodeNodeString;
        }

        ObjectNode httpStatusNode = mapper.createObjectNode();
        ((ObjectNode) httpStatusNode).put("success", Success);
        ((ObjectNode) httpStatusNode).put("message", Message);
        ((ObjectNode) httpStatusNode).put("id", Id);
        ((ObjectNode) httpStatusNode).put("code", Code);
        ((ObjectNode) httpStatusNode).put("reference", Reference);
        ((ObjectNode) httpStatusNode).put("voucher", Voucher);
        ((ObjectNode) httpStatusNode).put("ordernumber", OrderNumber);
        ((ObjectNode) httpStatusNode).put("sequence", Sequence);
        ((ObjectNode) httpStatusNode).put("approval", Approval);
        ((ObjectNode) httpStatusNode).put("lote", Lote);
        ((ObjectNode) httpStatusNode).put("responsecode", ResponseCode);
        ((ObjectNode) httpStatusNode).put("deferred", Deferred);
        ((ObjectNode) httpStatusNode).put("datetime", DateTime);
        ((ObjectNode) httpStatusNode).put("amount", Amount);
        ((ObjectNode) httpStatusNode).put("dataResponse", icNode);

        // Los parametros del ICNODE
        ((ObjectNode) icNode).put("Amount", cp.getAmount());
        ((ObjectNode) icNode).put("Description", cp.getDescription());
        ((ObjectNode) icNode).put("CardHolder", cp.getCardHolder());
        ((ObjectNode) icNode).put("CardHolderID", cp.getCardHolderID());
        ((ObjectNode) icNode).put("CardNumber", cp.getCardNumber());
        ((ObjectNode) icNode).put("StatusId", cp.getStatusId());
        ((ObjectNode) icNode).put("IP", cp.getIP());

        try {
            CardPaymentResponse responseic = new CardPaymentResponse();
            responseic.setSuccess(Success);
            responseic.setMessage(Message);
            responseic.setId(Id);
            responseic.setCode(Code);
            responseic.setReference(Reference);
            responseic.setVoucher(Voucher);
            responseic.setOrdernumber(OrderNumber);
            responseic.setSequence(Sequence);
            responseic.setApproval(Approval);
            responseic.setLote(Lote);
            responseic.setResponsecode(ResponseCode);
            responseic.setDeferred(Deferred);
            responseic.setDatetime(DateTime);
            responseic.setAmount(Amount);
            responseic.setIcid(cp);

            CardPaymentResponse responseicNew = cprs.save(responseic);
        } catch (DataAccessException e) {
            response.put("message", "Error interno de la aplicación - control response ");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(httpStatusNode, icResponseEntity.getStatusCode());
    }
    
    @RequestMapping(value = "/CardPaymentRequest", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> cardPaymentRequestOp(@Valid @RequestBody CardPaymentRequest cp, BindingResult result)
            throws IOException, ParseException {
        
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long miliseconds = System.currentTimeMillis();
        Date trnDate = new Date(miliseconds);

        String dateTimeText = dateTimeFormatter.format(trnDate);
        
        /********** BEGIN validations json **********/
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors().stream()
                    .map(err -> "'" + err.getField() + "' " + err.getDefaultMessage()).collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        if (cp.getUser().getId() == null) {
            response.put("errors", "'user.Id' es un campo requerido y no puede estar vacío");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }
        /********** END validations json **********/

        /*********** BEGIN control of user ***********/
        Users users = userService.findByUserId(cp.getUser().getId());

        if (users == null) {
            response.put("message", "Error interno de la aplicación - usuario no existe");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        /*********** END control of user ***********/

        String paymentidOld = null;
        paymentidOld = cardPaymentService.getPaymentId(users.getCompany().getCustomerid());
        
        if (paymentidOld == null) {
            paymentidOld = "0";
        }
        int PaymentidEntero = Integer.parseInt(paymentidOld);
        PaymentidEntero = PaymentidEntero + 1;
        String Paymentid = String.valueOf(PaymentidEntero);
        
        try {
            cp.setPaymentId(Paymentid);
            cp.setCreatedat(dateTimeText);
            CardPaymentRequest edNew = cardPaymentService.save(cp);
        } catch (DataAccessException e) {
            response.put("message", "Error interno al insertar transaccion en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        ObjectMapper mapper = new JsonMapper();
        ObjectNode cardPaymentRequestNode = mapper.createObjectNode();
        ((ObjectNode) cardPaymentRequestNode).put("paymentId", cp.getPaymentId());
        ((ObjectNode) cardPaymentRequestNode).put("phoneNum", cp.getPhoneNum());
        ((ObjectNode) cardPaymentRequestNode).put("email", cp.getEmail());
        ((ObjectNode) cardPaymentRequestNode).put("amount", cp.getAmount());
        ((ObjectNode) cardPaymentRequestNode).put("concept", cp.getConcept());
        ((ObjectNode) cardPaymentRequestNode).put("createdat", cp.getCreatedat());

        response.put("message", "Se ha solicitado el pago");
        response.put("cardPaymentRequest", cardPaymentRequestNode);
        response.put("url", "http://localhost:8080/CardPayment/paymentid/"+cp.getPaymentId()+"/company/"+users.getCompany().getCustomerid());      
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    @GetMapping("/CardPayment/paymentid/{paymentId}/company/{customerId}")
    public ResponseEntity<?> getCardPayment(@PathVariable String paymentId, @PathVariable String customerId) {
        
        Map<String, Object> response = new HashMap<>();
        
        Map<String, Object> cardPaymentRequest= null;
        try {
            cardPaymentRequest = cardPaymentService.getCardPayment(paymentId, customerId);
        } catch(DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        
        if(cardPaymentRequest.isEmpty()) {
            response.put("statusCode", HttpStatus.NOT_FOUND.value());
            response.put("message", "No existe en la base de datos");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        
        response.put("statusCode", HttpStatus.OK.value());
        response.put("message", "Consulta exitosa");
        response.put("cardPaymentRequest", cardPaymentRequest);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @GetMapping("/ic")
    public List<CardPayment> index() {
        return cps.findAll();
    }

    @GetMapping("/CardPayment/{id}")
    public List<Map<String, Object>> getCardPaymentById(@PathVariable Long id) {
        return cprs.findByIdCardPayment(id);
    }
    
    @GetMapping("/CardPayment/page/{page}")
    public Page<List<Map<String, Object>>> indexCardPayment(@PathVariable Integer page) {
        Pageable pageable = PageRequest.of(page, 1);
        return cprs.findAllTransactionPageCardPayments(pageable);
    }

    @GetMapping("/CardPayment")
    public List<Map<String, Object>> getAllCardPayment() {
        return cprs.findAllTransactionCardPayments();
    }
    
    @GetMapping("/CardPayment/{fecIni}/{fecFin}")
    public List<Map<String, Object>> getCardPaymentParam(@PathVariable Date fecIni, @PathVariable Date fecFin) {
        return cprs.findByParamCardPayment(fecIni, fecFin);
    }


}