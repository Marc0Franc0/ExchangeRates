package com.app.ExchangeRates.web;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.DolarService;
import com.app.ExchangeRates.service.DolarApi.OtherCurrenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CurrenciesController {

    @Autowired
    private DolarService dolarService;
    @Autowired
    private OtherCurrenciesService otherCurrenciesService;

    @GetMapping("/currencies.dollar")
    public String getDollar(Model model) {
        List<Money> dollarList = dolarService.getAllDollars();
        model.addAttribute("dollarList", dollarList);
        return "currencies.dollar";
    }
    @GetMapping("/currencies")
    public String getCurrencies(Model model) {
        return "currencies";
    }
    @GetMapping("/currencies.other")
    public String getOtherCurrencies(Model model) {
        List<Money> dollarList = getOtherCurrencies();
        model.addAttribute("dollarList", dollarList);
        return "currencies.other";
    }
    private List<Money> getOtherCurrencies(){
        List<Money> otherList = new ArrayList<>();
        otherList.add(otherCurrenciesService.getBrazilianReal());
        otherList.add(otherCurrenciesService.getChileanPeso());
        otherList.add(otherCurrenciesService.getEuro());
        otherList.add(otherCurrenciesService.getUruguayanPeso());
        return otherList;
    }
}