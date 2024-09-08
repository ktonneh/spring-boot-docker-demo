# Stage 1: Build with Maven
FROM maven:3.9.9-eclipse-temurin-22-alpine AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: Runtime environment with JDK
FROM eclipse-temurin:22.0.2_9-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]



