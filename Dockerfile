FROM openjdk:8

COPY ./target/discovery-server.jar discoveryserver.jar

EXPOSE 8761

CMD ["java","-jar","-Dspring.profile.active=local","discoveryserver.jar"]