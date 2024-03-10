package com.app.ExchangeRates.service.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DolarService {
    Money getOfficialDollar();
    Money getBlueDollar();
    Money getCCLDollar();
    Money getDollarCard();
    Money getStockMarketDollar();
    Money getSolidarityDollar();
    Money getWholesaleDollar();
    Money getCryptoDollar();
    List<Money> getAllDollars();
}
