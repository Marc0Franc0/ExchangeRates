FROM openjdk:21-jdk-slim
COPY target/ExchangeRatesApi-3.2.0.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]