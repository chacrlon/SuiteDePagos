package com.suitepagos.backend.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suitepagos.backend.models.entity.ElectronicDebit;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.services.IElectronicDebitService;
import com.suitepagos.backend.models.services.UserService;

@RestController
public class ElectronicDebitRestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @Autowired
    private IElectronicDebitService eds;

    @GetMapping("/ElectronicDebit/{idp}")
    public ResponseEntity<?> show(@PathVariable String paymentid) {

        ElectronicDebit ed = null;
        Map<String, Object> response = new HashMap<>();

        try {
            ed = eds.findByPaymentid(paymentid);
        } catch (DataAccessException e) {
            response.put("message", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (ed == null) {
            response.put("message",
                    "El id del pago: ".concat(paymentid.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<ElectronicDebit>(ed, HttpStatus.OK);
    }

    @RequestMapping(value = "/ElectronicDebit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> icOperation(@Valid @RequestBody ElectronicDebit ed, BindingResult result)
            throws IOException, ParseException {

        ElectronicDebit edNew = null;

        /********** BEGIN validations json **********/
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors().stream()
                    .map(err -> "'" + err.getField() + "' " + err.getDefaultMessage()).collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        if (ed.getUserid().getId() == null) {
            response.put("errors", "'UserId' es un campo requerido y no puede estar vacío");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }
        /********** END validations json **********/

        /*********** BEGIN control of user ***********/
        Users users = userService.findByUserId(ed.getUserid().getId());

        if (users == null) {
            response.put("message", "Error interno de la aplicación - usuario no existe");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        /*********** END control of user ***********/

        String paymentidold = null;
        String namecompany = null;

        paymentidold = eds.AddPaymentid(ed.getUserid().getCompany().getCustomerid());
        namecompany = eds.AddNameCompany(ed.getUserid().getCompany().getCustomerid());
        
        System.out.println(namecompany);
        if (paymentidold == null) {
            paymentidold = "0";
        }
        int PaymentidEntero = Integer.parseInt(paymentidold);
        PaymentidEntero = PaymentidEntero + 1;
        String Paymentid = String.valueOf(PaymentidEntero);
        //int width = 14;
        //String formatted = String.format("%0" + width + "d", Integer.valueOf(Paymentid));
        try {
            ed.setPaymentid(Paymentid);
            edNew = eds.save(ed);
        } catch (DataAccessException e) {
            response.put("message", "Error interno al insertar transaccion en la base de datos");
            response.put("error", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @GetMapping("/ElectronicDebit")
    public List<ElectronicDebit> index() {
        return eds.findAll();
    }

}