package com.suitepagos.backend.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suitepagos.backend.models.entity.Company;
import com.suitepagos.backend.models.entity.CredentialCardPayment;
import com.suitepagos.backend.models.entity.CredentialP2P;
import com.suitepagos.backend.models.entity.ModuleConfig;
import com.suitepagos.backend.models.services.ICompanyService;
import com.suitepagos.backend.models.services.ICredentialCardPaymentService;
import com.suitepagos.backend.models.services.ICredentialP2PService;
import com.suitepagos.backend.models.services.IModuleConfigService;
import com.suitepagos.backend.utils.DateTimeSuite;
import com.suitepagos.backend.utils.MyErrorHandler;

@RestController
public class CredentialConfigRestController {
    
    @Autowired
    private ICredentialCardPaymentService ccps;
    
    @Autowired
    private ICredentialP2PService p2p;
    
    @Autowired
    private ICompanyService cmp;
    
    @Autowired
    private IModuleConfigService mc;
    
    private static final String SET_MODULE_URL = "http://localhost:8080/companyid/{companyid}/moduleid/{moduleid}";
    
    String dateFormateada=DateTimeSuite.dateFormateada;
    
    @GetMapping("/company")
    public List<Company> getCompany() {
        return cmp.findAll();
    }
    
    @GetMapping("/module/companyid/{id}")
    public ResponseEntity<?> getModuleByCompany(@PathVariable Long id) {
        
        List<ModuleConfig> moduleCompany = null;
        Map<String, Object> response = new HashMap<>();

        try {
            moduleCompany = mc.findModuleByCompany(id);
        } catch (DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        if (moduleCompany == null) {
            response.put("statusCode", HttpStatus.NOT_FOUND.value());
            response.put("message", "Modulo no encontrado");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        
        response.put("statusCode", HttpStatus.OK.value());
        response.put("message", "Consula exitosa");
        response.put("module", moduleCompany);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @GetMapping("/companyid/{companyid}/moduleid/{moduleid}")
    public ResponseEntity<?> companyModule(@PathVariable Long companyid, @PathVariable Long moduleid) {
        
        Map<String, Object> response = new HashMap<>();
        Company company =null;
        List<ModuleConfig> moduleConfig=null;
        try {
            company =  cmp.findById(companyid);
        } catch (DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        try {
            moduleConfig =  mc.findByIdList(moduleid);
            moduleConfig.addAll(company.getModule());
        } catch (DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        String exist = mc.existModuleCompany(moduleid, companyid);
        if(exist==null) {
            try {
                company.setModule(moduleConfig);
                cmp.save(company);
            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error interno al actualizar modulos");
                response.put("error", e.getMostSpecificCause().getMessage());
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
            }
        }

        response.put("message", "Modulo configurado con exito");
        response.put("statusCode", HttpStatus.CREATED.value());
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    @GetMapping("/credentialCardPayment")
    public List<CredentialCardPayment> index() {
        return ccps.findAll();
    }

    @GetMapping("/credentialCardPayment/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {

        CredentialCardPayment ccp = null;
        Map<String, Object> response = new HashMap<>();

        try {
            ccp = ccps.findByCompanyId(id);
        } catch (DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        if (ccp == null) {
            response.put("statusCode", HttpStatus.NOT_FOUND.value());
            response.put("message", "La Credencial ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        
        response.put("statusCode", HttpStatus.OK.value());
        response.put("message", "Consula exitosa");
        response.put("credentialCardPayment", ccp);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/credentialCardPayment")
    public ResponseEntity<?> create(@Valid @RequestBody CredentialCardPayment credentialCardPayment,
            BindingResult result) {

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.setErrorHandler(new MyErrorHandler());

        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        CredentialCardPayment ccpNew = ccps.findByCompanyId(credentialCardPayment.getCompany().getCompanyid());

        if (ccpNew == null) {
            try {               
                credentialCardPayment.setCreatedat(dateFormateada);
                ccpNew = ccps.save(credentialCardPayment);
            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error al realizar el insert en la base de datos");
                response.put("error", e.getMostSpecificCause().getMessage());
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            response.put("statusCode", HttpStatus.CONFLICT.value());
            response.put("message", "Ya existen las credenciales para la compañia ID: "
                    + credentialCardPayment.getCompany().getCompanyid());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        Map<String, Object> param = new HashMap<>();
        param.put("companyid", credentialCardPayment.getCompany().getCompanyid());
        param.put("moduleid", "1");
        String responseModule = restTemplate.getForObject(SET_MODULE_URL, String.class, param);
        
        response.put("message", "Credenciales creadas con éxito!");
        response.put("statusCode", HttpStatus.CREATED.value());
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    @PutMapping("/credentialCardPayment/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody CredentialCardPayment credentialCardPayment,
            BindingResult result, @PathVariable Long id) {

        RestTemplate restTemplate = new RestTemplate();
        /** message **/
        CredentialCardPayment credentialCardPaymentUpdated= null;
        
        CredentialCardPayment CredentialCardPaymentActual = ccps.findById(id);
        
        restTemplate.setErrorHandler(new MyErrorHandler());

        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        CredentialCardPayment ccpNew = ccps.findByCompanyId(credentialCardPayment.getCompany().getCompanyid());

        if (CredentialCardPaymentActual == null) {
            response.put("message", "Error: no se pudo editar, la credencial: "
                    .concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        
            try {

                /*********** BEGIN control of TIME ***********/
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy ss:mm:HH");
                long miliseconds = System.currentTimeMillis();
                Date date = new Date(miliseconds);
                String ModifiedDataFormateada = formato.format(date);
                /*********** END control of TIME ***********/

                CredentialCardPaymentActual.setModifiedat(ModifiedDataFormateada);
                CredentialCardPaymentActual.setKeyid(credentialCardPayment.getKeyid());
                CredentialCardPaymentActual.setPublickey(credentialCardPayment.getPublickey());
                CredentialCardPaymentActual.setCompany(credentialCardPayment.getCompany());;
                credentialCardPaymentUpdated = ccps.save(CredentialCardPaymentActual);

            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error al actualizar las credenciales en la base de datos");
                response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        

        response.put("message", "Credenciales actualizadas con éxito!");
        response.put("statusCode", HttpStatus.CREATED.value());
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    /*********** BEGIN CREDENTIAL P2P ***********/
    
    @GetMapping("/credentialp2p/{id}")
    public ResponseEntity<?> showp2p(@PathVariable Long id) {

        CredentialP2P p2p2 = null;
        Map<String, Object> response = new HashMap<>();

        try {
            p2p2 = p2p.findByCompanyId(id);
        } catch (DataAccessException e) {
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }

        if (p2p2 == null) {
            response.put("statusCode", HttpStatus.NOT_FOUND.value());
            response.put("message", "La Credencial ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
        
        response.put("statusCode", HttpStatus.OK.value());
        response.put("message", "Consula exitosa");
        response.put("credentialp2p", p2p2);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    /*********** END CREDENTIAL P2P ***********/
    
    @PostMapping("/credentialp2p")
    public ResponseEntity<?> createp2p(@Valid @RequestBody CredentialP2P p2p2,
            BindingResult result) {

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.setErrorHandler(new MyErrorHandler());

        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        CredentialP2P p2pNew = p2p.findByCompanyId(p2p2.getCompany().getCompanyid());

        if (p2pNew == null) {
            try {               
                p2p2.setCreatedat(dateFormateada);
                p2pNew = p2p.save(p2p2);
            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("message", "Error al realizar el insert en la base de datos");
                response.put("error", e.getMostSpecificCause().getMessage());
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            response.put("statusCode", HttpStatus.CONFLICT.value());
            response.put("message", "Ya existen las credenciales para la compañia ID:"
                    + p2p2.getCompany().getCompanyid());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        Map<String, Object> param = new HashMap<>();
        param.put("companyid", p2p2.getCompany().getCompanyid());
        param.put("moduleid", "2");
        String responseModule = restTemplate.getForObject(SET_MODULE_URL, String.class, param);
        
        response.put("message", "Credenciales creadas con éxito!");
        response.put("statusCode", HttpStatus.CREATED.value());
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    
    
    @PutMapping("/credentialp2p/{id}")
    public ResponseEntity<?> updatep2p(@Valid @RequestBody CredentialP2P p2p2,
            BindingResult result, @PathVariable Long id) {

        RestTemplate restTemplate = new RestTemplate();

        CredentialP2P credentialp2pUpdated= null;
        
        CredentialP2P Credentialp2pActual = p2p.findById(id);
        
        restTemplate.setErrorHandler(new MyErrorHandler());

        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        CredentialP2P p2pNew = p2p.findByCompanyId(p2p2.getCompany().getCompanyid());

        if (Credentialp2pActual == null) {
            response.put("mensaje", "Error: no se pudo editar, la credencial: "
                    .concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        
            try {

                /*********** BEGIN control of TIME ***********/
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy ss:mm:HH");
                long miliseconds = System.currentTimeMillis();
                Date date = new Date(miliseconds);
                String ModifiedDataFormateada = formato.format(date);
                /*********** END control of TIME ***********/

                Credentialp2pActual.setModifiedat(ModifiedDataFormateada);
                Credentialp2pActual.setClientid(p2p2.getClientid());
                Credentialp2pActual.setClientsecret(p2p2.getClientsecret());
                Credentialp2pActual.setCompany(p2p2.getCompany());;
                credentialp2pUpdated = p2p.save(Credentialp2pActual);

            } catch (DataAccessException e) {
                response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.put("mensaje", "Error al actualizar las credenciales en la base de datos");
                response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        

        response.put("message", "Credenciales actualizadas con éxito!");
        response.put("statusCode", HttpStatus.CREATED.value());
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

}