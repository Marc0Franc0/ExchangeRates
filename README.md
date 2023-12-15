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
3. Seguir pasos para ejecución con Maven

## Requerimientos para ejecutar con Maven

Para construir y ejecutar la aplicación necesita:

- [JDK 21+](https://www.oracle.com/java/technologies/downloads/#java21)
- [Maven 3+](https://maven.apache.org)

Configurar datos de la base de datos MySQL: [application.properties](https://github.com/Marc0Franc0/Forum/blob/main/src/main/resources/application-dev.properties)

Ejecutar localmente

```shell
mvn clean install
```
```shell
mvn spring-boot:run
```

Dirigirse a:
- [Documentación en formato JSON](http://localhost:8080/api/v3/api-docs)
- [Documentación Swagger con interfaz gráfica](http://localhost:8080/doc/swagger-ui/index.html)