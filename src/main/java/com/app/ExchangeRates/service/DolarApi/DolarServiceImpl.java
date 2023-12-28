package com.app.ExchangeRates.service.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.util.ApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
public class DolarServiceImpl implements DolarService {
    @Value("${apidolar.base-url}")
    String baseUrl;
    @Autowired
    ApiUtil apiUtil;
    @Override
    public Money getOfficialDollar() {

        String uri = baseUrl+"/dolares/oficial";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getBlueDollar() {
        String uri = baseUrl+"/dolares/blue";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getCCLDollar() {
        String uri = baseUrl+"/dolares/contadoconliqui";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getDollarCard() {
        String uri = baseUrl+"/dolares/tarjeta";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getStockMarketDollar() {
        String uri = baseUrl+"/dolares/bolsa";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getSolidarityDollar() {
        String uri = baseUrl+"/dolares/solidario";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getWholesaleDollar() {
        String uri = baseUrl+"/dolares/mayorista";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getCryptoDollar() {
        String uri = baseUrl+"/dolares/cripto";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }
}
