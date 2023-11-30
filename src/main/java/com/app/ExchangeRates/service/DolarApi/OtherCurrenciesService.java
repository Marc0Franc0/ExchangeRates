package com.app.ExchangeRates.service.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import org.springframework.stereotype.Service;

@Service
public interface OtherCurrenciesService {
    Money getEuro();
    Money getBrazilianReal();
    Money getChileanPeso();
    Money getUruguayanPeso();
}
