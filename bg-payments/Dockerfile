FROM openjdk:11
VOLUME /tmp
ADD ./target/bg-payments-0.0.1-SNAPSHOT.jar bg-payments.jar
ENTRYPOINT ["java", "-jar", "/bg-payments.jar"]