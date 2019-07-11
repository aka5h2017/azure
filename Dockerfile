FROM openjdk:13-jdk-alpine

EXPOSE 8080

VOLUME /tmp

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]