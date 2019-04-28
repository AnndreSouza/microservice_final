FROM openjdk:8
ADD target/microservice_final-0.0.1-SNAPSHOT.jar microservice_final.jar
EXPOSE 8080:8080
ENTRYPOINT ["java", "-jar", "microservice_final.jar"]