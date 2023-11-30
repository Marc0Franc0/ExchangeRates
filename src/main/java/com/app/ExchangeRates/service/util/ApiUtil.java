package com.app.ExchangeRates.service.util;

import com.app.ExchangeRates.mapper.DolarApi.MoneyMapper;
import com.app.ExchangeRates.model.DolarApi.Money;
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

    public Money buildApiDolarDTO(ResponseEntity<?> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return MoneyMapper.buildMoneyDto((Money) response.getBody());
        }
        log.error("Error when making request to external api - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
    public  ResponseEntity<?> consultExternalApi(String uri, HttpMethod httpMethod,
                                                       HttpEntity<?> httpEntity, Class returnType){
        return  restTemplate.exchange(uri,httpMethod,httpEntity,returnType);
    }
}
