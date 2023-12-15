package com.app.ExchangeRates.model.DolarApi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyDTO {
    String money;
    String name;
    Double buyValue;
    Double saleValue;
}
