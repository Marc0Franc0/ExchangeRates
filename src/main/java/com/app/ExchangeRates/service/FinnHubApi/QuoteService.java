package com.app.ExchangeRates.service.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import org.springframework.stereotype.Service;

@Service
public interface QuoteService {
    Quote getQuote(String symbol);
}
