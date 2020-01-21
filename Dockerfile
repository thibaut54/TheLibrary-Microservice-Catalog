FROM openjdk:8
ADD microservice/target/microservice-0.0.1-SNAPSHOT.jar microservice-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "microservice-0.0.1-SNAPSHOT.jar"]
