package com.app.ExchangeRates.FinnHubApi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class IntegrationControllerQuoteTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getOfficialQuote() throws Exception {
        String url = "/api/exchanges/stock-price/APPL";
        mockMvc
                .perform(MockMvcRequestBuilders.get(url))
                .andExpect(status().isOk())
                .andExpect
                        (MockMvcResultMatchers
                                .content()
                                .contentType(MediaType.APPLICATION_JSON));
    }
}