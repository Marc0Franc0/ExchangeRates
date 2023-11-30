package com.app.ExchangeRates.service.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import org.springframework.stereotype.Service;

@Service
public interface DolarService {
    Money getOfficialDollar();
    Money getBlueDollar();
    Money getCCLDollar();
    Money getDollarCard();
    Money getStockMarketDollar();
    Money getSolidarityDollar();
    Money getWholesaleDollar();
}
