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

import java.util.List;
@Slf4j
public class ApiUtil {

    @Autowired
    private  RestTemplate restTemplate;

    //Se utiliza como excepcion en métodos de esta clase
    private RuntimeException throwError(ResponseEntity<?> response){
        log.error("Error when making request to external api - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
    //Construye un response
    public Money buildApiDolarDTO(ResponseEntity<?> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return MoneyMapper.buildMoneyDto((Money) response.getBody());
        }
        throw throwError(response);
    }
    public List<Money> buildListApiDolarDTO(ResponseEntity<?> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return MoneyMapper.buildMoneyDto(response.getBody());
        }
        throw throwError(response);
    }
    //se encarga de crear una consulta externa
    public  ResponseEntity<?> buildExchange(String uri, HttpMethod httpMethod,
                                            HttpEntity<?> httpEntity, Class returnType){
        return  restTemplate.exchange(uri,httpMethod,httpEntity,returnType);
    }
    //se encarga de crear una consulta externa
    public  ResponseEntity<?> getForEntity(String uri, Class returnType){
        return  restTemplate.getForEntity(uri,returnType);
    }
    //Construye un response
    public Quote buildQuoteDTO(ResponseEntity<?> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return QuoteMapper.buildQuoteDto((Quote) response.getBody());
        }
        throw throwError(response);
    }
    //Verifica que el un string no contenga números
    public boolean validateString(String string){

        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //valida que la uri no contenga valores inválidos
    public boolean validateUri(String baseUrl, String token) {
        if(baseUrl!=null&&baseUrl!=""&&token!=null&&token!=""){
            return true;
        }
        throw new IllegalArgumentException();
    }
}
