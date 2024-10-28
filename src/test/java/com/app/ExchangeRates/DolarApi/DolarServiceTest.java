package com.app.ExchangeRates.DolarApi;

import com.app.ExchangeRates.model.DolarApi.Money;
import com.app.ExchangeRates.service.DolarApi.DolarServiceImpl;
import com.app.ExchangeRates.service.util.ApiUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class DolarServiceTest {

    @Mock
    private ApiUtil apiUtil;

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private DolarServiceImpl dolarService;

    @Value("${apidolar.base-url}")
    private String baseUrl ;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetOfficialDollar() {
        String uri = baseUrl + "/dolares/oficial";
        Money mockMoney = new Money("USD", "oficial", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getOfficialDollar();

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
    public void getBlueDollar (){
        String uri = baseUrl + "/dolares/blue";
        Money mockMoney = new Money("USD", "blue", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getBlueDollar();

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
    public void getCCLDollar (){
        String uri = baseUrl + "/dolares/contadoconliqui";
        Money mockMoney = new Money("USD", "ccl", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getCCLDollar();

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
    public void getDollarCard (){
        String uri = baseUrl + "/dolares/tarjeta";
        Money mockMoney = new Money("USD", "card", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getDollarCard();

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
    public void getStockMarketDollar (){
        String uri = baseUrl + "/dolares/bolsa";
        Money mockMoney = new Money("USD", "stockMarket", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getStockMarketDollar();

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
    public void getWholesaleDollar (){
        String uri = baseUrl + "/dolares/mayorista";
        Money mockMoney = new Money("USD", "wholesale", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getWholesaleDollar();

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
    @Test
    public void getCryptoDollar (){
        String uri = baseUrl + "/dolares/cripto";
        Money mockMoney = new Money("USD", "cripto", 1000.0, 1000.0);

        ResponseEntity mockResponse = new ResponseEntity<>(mockMoney, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.buildExchange(eq(uri), eq(HttpMethod.GET), any(HttpEntity.class), eq(Money.class))).thenReturn(mockResponse);
        when(apiUtil.buildApiDolarDTO(mockResponse)).thenReturn(mockMoney);

        // Call the method
        Money result = dolarService.getCryptoDollar();

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
