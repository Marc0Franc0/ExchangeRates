package com.app.ExchangeRates.model.FinnHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuoteDTO {
    private Double currencyPrice;
    private Double percentChange;
    private Double openPriceOfTheDay;

}
