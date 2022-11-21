FROM dargiri/builder-openjdk17

ARG APP_NAME="product-service"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="target/Amazon.products-0.0.1-SNAPSHOT.jar"

COPY ${JAR_FILE} app1.jar
ENTRYPOINT ["java","-jar", "app1.jar"]