FROM adoptopenjdk/openjdk11:alpine-jre

ARG APP_NAME="product-service"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/build/libs/product-service.0.0.1.jar"

COPY /build/libs/product-service.0.0.1.jar app.jar
ENTRYPOINT ["java","-jar", "app.jar"]