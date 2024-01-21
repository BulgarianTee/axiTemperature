FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . /app

EXPOSE 8080

CMD ["java", "-jar", "./target/axitemperature-0.0.1-SNAPSHOT.jar"]
