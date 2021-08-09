FROM openjdk:11
VOLUME /tmp
ADD ./target/bg-worker-0.0.1-SNAPSHOT.jar bg-worker.jar
ENTRYPOINT ["java", "-jar", "/bg-worker.jar"]