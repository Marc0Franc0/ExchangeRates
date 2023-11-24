package com.app.ExchangeRates.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class Dolar {
    private String name;
    private Double value;
}
