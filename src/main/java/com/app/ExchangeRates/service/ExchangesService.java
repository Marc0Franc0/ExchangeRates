package com.app.ExchangeRates.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExchangesService {
    List<Object> getValuesOfDolar() throws Exception;
}
