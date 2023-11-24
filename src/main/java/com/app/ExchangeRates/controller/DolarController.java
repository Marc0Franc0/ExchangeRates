package com.app.ExchangeRates.controller;

import com.app.ExchangeRates.model.Dolar;
import com.app.ExchangeRates.service.DolarService;
import com.app.ExchangeRates.service.ExchangesService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/exchanges/dolar/")
public class DolarController {
    @Autowired
    private DolarService dolarService;
    @Autowired
    private ExchangesService exchangesService;
    @GetMapping("/oficial")
    ResponseEntity<Dolar>getDolarOficial(){
    return ResponseEntity.status(HttpStatus.OK).body(dolarService.getDolarOficial());
    }
    @GetMapping("/")
    ResponseEntity<?> getDolar() throws Exception {

       return ResponseEntity.status(HttpStatus.OK).body(exchangesService.getValuesOfDolar());
    }
}
