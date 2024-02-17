package com.app.ExchangeRates.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.DolarService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DolarServiceTest{
    @Autowired
    DolarService dolarService;
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getOfficialDollar (){
        Money money = dolarService.getOfficialDollar();
        Assertions.assertNotNull(money,"Null official dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);

    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getBlueDollar (){
        Money money = dolarService.getBlueDollar();
        Assertions.assertNotNull(money,"NUll Blue Dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getCCLDollar (){
        Money money = dolarService.getCCLDollar();
        Assertions.assertNotNull(money,"Null CCL Dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getDollarCard (){
        Money money = dolarService.getDollarCard();
        Assertions.assertNotNull(money,"Null Card Dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getStockMarketDollar (){
        Money money = dolarService.getStockMarketDollar();
        Assertions.assertNotNull(money, "Null Stock Market Dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getWholesaleDollar (){
        Money money = dolarService.getWholesaleDollar();
        Assertions.assertNotNull(money,"Null Wholesale Dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }
    @Test
    public void getCryptoDollar (){
        Money money = dolarService.getCryptoDollar();
        Assertions.assertNotNull(money,"Null Crypto Dollar");
        var str =   money != null ? money.toString() :"";
        log.info(str);
    }

}
