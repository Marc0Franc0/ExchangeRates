package com.app.ExchangeRates.config.documentation;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import java.util.List;
import static org.springdoc.webmvc.core.fn.SpringdocRouteBuilder.route;

@OpenAPIDefinition
@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI customOpenAPI (
            @Value("${openapi.service.title}") String serviceTitle,
            //@Value("${openapi.service.version}") String serviceVersion,
            @Value ("${openapi.service.url}") String url) {
        return  new  OpenAPI ()
                .servers(List.of( new Server().url(url)))
                .info( new Info().title(serviceTitle ));
    }

}
