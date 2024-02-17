package com.app.ExchangeRates.DolarApi;

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
public class IntegrationOtherCurrenciesControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private String baseUrl="/api/exchanges/";
    @Test
    public void getEuro() throws Exception {
        String url = baseUrl+"euro";
        mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect
                        (MockMvcResultMatchers
                                .content()
                                .contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void getBrazilianReal() throws Exception {
        String url = baseUrl+"bzl";
        mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect
                        (MockMvcResultMatchers
                                .content()
                                .contentType(MediaType.APPLICATION_JSON));
    }
    @Test
    public void getChileanPeso() throws Exception {
        String url = baseUrl+"clp";
        mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect
                        (MockMvcResultMatchers
                                .content()
                                .contentType(MediaType.APPLICATION_JSON));
    }
    @Test
    public void getUruguayanPeso() throws Exception {
        String url = baseUrl+"uyu";
        mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect
                        (MockMvcResultMatchers
                                .content()
                                .contentType(MediaType.APPLICATION_JSON));
    }

}
