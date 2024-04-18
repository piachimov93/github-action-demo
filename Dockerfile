FROM openjdk:17
EXPOSE 8080
COPY target/github-action-demo.jar github-action-demo.jar
ENTRYPOINT ["java", "-jar", "/github-action-demo.jar"]