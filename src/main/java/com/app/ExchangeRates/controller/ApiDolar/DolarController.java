package com.app.ExchangeRates.controller.ApiDolar;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.DolarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchanges/usd/")
public class DolarController {
    @Autowired
    private DolarService dolarService;
    @GetMapping("/official")
    ResponseEntity<Money>getOfficialDollar(){
    return ResponseEntity.status(HttpStatus.OK).body(dolarService.getOfficialDollar());
    }
    @GetMapping("/blue")
    ResponseEntity<Money> getBlueDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getBlueDollar());
    }
    @GetMapping("/ccl")
    ResponseEntity<Money> getCCLDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getCCLDollar());
    }
    @GetMapping("/card")
    ResponseEntity<Money> getDollarCard(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getDollarCard());
    }
    @GetMapping("/stock-market")
    ResponseEntity<Money> getStockMarketDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getStockMarketDollar());
    }
    @GetMapping("/solidarity")
    ResponseEntity<Money> getSolidarityDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getSolidarityDollar());
    }
    @GetMapping("/wholesale")
    ResponseEntity<Money> getWholesaleDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getWholesaleDollar());
    }

}