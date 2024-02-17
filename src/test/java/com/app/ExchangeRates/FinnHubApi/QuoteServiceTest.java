package com.app.ExchangeRates.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import com.app.ExchangeRates.service.FinnHubApi.QuoteService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QuoteServiceTest {
    @Autowired
    QuoteService quoteService;
    //Consulta a api externa con simbolo inválido o nulo
    //Se espera la excepcion de tipo IllegalArgumentException
    @Test
    public void nullSymbolOrInvalidGetQuote(){
        Assertions.assertThrowsExactly
                (IllegalArgumentException.class, ()->this.quoteService.getQuote(null));
        Assertions.assertThrowsExactly
                (IllegalArgumentException.class, ()-> this.quoteService.getQuote(""));
        Assertions.assertThrowsExactly
                (IllegalArgumentException.class, ()-> this.quoteService.getQuote(String.valueOf(5)));
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getQuote(){
        Quote quote = quoteService.getQuote("AAPL");
        Assertions.assertNotNull(quote);
        var str = quote != null ? quote.toString() :"";
        log.info(str);
    }



}
