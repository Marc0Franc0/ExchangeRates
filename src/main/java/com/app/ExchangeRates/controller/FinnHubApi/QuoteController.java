package com.app.ExchangeRates.controller.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import com.app.ExchangeRates.service.FinnHubApi.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchanges/stock-price")
public class QuoteController {
    @Autowired
    private QuoteService quoteService;
    @GetMapping("/{symbol}")
    ResponseEntity<Quote> getQuote(@PathVariable String symbol){
        return ResponseEntity.status(HttpStatus.OK).body(quoteService.getQuote(symbol));
    }
}
