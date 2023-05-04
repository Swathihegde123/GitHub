FROM openJdk:8
EXPOSE 8080
ADD target/dockerdemo-image.jar dockerdemo-image.jar
ENTRYPOINT ["java", "-jar", "/dockerdemo-image.jar"]