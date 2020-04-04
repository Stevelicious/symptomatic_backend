FROM openjdk:8

COPY ./target/*.jar /usr/backend/app.jar
WORKDIR /usr/backend
EXPOSE 8080

CMD ["java", "-jar", "app.jar"]