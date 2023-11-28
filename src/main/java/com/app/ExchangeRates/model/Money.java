package com.app.ExchangeRates.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Money {
    @JsonProperty("moneda")
    String money;
    @JsonProperty("nombre")
    String name;
    @JsonProperty("compra")
    Double buyValue;
    @JsonProperty("venta")
    Double saleValue;

  /*  "moneda": "USD",
            "casa": "blue",
            "nombre": "Blue",
            "compra": 970,
            "venta": 990,
            "fechaActualizacion": "2023-11-28T13:49:00.000Z"*/
}
