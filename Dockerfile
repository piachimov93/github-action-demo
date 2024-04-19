FROM openjdk:17
EXPOSE 8080 8000
COPY target/github-action-demo.jar github-action-demo.jar
ADD entrypoint.sh entrypoint.sh
ENTRYPOINT ["sh", "/entrypoint.sh"]