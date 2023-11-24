package com.app.ExchangeRates.service;

import com.app.ExchangeRates.model.Dolar;
import org.springframework.stereotype.Service;

@Service
public interface DolarService {
    Dolar getDolarBlue();
    Dolar getDolarOficial();
    Dolar getDolarCCL();
    Dolar getDolarBolsa();
    Dolar getDolarTurista();
}
