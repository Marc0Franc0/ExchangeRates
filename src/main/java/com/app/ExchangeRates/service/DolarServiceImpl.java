package com.app.ExchangeRates.service;

import com.app.ExchangeRates.model.Dolar;
import org.springframework.stereotype.Service;

@Service
public class DolarServiceImpl implements DolarService {

    @Override
    public Dolar getDolarBlue() {
        return null;
    }

    @Override
    public Dolar getDolarOficial() {

        return Dolar
                .builder()
                .name("Dólar oficial")
                .value(0.0)
                .build();
    }

    @Override
    public Dolar getDolarCCL() {
        return null;
    }

    @Override
    public Dolar getDolarBolsa() {
        return null;
    }

    @Override
    public Dolar getDolarTurista() {
        return null;
    }
}
