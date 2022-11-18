FROM openjdk:11

ADD target/springboot-docker31.jar springboot-docker31.jar
COPY ${JAR_FILE} springboot-docker31.jar
ENTRYPOINT {"java","-jar","springboot-docker31.jar"}