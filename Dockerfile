From openjdk:11
Expose 8081
ADD ./target/demo-twilloSMS-0.0.1-SNAPSHOT.jar /usr/src/demo-twilloSMS-0.0.1-SNAPSHOT.jar
Wor
ENTRYPOINT ["java", "-jar", "/demo-twilloSMS-0.0.1-SNAPSHOT.jar"]