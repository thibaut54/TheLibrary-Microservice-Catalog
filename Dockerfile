FROM openjdk:11
ADD /microservice-0.0.1-SNAPSHOT.war /microservice-0.0.1-SNAPSHOT.war
EXPOSE 8090
#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/thelibrary.war"]
#ENTRYPOINT ["java", "-jar", "microservice-0.0.1-SNAPSHOT.jar"]
CMD java -jar microservice-0.0.1-SNAPSHOT.war
