FROM openjdk:8-jre

ENTRYPOINT ["java","-jar","/user-service.jar","--spring.profiles.active=prod"]

COPY /target/user-service-0.0.1-SNAPSHOT.jar /user-service.jar