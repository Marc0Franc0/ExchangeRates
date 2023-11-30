package com.app.ExchangeRates.config.api;

import com.app.ExchangeRates.service.util.ApiUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {
    @Bean
    public ApiUtil apiUtil(){
        return new ApiUtil();
    }
}
