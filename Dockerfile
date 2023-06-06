FROM openjdk:18

EXPOSE 8080

ADD target/RestDocker-0.0.1-SNAPSHOT.jar RestDocker-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","RestDocker-0.0.1-SNAPSHOT.jar" ]  