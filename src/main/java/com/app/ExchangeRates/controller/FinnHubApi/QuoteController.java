package com.app.ExchangeRates.controller.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import com.app.ExchangeRates.service.FinnHubApi.QuoteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/exchanges/stock-price")
public class QuoteController {
    @Autowired
    private QuoteService quoteService;
    @Operation(summary = "Get prices from the foreign market at the dollar price", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Quote.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/{symbol}")
    ResponseEntity<Quote> getQuote(@PathVariable String symbol){
        return ResponseEntity.status(HttpStatus.OK).body(quoteService.getQuote(symbol));
    }
    }
