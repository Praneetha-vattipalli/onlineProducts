FROM adoptopenjdk/openjdk11:alpine-jre

ARG APP_NAME="product-service"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/product-service.0.0.1.jar"

COPY target/product-service.0.0.1.jar product-service.0.0.1.jar
ENTRYPOINT ["java","-jar", "product-service.0.0.1.jar"]