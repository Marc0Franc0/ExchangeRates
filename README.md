# [ExchangesRatesApi](https://github.com/Marc0Franc0/ExchangesRatesApi#exchangesratesapi)

El proyecto tiene la posibilidad de consumir diferentes APIS con el objetivo de obtener los tipos de cambios en argentina y precios del mercado en dólares.

## Características
- Consumo de APIS externas

## Tecnologías
- Spring Boot 3.0
- Maven

## Ejecución
1. Clonar repositorio: git clone https://github.com/Marc0Franc0/ExchangesRatesApi
2. Ir al directorio del proyecto: cd ExchangesRatesApi
3. Seguir pasos para ejecución con Docker o Maven

## Requerimientos para ejecutar con Docker

Para construir y ejecutar la aplicación necesita:
- [Docker](https://www.docker.com/products/docker-desktop/)

Ejecutar localmente

```shell
docker pull marc0franc0/exchange-rates-api:1.2.1
```
```shell
docker create -p8080:8080 --name app-exchange-rates -e SPRING_PROFILES_ACTIVE=dev marc0franc0/exchange-rates-api:1.2.1
```
```shell
docker start app-exchange-rates
```

Dirigirse a:
- Documentación JSON: /api/v3/api-docs
- Documentación Swagger: /doc/swagger-ui/index.html

## Requerimientos para ejecutar con Maven

Para construir y ejecutar la aplicación necesita:

- [JDK 21+](https://www.oracle.com/java/technologies/downloads/#java21)
- [Maven 3+](https://maven.apache.org)

Ejecutar localmente

```shell
mvn clean install
```
```shell
mvn spring-boot:run
```

Dirigirse a:
- Documentación JSON: /api/v3/api-docs
- Documentación Swagger /doc/swagger-ui/index.html