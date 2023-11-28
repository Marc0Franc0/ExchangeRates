package com.app.ExchangeRates.mapper;

import com.app.ExchangeRates.model.Money;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MoneyMapper {
public Money buildMoneyDto(Money money){
    return  Money.builder()
            .name(money.getName())
            .buyValue(money.getBuyValue())
            .saleValue(money.getSaleValue())
            .money(money.getMoney())
            .build();
}
}
