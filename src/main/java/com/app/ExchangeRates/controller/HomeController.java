package com.app.ExchangeRates.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Value("${openapi.service.url}")
    private String openApiUrl;
    @Value("${spring-doc.api-docs.path}")
    private String apiDocsUrl;
    @Value("${spring-doc.swagger-ui.path}")
    private String swaggerUiUrl;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("urlSwaggerDoc",
                openApiUrl.concat(swaggerUiUrl));
        model.addAttribute("urlJsonDoc",
                openApiUrl.concat(apiDocsUrl));
        return "index";
    }
}