FROM openjdk:11
VOLUME /tmp
ADD ./target/bg-oauth-0.0.1-SNAPSHOT.jar bg-oauth.jar
ENTRYPOINT ["java", "-jar", "/bg-oauth.jar"]