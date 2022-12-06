FROM dargiri/builder-openjdk17


ARG JAR_FILE="target/*.jar"

COPY ${JAR_FILE} rate-service.jar
ENTRYPOINT ["java","-jar", "rate-service.jar"]
EXPOSE 8082