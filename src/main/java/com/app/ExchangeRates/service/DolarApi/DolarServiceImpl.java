package com.app.ExchangeRates.service.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.util.ApiUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DolarServiceImpl implements DolarService {
    @Value("${apidolar.base-url}")
    String baseUrl;
    @Autowired
    ApiUtil apiUtil;
    @Override
    public Money getOfficialDollar() {

        String uri = baseUrl+"/dolares/oficial";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }

    @Override
    public Money getBlueDollar() {
        String uri = baseUrl+"/dolares/blue";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }

    @Override
    public Money getCCLDollar() {
        String uri = baseUrl+"/dolares/contadoconliqui";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }

    @Override
    public Money getDollarCard() {
        String uri = baseUrl+"/dolares/tarjeta";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }

    @Override
    public Money getStockMarketDollar() {
        String uri = baseUrl+"/dolares/bolsa";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }

    @Override
    public Money getSolidarityDollar() {
        String uri = baseUrl+"/dolares/solidario";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }

    @Override
    public Money getWholesaleDollar() {
        String uri = baseUrl+"/dolares/mayorista";
        HttpHeaders headers = new HttpHeaders();
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(headers),Money.class));
    }
}
