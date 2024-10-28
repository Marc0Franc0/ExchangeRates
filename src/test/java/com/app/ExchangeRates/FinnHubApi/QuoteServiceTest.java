package com.app.ExchangeRates.FinnHubApi;

import com.app.ExchangeRates.model.FinnHub.Quote;
import com.app.ExchangeRates.service.FinnHubApi.QuoteService;
import com.app.ExchangeRates.service.FinnHubApi.QuoteServiceImpl;
import com.app.ExchangeRates.service.util.ApiUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class QuoteServiceTest {

    @Mock
    private ApiUtil apiUtil;

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private QuoteServiceImpl quoteService;

    @Value("${finnhub.base-url}")
    String baseUrl;
    @Value("${finnhub.token}")
    String token;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetQuote() {
        String symbol = "AAPL";
        String uri = baseUrl + "/quote?symbol=" + symbol + "&token=" + token;
        Quote mockQuote = new Quote(230.57, -0.0823, 229.98);

        ResponseEntity mockResponse = new ResponseEntity<>(mockQuote, HttpStatus.OK);

        // Mock the methods in apiUtil and restTemplate
        when(apiUtil.getForEntity(eq(uri), eq(Quote.class))).thenReturn(mockResponse);
        when(apiUtil.buildQuoteDTO(mockResponse)).thenReturn(mockQuote);

        // Call the method
        Quote result = quoteService.getQuote(symbol);

        // Verify the results
        assertNotNull(result, "Result should not be null");
        assertEquals(mockQuote.getCurrencyPrice(), result.getCurrencyPrice());
        assertEquals(mockQuote.getPercentChange(), result.getPercentChange());
        assertEquals(mockQuote.getOpenPriceOfTheDay(), result.getOpenPriceOfTheDay());

        // Verify the interactions
        verify(apiUtil, times(1)).getForEntity(eq(uri), eq(Quote.class));
        verify(apiUtil, times(1)).buildQuoteDTO(mockResponse);
    }

    @Test
    public void testGetQuoteInvalidSymbol() {
        String invalidSymbol = "";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            quoteService.getQuote(invalidSymbol);
        });

        String expectedMessage = "Null symbol or invalid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
