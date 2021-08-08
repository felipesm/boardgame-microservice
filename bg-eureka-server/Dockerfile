FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/bg-eureka-server-0.0.1-SNAPSHOT.jar bg-eureka-server.jar
ENTRYPOINT ["java", "-jar", "/bg-eureka-server.jar"]