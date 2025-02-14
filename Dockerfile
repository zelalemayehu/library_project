FROM maven:3.8.1-adoptopenjdk AS build
WORKDIR /app
COPY pom.xml .
COPY ./src ./src
RUN mvn clean install
FROM eclipse-temurin:17-jdk-jammy AS base
WORKDIR /app
COPY --from=build /app/target/LibraryProject-1.jar /app/LibraryProject.jar
EXPOSE 8080
CMD ["java", "-jar", "LibraryProject.jar"]