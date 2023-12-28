package com.app.ExchangeRates.service.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import com.app.ExchangeRates.service.util.ApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class QuoteServiceImpl implements QuoteService {
    @Autowired
    private ApiUtil apiUtil;
    @Value("${finnhub.base-url}")
    String baseUrl;
    @Value("${finnhub.token}")
    String token;

    @Override
    public Quote getQuote(String symbol) {
        this.apiUtil.validateUri(baseUrl,token);
        if(!apiUtil.validateString(symbol)&&symbol!=null&&symbol!=""){{
                String uri = baseUrl+"/quote?symbol="+symbol+"&token="+token;
                return apiUtil.buildQuoteDTO(apiUtil.getForEntity(uri,Quote.class));

        }}
       throw new IllegalArgumentException("Null symbol or invalid");
    }
}
