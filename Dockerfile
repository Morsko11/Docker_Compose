FROM openjdk:21
WORKDIR /app
COPY target/DockerCompose-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","/app/DockerCompose-0.0.1-SNAPSHOT.jar"]
