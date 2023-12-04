package com.app.ExchangeRates.service.util;

import com.app.ExchangeRates.mapper.DolarApi.MoneyMapper;
import com.app.ExchangeRates.mapper.FinnHubApi.QuoteMapper;
import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.model.FinnHub.Quote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class ApiUtil {
    @Autowired
    private  RestTemplate restTemplate;
    private RuntimeException throwError(ResponseEntity<?> response){
        log.error("Error when making request to external api - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
    public Money buildApiDolarDTO(ResponseEntity<?> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return MoneyMapper.buildMoneyDto((Money) response.getBody());
        }
        throw throwError(response);
    }
    public  ResponseEntity<?> buildExchange(String uri, HttpMethod httpMethod,
                                            HttpEntity<?> httpEntity, Class returnType){
        return  restTemplate.exchange(uri,httpMethod,httpEntity,returnType);
    }
    public  ResponseEntity<?> getForEntity(String uri, Class returnType){
        return  restTemplate.getForEntity(uri,returnType);
    }
    public Quote buildQuoteDTO(ResponseEntity<?> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return QuoteMapper.buildQuoteDto((Quote) response.getBody());
        }
        throw throwError(response);
    }
}
