FROM openjdk:17
EXPOSE 8080
ADD target/dockerdemo-image.jar dockerdemo-image.jar
ENTRYPOINT ["java", "-jar", "/dockerdemo-image.jar"]
