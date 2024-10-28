package com.app.ExchangeRates.controller.ApiDolar;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.DolarService;
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
import java.util.List;

@RestController
@RequestMapping("/api/v1/exchanges/usd/")
public class DolarController {
    @Autowired
    private DolarService dolarService;
    @Operation(summary = "Get Official Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/official")
    ResponseEntity<Money>getOfficialDollar(){
    return ResponseEntity.status(HttpStatus.OK).body(dolarService.getOfficialDollar());
    }
    @Operation(summary = "Get Blue Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/blue")
    ResponseEntity<Money> getBlueDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getBlueDollar());
    }
    @Operation(summary = "Get CCL Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/ccl")
    ResponseEntity<Money> getCCLDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getCCLDollar());
    }
    @Operation(summary = "Get Card Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/card")
    ResponseEntity<Money> getDollarCard(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getDollarCard());
    }
    @Operation(summary = "Get StockMarket Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/stock-market")
    ResponseEntity<Money> getStockMarketDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getStockMarketDollar());
    }
   /* @Operation(summary = "Get Solidarity Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = MoneyDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/solidarity")*/
    //No se encuentra disponible en api externa
    ResponseEntity<Money> getSolidarityDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getSolidarityDollar());
    }
    @Operation(summary = "Get Wholesale Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json",
                             schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/wholesale")
    ResponseEntity<Money> getWholesaleDollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getWholesaleDollar());
    }
    @Operation(summary = "Get Wholesale Dollar", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/cripto")
    ResponseEntity<Money> getCryptoollar(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getCryptoDollar());
    }
    @Operation(summary = "Get all dollars", responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Money.class))),
            @ApiResponse(responseCode = "404", description = "Not found",
                    content = @Content)})
    @GetMapping("/")
    ResponseEntity<List<Money>> getAllDollars(){
        return ResponseEntity.status(HttpStatus.OK).body(dolarService.getAllDollars());
    }
}