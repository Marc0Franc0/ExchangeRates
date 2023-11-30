package com.app.ExchangeRates.controller.ApiDolar;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.DolarService;
import com.app.ExchangeRates.service.DolarApi.OtherCurrenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchanges/")
public class OtherCurrenciesController {
    @Autowired
    private OtherCurrenciesService otherCurrenciesService;
    @GetMapping("/euro")
    ResponseEntity<Money> getEuro(){
    return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getEuro());
    }
    @GetMapping("/bzl")
    ResponseEntity<Money> getBrazilianReal(){
        return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getBrazilianReal());
    }
    @GetMapping("/clp")
    ResponseEntity<Money> getChileanPeso(){
        return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getChileanPeso());
    }
    @GetMapping("/uyu")
    ResponseEntity<Money> getUruguayanPeso(){
        return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getUruguayanPeso());
    }

}