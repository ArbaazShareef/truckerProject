FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG ./target/trucker-api-1.0.0.jar
COPY ${JAR_FILE} api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]