FROM openjdk:8-jdk-alpine
COPY target/exercise-emily-w-0.0.1-SNAPSHOT.jar exercise-emily-w-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/exercise-emily-w-0.0.1-SNAPSHOT.jar"]
