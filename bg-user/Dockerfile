FROM openjdk:11
VOLUME /tmp
ADD ./target/bg-user-0.0.1-SNAPSHOT.jar bg-user.jar
ENTRYPOINT ["java", "-jar", "/bg-user.jar"]