FROM openjdk:17-jdk-alpine
MAINTAINER Mukul
COPY out/artifacts/HelloWorld_jar/HelloWorld.jar HelloWorld.jar
ENTRYPOINT ["java","-jar","/HelloWorld.jar"]