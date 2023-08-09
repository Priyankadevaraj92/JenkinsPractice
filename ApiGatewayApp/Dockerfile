
FROM openjdk:19-jdk-alpine

WORKDIR /ApiGatewayServiceApp

COPY target/ApiGatewayApp-0.0.1-SNAPSHOT.jar .

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "ApiGatewayApp-0.0.1-SNAPSHOT.jar"]