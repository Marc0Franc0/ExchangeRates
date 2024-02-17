package com.app.ExchangeRates.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.OtherCurrenciesService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class OtherCurrenciesServiceTest  {
    @Autowired
    OtherCurrenciesService otherCurrenciesService;
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getEuro() {
        Money money = otherCurrenciesService.getEuro();
        Assertions.assertNotNull(money,"Null Euro");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getBrazilianReal() {
        Money money = otherCurrenciesService.getBrazilianReal();
        Assertions.assertNotNull(money,"Null Brazilian Real");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getChileanPeso() {
        Money money = otherCurrenciesService.getChileanPeso();
        Assertions.assertNotNull(money,"Null Chilean Peso");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getUruguayanPeso() {
        Money money = otherCurrenciesService.getUruguayanPeso();
        Assertions.assertNotNull(money,"Null Uruguayan Peso");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
}
