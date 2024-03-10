package com.app.ExchangeRates.mapper.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
@UtilityClass
public class MoneyMapper {
    private final ObjectMapper objectMapper = new ObjectMapper();
public Money buildMoneyDto(Money money){
    return  Money.builder()
            .name(money.getName())
            .buyValue(money.getBuyValue())
            .saleValue(money.getSaleValue())
            .money(money.getMoney())
            .build();
}
    public static List<Money> buildMoneyDto(Object body) {
        List<Money> bodyList= objectMapper.convertValue(body, ArrayList.class);
        return bodyList;
    }
}
