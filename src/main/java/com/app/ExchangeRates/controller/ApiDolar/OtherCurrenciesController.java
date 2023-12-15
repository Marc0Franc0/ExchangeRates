package com.app.ExchangeRates.controller.ApiDolar;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.model.DolarApi.MoneyDTO;
import com.app.ExchangeRates.model.FinnHub.Quote;
import com.app.ExchangeRates.service.DolarApi.DolarService;
import com.app.ExchangeRates.service.DolarApi.OtherCurrenciesService;
import com.app.ExchangeRates.service.FinnHubApi.QuoteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
    @Autowired
    private QuoteService quoteService;
    @Operation(summary = "Get Euro", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = MoneyDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/euro")
    ResponseEntity<Money> getEuro(){
    return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getEuro());
    }
    @Operation(summary = "Get Brazilian Real", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = MoneyDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/bzl")
    ResponseEntity<Money> getBrazilianReal(){
        return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getBrazilianReal());
    }
    @Operation(summary = "Get Chilean Peso", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = MoneyDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/clp")
    ResponseEntity<Money> getChileanPeso(){
        return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getChileanPeso());
    }
    @Operation(summary = "Get Uruguayan Peso", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = MoneyDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/uyu")
    ResponseEntity<Money> getUruguayanPeso(){
        return ResponseEntity.status(HttpStatus.OK).body(otherCurrenciesService.getUruguayanPeso());
    }

}