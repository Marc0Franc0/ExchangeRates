package com.app.ExchangeRates.mapper.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import lombok.experimental.UtilityClass;

@UtilityClass
public class QuoteMapper {
    public Quote buildQuoteDto(Quote quote){
        return  Quote.builder()
                .openPriceOfTheDay(quote.getOpenPriceOfTheDay())
                .percentChange(quote.getPercentChange())
                .currencyPrice(quote.getCurrencyPrice())
                .build();
    }
}
