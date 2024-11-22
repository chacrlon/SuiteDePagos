package com.suitepagos.backend.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.suitepagos.backend.models.entity.Transfer;
import com.suitepagos.backend.models.entity.TransferResponse;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.services.ITransferResponseService;
import com.suitepagos.backend.models.services.ITransferService;
import com.suitepagos.backend.models.services.UserService;
import com.suitepagos.backend.utils.DateTimeSuite;
import com.suitepagos.backend.utils.MyErrorHandler;


@RestController
public class TransferController {

    @Autowired
    private UserService userService;

    @Autowired
    private ITransferService ts;
    
    @Autowired
    private ITransferResponseService trs;


    private static final String CREDITO_INMEDIATO_URL = "http://10.132.212.11:4563/api/innovacion/obtenerCreditoInmediato";

       @ExceptionHandler(MethodArgumentNotValidException.class)
       @PostMapping("/validatetransfer")
        public ResponseEntity<?> showMovilePayment(@Valid @RequestBody Transfer pm, 
                BindingResult result) {
         
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
           String dateFormateada=DateTimeSuite.dateFormateada;
           
           String exist = ts.existData(pm.getReference(), pm.getAmount(), pm.getCedEmisor());


           Map<String, Object> response = new HashMap<>();

           if (result.hasErrors()) {

               List<String> errors = result.getFieldErrors().stream()
                       .map(err -> "'" + err.getField() + "' " + err.getDefaultMessage()).collect(Collectors.toList());

               response.put("statusCode", HttpStatus.BAD_REQUEST.value());
               response.put("errors", errors);
               return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
           }
           /*********** BEGIN control of user ***********/
           if (pm.getUser().getId() == null) {
               response.put("errors", "'UserId' es un campo requerido y no puede estar vacío");
               return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
           }
           Users users = userService.findByUserId(pm.getUser().getId());
           if (users == null) {
               response.put("message", "Error interno de la aplicación - usuario no existe");
               return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
           }
           /*********** END control of user ***********/

           if(exist==null&&dateFormateada!=null) {
               try {                    
                   String urlTemplate = UriComponentsBuilder.fromHttpUrl(CREDITO_INMEDIATO_URL)
                           .queryParam("referecia", pm.getReference())
                           .queryParam("monto", pm.getAmount())
                           .queryParam("cuentaEmisor", pm.getIssueraccount())
                           .queryParam("cedEmisor", pm.getCedEmisor())
                           .encode()
                           .toUriString();
                   System.out.println(urlTemplate);        
                   String responseTransferencia = restTemplate.getForObject(urlTemplate, String.class);
                   String str=responseTransferencia;
                   boolean resultado=str.startsWith("{\"DATA\":[]");
                   System.out.println(resultado);  
                   System.out.println(responseTransferencia);                
                   
                   if(resultado==true) {
                       response.put("message", "Estos valores no existen"); 
                       response.put("date", dateFormateada);
                       response.put("statusCode", HttpStatus.NOT_FOUND.value()); 
                   }
                   if(resultado==false) { 
                       pm.setReference(pm.getReference());
                       pm.setAmount(pm.getAmount());
                       pm.setIssueraccount(pm.getIssueraccount());
                       pm.setCedEmisor(pm.getCedEmisor());
                       pm.setCreatedat(dateFormateada);
                       pm.setUser(users);                                                    
                       Transfer pmNew = ts.save(pm);      
                       response.put("message", "Credito inmediato validado exitosamente"); 
                       response.put("date", dateFormateada);
                       response.put("statusCode", HttpStatus.OK.value());   
                      
                       TransferResponse responsepa = new TransferResponse();
                       responsepa.setStatusCode("200");
                       responsepa.setMessage("Credito inmediato validado exitosamente");
                       responsepa.setFecha(dateFormateada);
                       responsepa.setTid(pm);
                       TransferResponse TransferResponseNew = trs.save(responsepa);            
                   }                 
                   
               } catch (DataAccessException e) {
                   response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                   response.put("message", "Error interno al consultar pago");
                   response.put("error", e.getMostSpecificCause().getMessage());
                   return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
               }
           }
           else{ 
                    response.put("message", "Validacion fallida "
                                         + "¡Atencion! "
                                         + "Esta transaccion fue validada previamente"); 
                    response.put("date", dateFormateada);
                    response.put("statusCode", HttpStatus.ALREADY_REPORTED.value());
                }  
           return new ResponseEntity<>(response, HttpStatus.OK);   
           }    
       
       @GetMapping("/tr")
        public List<Transfer> index() {
            return ts.findAll();
        }     
       
       @GetMapping("/transfer/{id}")
       public List<Map<String, Object>> getTransferById(@PathVariable Long id) {
           return ts.findByIdTransfer(id);
       }
       
       @GetMapping("/transfer")
       public List<Map<String, Object>> getAllTransfer() {
           return ts.findAllTransactionTransfer();
       }
       
       @GetMapping("/transfer/page/{page}")
       public Page<List<Map<String, Object>>> indexTransfer(@PathVariable Integer page) {
           Pageable pageable = PageRequest.of(page, 1);
           return ts.findAllTransactionPageTransfer(pageable);
       }
       
       @GetMapping("/transfer/{fecIni}/{fecFin}")
       public List<Map<String, Object>> getTransferParam(@PathVariable Date fecIni, @PathVariable Date fecFin) {
           return ts.findByParamTransfer(fecIni, fecFin);
       }
       
       @GetMapping("/transactions/transfer")
       public List<Map<String, Object>> getTenTransfer() {
           return ts.findTenTransactionTransfer();
       }
       
       @GetMapping("/transactionsSuitepagos")
       public List<Map<String, Object>> getfindTenTransactionSuitePagos() {
           return ts.findTenTransactionSuitePagos();
       }
}