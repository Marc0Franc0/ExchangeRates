package com.app.ExchangeRates.DolarApi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class IntegrationDollarControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private final String baseUrl="/api/v1/currencies/usd/";
    @Test
    public void getOfficialDollar() throws Exception {
        String url = baseUrl + "official";
        mockMvc.perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
    }

    @Test
    public void getBlueDollar() throws Exception {
        String url = baseUrl+"blue";
        mockMvc.perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
    }
    @Test
    public void getCCLDollar() throws Exception {
        String url = baseUrl+"ccl";
        mockMvc.perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
    }
    @Test
    public void getDollarCard() throws Exception {
        String url = baseUrl+"card";
        mockMvc.perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
    }
    @Test
    public void getStockMarketDollar() throws Exception {
        String url = baseUrl+"stock-market";
        mockMvc.perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
    }
@Test
public void getWholesaleDollar() throws Exception {
    String url = baseUrl+"wholesale";
    mockMvc.perform(MockMvcRequestBuilders.get(url)
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.content()
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
            .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
            .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
            .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
}
    @Test
    public void getCryptoDollar() throws Exception {
        String url = baseUrl+"cripto";
        mockMvc.perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moneda").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.compra").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.venta").exists());
    }
}
