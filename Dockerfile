FROM openjdk:15
ADD target/DockerComposeJava-2.3.4.RELEASE.jar DockerComposeJava-2.3.4.RELEASE.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "DockerComposeJava-2.3.4.RELEASE.jar"]  