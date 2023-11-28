package com.app.ExchangeRates.service;

import com.app.ExchangeRates.mapper.MoneyMapper;
import com.app.ExchangeRates.model.Money;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class DolarServiceImpl implements DolarService {
    @Value("${apidolar.base-url}")
    String baseUrl;
    @Autowired
    RestTemplate restTemplate;
    @Override
    public Money getOfficialDollar() {

        String uri = baseUrl+"/dolares/oficial";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
       return buildMethodResponse(response);
    }

    @Override
    public Money getBlueDollar() {
        String uri = baseUrl+"/dolares/blue";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
        return buildMethodResponse(response);
    }

    @Override
    public Money getCCLDollar() {
        String uri = baseUrl+"/dolares/contadoconliqui";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
        return buildMethodResponse(response);
    }

    @Override
    public Money getDollarCard() {
        String uri = baseUrl+"/dolares/tarjeta";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
        return buildMethodResponse(response);
    }

    @Override
    public Money getStockMarketDollar() {
        String uri = baseUrl+"/dolares/bolsa";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
        return buildMethodResponse(response);
    }

    @Override
    public Money getSolidarityDollar() {
        String uri = baseUrl+"/dolares/solidario";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
        return buildMethodResponse(response);
    }

    @Override
    public Money getWholesaleDollar() {
        String uri = baseUrl+"/dolares/mayorista";
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Money> response =
                restTemplate.
                        exchange(uri, HttpMethod.GET,new HttpEntity<>(headers), Money.class);
        return buildMethodResponse(response);
    }

    private Money buildMethodResponse(ResponseEntity<Money> response){
        if(response.getStatusCode().value()==200){
            log.info("Request to external api correct: {}", response.getStatusCode());
            return MoneyMapper.buildMoneyDto(response.getBody());
        }
        log.error("Error when making request to external api - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
}
