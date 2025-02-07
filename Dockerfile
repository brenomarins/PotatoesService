FROM openjdk:17-jdk-alpine
COPY target/*.jar app.jar
EXPOSE 8421:8421
ENTRYPOINT ["java","-jar","app.jar"]