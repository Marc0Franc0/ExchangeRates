package com.app.ExchangeRates.model.FinnHub;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Quote {
    @JsonProperty("currencyPrice")
    @JsonAlias("c")
    private Double currencyPrice;

    @JsonProperty("percentChange")
    @JsonAlias("dp")
    private Double percentChange;

    @JsonProperty("openPriceOfTheDay")
    @JsonAlias("o")
    private Double openPriceOfTheDay;
    /*  {
        "c": 191.24,
            "d": 1.29,
            "dp": 0.6791,
            "h": 191.555,
            "l": 189.23,
            "o": 190.33,
            "pc": 189.95,
            "t": 1701464401
    }*/
}
