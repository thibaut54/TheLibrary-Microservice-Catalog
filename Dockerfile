FROM openjdk:8
COPY microservice/target/microservice-0.0.1-SNAPSHOT.jar /thelibrary.jar
EXPOSE 8090
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/thelibrary.war"]
#ENTRYPOINT ["java", "-jar", "microservice-0.0.1-SNAPSHOT.jar"]
