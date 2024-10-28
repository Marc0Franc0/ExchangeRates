package com.app.ExchangeRates.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.OtherCurrenciesServiceImpl;
import com.app.ExchangeRates.service.util.ApiUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class OtherCurrenciesServiceTest  {
    @Mock
    private ApiUtil apiUtil;

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private OtherCurrenciesServiceImpl otherCurrenciesService;

    @Value("${apidolar.base-url}")
    private String baseUrl ;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getEuro() {
        String uri = baseUrl+"/cotizaciones/eur";
        Money mockMoney = new Money("EUR", "Euro", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = otherCurrenciesService.getEuro();

        // Verify the results
        assertNotNull(result, "Result should not be null");
        assertEquals(mockMoney.getName(), result.getName());
        assertEquals(mockMoney.getMoney(), result.getMoney());
        assertEquals(mockMoney.getBuyValue(), result.getBuyValue());
        assertEquals(mockMoney.getSaleValue(), result.getSaleValue());

        // Verify the interactions
        verify(apiUtil, times(1)).buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class));
        verify(apiUtil, times(1)).buildApiDolarDTO(mockResponse);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getBrazilianReal() {
        String uri = baseUrl+"/cotizaciones/brl";
        Money mockMoney = new Money("BRL", "Real Brasileño", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = otherCurrenciesService.getBrazilianReal();

        // Verify the results
        assertNotNull(result, "Result should not be null");
        assertEquals(mockMoney.getName(), result.getName());
        assertEquals(mockMoney.getMoney(), result.getMoney());
        assertEquals(mockMoney.getBuyValue(), result.getBuyValue());
        assertEquals(mockMoney.getSaleValue(), result.getSaleValue());

        // Verify the interactions
        verify(apiUtil, times(1)).buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class));
        verify(apiUtil, times(1)).buildApiDolarDTO(mockResponse);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getChileanPeso() {
        String uri = baseUrl+"/cotizaciones/clp";
        Money mockMoney = new Money("CLP", "Peso Chileno", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = otherCurrenciesService.getChileanPeso();

        // Verify the results
        assertNotNull(result, "Result should not be null");
        assertEquals(mockMoney.getName(), result.getName());
        assertEquals(mockMoney.getMoney(), result.getMoney());
        assertEquals(mockMoney.getBuyValue(), result.getBuyValue());
        assertEquals(mockMoney.getSaleValue(), result.getSaleValue());

        // Verify the interactions
        verify(apiUtil, times(1)).buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class));
        verify(apiUtil, times(1)).buildApiDolarDTO(mockResponse);
    }
    //Se espera un resultado con un valor diferente a null
    @Test
    public void getUruguayanPeso() {
        String uri = baseUrl+"/cotizaciones/uyu";
        Money mockMoney = new Money("UYU", "Peso Uruguayo", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = otherCurrenciesService.getUruguayanPeso();

        // Verify the results
        assertNotNull(result, "Result should not be null");
        assertEquals(mockMoney.getName(), result.getName());
        assertEquals(mockMoney.getMoney(), result.getMoney());
        assertEquals(mockMoney.getBuyValue(), result.getBuyValue());
        assertEquals(mockMoney.getSaleValue(), result.getSaleValue());

        // Verify the interactions
        verify(apiUtil, times(1)).buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class));
        verify(apiUtil, times(1)).buildApiDolarDTO(mockResponse);
    }
}
