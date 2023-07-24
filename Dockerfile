FROM openjdk:11
WORKDIR /
COPY target/*.jar ./app.jar
CMD ["java", "-jar", "./app.jar"]