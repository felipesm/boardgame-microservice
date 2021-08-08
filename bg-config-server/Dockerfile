FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/bg-config-server-0.0.1-SNAPSHOT.jar bg-config-server.jar
ENTRYPOINT ["java", "-jar", "/bg-config-server.jar"]