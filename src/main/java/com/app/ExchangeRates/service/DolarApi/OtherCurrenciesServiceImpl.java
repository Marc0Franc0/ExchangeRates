package com.app.ExchangeRates.service.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.util.ApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class OtherCurrenciesServiceImpl implements OtherCurrenciesService {
    @Value("${apidolar.base-url}")
    String baseUrl;
    @Autowired
    ApiUtil apiUtil;

    @Override
    public Money getEuro() {
        String uri = baseUrl+"/cotizaciones/eur";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getBrazilianReal() {
        String uri = baseUrl+"/cotizaciones/brl";
        return apiUtil
                .buildApiDolarDTO(
                         apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getChileanPeso() {
        String uri = baseUrl+"/cotizaciones/clp";
        return apiUtil
                .buildApiDolarDTO(
                        apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }

    @Override
    public Money getUruguayanPeso() {
        String uri = baseUrl+"/cotizaciones/uyu";
        return apiUtil
                .buildApiDolarDTO(
                         apiUtil.buildExchange(uri,HttpMethod.GET,new HttpEntity<>(null),Money.class));
    }


}
