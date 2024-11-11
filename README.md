# [ExchangesRatesApi](https://github.com/Marc0Franc0/ExchangesRatesApi#exchangesratesapi)

API REST que brinda información actualizada sobre las tasas de cambio de USD y otras monedas en Argentina. También sobre el valor de acciones en USD.

## Características
- Consumo de APIS externas

## Tecnologías
- Spring Boot 3.2.0
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
docker pull marc0franc0/exchange-rates-api:1.4.0
```
```shell
docker create -p8080:8080 --name app-exchange-rates -e SPRING_PROFILES_ACTIVE=dev marc0franc0/exchange-rates-api:1.2.1
```
```shell
docker start app-exchange-rates
```

Dirigirse a:
- [Aquí](http://localhost:8080)

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
- [Aquí](http://localhost:8080)