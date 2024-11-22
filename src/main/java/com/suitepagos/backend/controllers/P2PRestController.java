package com.suitepagos.backend.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
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

import com.suitepagos.backend.models.entity.AccountFrom;
import com.suitepagos.backend.models.entity.AccountTo;
import com.suitepagos.backend.models.entity.Device;
import com.suitepagos.backend.models.entity.P2P;
import com.suitepagos.backend.models.entity.P2PResponse;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.services.IAccountFromService;
import com.suitepagos.backend.models.services.IAccountToService;
import com.suitepagos.backend.models.services.IDeviceService;
import com.suitepagos.backend.models.services.IP2PResponseService;
import com.suitepagos.backend.models.services.Ip2pService;
import com.suitepagos.backend.models.services.UserService;
import com.suitepagos.backend.utils.MyErrorHandler;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class P2PRestController {

    @Autowired
    private IDeviceService deviceService;

    @Autowired
    private IAccountFromService accountFromService;

    @Autowired
    private IAccountToService accountToService;

    @Autowired
    private Ip2pService p2pService;

    @Autowired
    private UserService userService;

    @Autowired
    private IP2PResponseService it;

    private static final String TOKEN_P2P_URL = "https://sso-sso-project.apps.desplakur3.desintra.banesco.com/auth/realms/realm-api-qa/protocol/openid-connect/token";
    private static final String P2P_URL = "https://apis-p2p-grantflow-api-qa-apicast-production.apps.desplakur3.desintra.banesco.com/payments/payment/p2p";
    private static final String VALUECREDENTIAL_URL = "http://localhost:8080/credentialp2p/{companyid}";

    // @Secured("ROLE_P2P")
    @RequestMapping(value = "/p2p", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> p2pOperation(@Valid @RequestBody P2P p2p, BindingResult result)
            throws IOException, ParseException {

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// set custom error handler
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        restTemplate.setErrorHandler(new MyErrorHandler() {
            public boolean hasError(ClientHttpResponse response) throws IOException {
                HttpStatus statusCode = response.getStatusCode();
                return statusCode.series() == HttpStatus.Series.SERVER_ERROR;
            }
        });

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("ss:mm:HH");
        long miliseconds = System.currentTimeMillis();
        Date trnDate = new Date(miliseconds);

        String dateText = dateFormatter.format(trnDate);
        String trnTime = timeFormatter.format(trnDate);
        String srvType = "P2P";

        ObjectMapper mapper = new JsonMapper();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        /********** BEGIN OPERATION P2P **********/

        /********** BEGIN validaciones json **********/
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors().stream()
                    .map(err -> "'" + err.getField() + "' " + err.getDefaultMessage()).collect(Collectors.toList());

            response.put("statusCode", HttpStatus.BAD_REQUEST.value());
            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        if (p2p.getUser().getId() == null) {
            response.put("statusCode", HttpStatus.BAD_REQUEST.value());
            response.put("errors", "'user.id' es un campo requerido y no puede estar vacío");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        /********** END validaciones json **********/

        /*********** BEGIN control de device ***********/
        Device deviceNew = deviceService.findByData(p2p.getDevice().getDescription(), p2p.getDevice().getIpAddress(),
                p2p.getDevice().getType());

        if (deviceNew == null) {
            try {
                Device device = new Device();
                device.setType(p2p.getDevice().getType());
                device.setDescription(p2p.getDevice().getDescription());
                device.setIpAddress(p2p.getDevice().getIpAddress());
                deviceNew = deviceService.save(device);
            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error interno de la aplicación - insert device ");
                response.put("error", e.getMostSpecificCause().getMessage());
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
            }
        }
        /*********** END control de device ***********/

        /*********** BEGIN control de account_from ***********/
        AccountFrom accountFromNew = accountFromService.findByData("0134");

        if (accountFromNew == null) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error interno de la aplicación - configurar account_from ");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        /*********** END control de account_from ***********/

        /*********** BEGIN control de account_to ***********/
        AccountTo accountToNew = accountToService.findByData(p2p.getAccountTo().getBankId(),
                p2p.getAccountTo().getCustomerId(), p2p.getAccountTo().getPhoneNum());

        if (accountToNew == null) {
            try {
                AccountTo accountTo = new AccountTo();
                accountTo.setBankId(p2p.getAccountTo().getBankId());
                accountTo.setPhoneNum(p2p.getAccountTo().getPhoneNum());
                accountTo.setCustomerId(p2p.getAccountTo().getCustomerId());
                accountToNew = accountToService.save(accountTo);
            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error interno de la aplicación - insert account_to ");
                response.put("error", e.getMostSpecificCause().getMessage());
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
            }
        }
        /*********** END control de account_to ***********/

        /*********** BEGIN control de user ***********/
        Users users = userService.findByUserId(p2p.getUser().getId());

        if (users == null) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error interno de la aplicación - usuario no existe");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        /*********** END control de user ***********/

        Map<String, String> paramCredentialP2P = new HashMap<>();
        paramCredentialP2P.put("companyid", users.getCompany().getCompanyid().toString());

        String responseCredentialP2P = restTemplate.getForObject(VALUECREDENTIAL_URL, String.class, paramCredentialP2P);
        JsonNode jsonresponsekeyId = mapper.readTree(responseCredentialP2P);

        String ClienID = null;
        String ClientSecret = null;
        if (jsonresponsekeyId.get("statusCode").asInt() == 200) {
            ClienID = jsonresponsekeyId.path("credentialp2p").get("clientid").asText();
            ClientSecret = jsonresponsekeyId.path("credentialp2p").get("clientsecret").asText();
        } else {
            response.put("statusCode", HttpStatus.NOT_FOUND.value());
            response.put("message", "Credenciales no configuradas");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        String originalInput = ClienID + ":" + ClientSecret;
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

        headers.add("Authorization", "Basic " + encodedString);
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "password");
        params.add("username", ClienID);
        params.add("password", ClientSecret);
        params.add("scope", "SuitePagosBackend");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

        System.out.println(requestEntity);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(TOKEN_P2P_URL, requestEntity, String.class);
        System.out.println("Salio");
        System.out.println(responseEntity);

        Integer statusCodeNodeToken = responseEntity.getStatusCodeValue();
        System.out.println(statusCodeNodeToken);
        if (statusCodeNodeToken >= 400) {
            response.put("statusCode", HttpStatus.UNAUTHORIZED.value());
            response.put("message", "Cliente inautorizado");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.UNAUTHORIZED);
        }

        JsonNode json = mapper.readTree(responseEntity.getBody());
        String access_token = json.get("access_token").asText();

        HttpHeaders p2pHeaders = new HttpHeaders();
        p2pHeaders.setContentType(MediaType.APPLICATION_JSON);
        p2pHeaders.add("Authorization", "Bearer " + access_token);

        /*********** BEGIN control de p2p ***********/
        P2P p2pNew = p2pService.findByPaymentId(p2p.getPaymentId());

        if (p2pNew == null) {
            try {
                p2p.setAccountFrom(accountFromNew);
                p2p.setAccountTo(accountToNew);
                p2p.setDevice(deviceNew);
                p2p.setAmount(p2p.getAmount());
                p2p.setConcept(p2p.getConcept());
                p2p.setPaymentId(p2p.getPaymentId());
                p2p.setTrnDate(trnDate);
                p2p.setTrnTime(trnTime);
                p2p.setSrvType(srvType);
                p2p.setUser(users);
                p2pNew = p2pService.save(p2p);
            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error interno al insertar transaccion en la base de datos");
                response.put("error", e.getMostSpecificCause().getMessage());
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
            }
        } else {
            response.put("statusCode", HttpStatus.CONFLICT.value());
            response.put("message", "La factura: " + p2p.getPaymentId() + ", ya fue procesada.");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        /*********** END control de p2p ***********/

        /*********** BEGIN estructura p2p endpoint ***********/
        String jsonString = mapper.writeValueAsString(p2p);

        JsonNode jsonBody = mapper.readTree(jsonString);
        JsonNode deviceNode = jsonBody.path("device");
        JsonNode accountFromNode = jsonBody.path("accountFrom");
        JsonNode accountToNode = jsonBody.path("accountTo");

        ObjectNode p2pNode = mapper.createObjectNode();
        ((ObjectNode) p2pNode).put("accountFrom", accountFromNode);
        ((ObjectNode) p2pNode).put("accountTo", accountToNode);
        ((ObjectNode) p2pNode).put("amount", p2p.getAmount());
        ((ObjectNode) p2pNode).put("concept", p2p.getConcept());
        ((ObjectNode) p2pNode).put("paymentId", p2p.getPaymentId());
        // ((ObjectNode) p2pNode).put("trnDate", dateText);
        ((ObjectNode) p2pNode).put("trnDate", dateText);
        ((ObjectNode) p2pNode).put("trnTime", trnTime);
        ((ObjectNode) p2pNode).put("srvType", srvType);

        ObjectNode dataRequestNode = mapper.createObjectNode();
        ((ObjectNode) dataRequestNode).put("device", deviceNode);
        ((ObjectNode) dataRequestNode).put("p2p", p2pNode);

        ObjectNode node = mapper.createObjectNode();
        node.put("dataRequest", dataRequestNode);
        /*********** END estructura p2p endpoint ***********/

        HttpEntity<Object> entity = new HttpEntity<>(node, p2pHeaders);
        ResponseEntity<String> p2pResponseEntity = restTemplate.postForEntity(P2P_URL, entity, String.class);
        System.out.println("ENTRO AQUI" + p2pResponseEntity);
        /*********** BEGIN control de response ***********/
        JsonNode jsonResponse = mapper.readTree(p2pResponseEntity.getBody());

        Integer statusCodeNode = p2pResponseEntity.getStatusCodeValue();
        String statusCodeNodeString = String.valueOf(statusCodeNode);
        String statusDescNode = null;
        String referenceNumberNode = null;
        if (statusCodeNode >= 200 && statusCodeNode < 300) {
            statusDescNode = jsonResponse.path("httpStatus").path("statusDesc").asText();
            referenceNumberNode = jsonResponse.path("dataResponse").path("referenceNumber").asText();
        } else if (statusCodeNode == 404) {
            statusDescNode = p2pResponseEntity.getStatusCode().name();
            referenceNumberNode = null;
        } else {
            statusDescNode = p2pResponseEntity.getStatusCode().name();
            statusDescNode = jsonResponse.path("httpStatus").path("statusDesc").asText();
            referenceNumberNode = null;
        }
        ObjectNode httpStatusNode = mapper.createObjectNode();
        ((ObjectNode) httpStatusNode).put("statusCode", statusCodeNode);
        ((ObjectNode) httpStatusNode).put("statusDesc", statusDescNode);

        ObjectNode dataResponseNode = mapper.createObjectNode();
        ((ObjectNode) dataResponseNode).put("referenceNumber", referenceNumberNode);
        ((ObjectNode) dataResponseNode).put("p2p", p2pNode);

        ObjectNode responseEntityNode = mapper.createObjectNode();
        ((ObjectNode) responseEntityNode).put("httpStatus", httpStatusNode);
        ((ObjectNode) responseEntityNode).put("dataResponse", dataResponseNode);

        try {
            P2PResponse responseP2p = new P2PResponse();
            responseP2p.setStatusCode(statusCodeNodeString);
            responseP2p.setStatusDesc(statusDescNode);
            responseP2p.setReferenceNumber(referenceNumberNode);
            responseP2p.setP2pid(p2p);
            P2PResponse responseP2pNew = it.save(responseP2p);
        } catch (DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error interno de la aplicación - control response ");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        // return new ResponseEntity<>(responseEntityNode,
        // p2pResponseEntity.getStatusCode());
        return new ResponseEntity<>(responseEntityNode, HttpStatus.OK);
        /*********** END control de response ***********/

        /********** END OPERATION P2P **********/
    }

    @GetMapping("/p2p/page/{page}")
    public Page<List<Map<String, Object>>> index(@PathVariable Integer page) {
        Pageable pageable = PageRequest.of(page, 1);
        return it.findAllTransactionPage(pageable);
    }

    @GetMapping("/p2p/{id}")
    public List<Map<String, Object>> getP2pById(@PathVariable Long id) {
        return it.findByTransactionId(id);
    }

    @GetMapping("/p2p/{fecIni}/{fecFin}")
    public List<Map<String, Object>> getP2pParam(@PathVariable Date fecIni, @PathVariable Date fecFin) {
        return it.findByParam(fecIni, fecFin);
    }

    @GetMapping("/p2p")
    public List<Map<String, Object>> getAllP2p() {
        return it.findAllTransaction();
    }

    @GetMapping("/transactions")
    public List<Map<String, Object>> getTenP2p() {
        return it.findTenTransaction();
    }

}