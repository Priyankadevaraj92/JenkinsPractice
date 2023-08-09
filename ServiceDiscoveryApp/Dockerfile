FROM openjdk:19-jdk-alpine

WORKDIR /ServiceDiscoveryApp

COPY target/ServiceDiscoveryApp-0.0.1-SNAPSHOT.jar .

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "ServiceDiscoveryApp-0.0.1-SNAPSHOT.jar"]