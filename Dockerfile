FROM maven:3-jdk-8-alpine
COPY . /rest-api
WORKDIR /rest-api
RUN ["mvn", "clean", "install"]
CMD ["java", "-jar", "target/rest-service-0.0.1-SNAPSHOT.jar"]
