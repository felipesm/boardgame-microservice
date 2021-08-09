FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/bg-api-gateway-0.0.1-SNAPSHOT.jar bg-api-gateway.jar
ENTRYPOINT ["java", "-jar", "/bg-api-gateway.jar"]