FROM openjdk:8
WORKDIR /app
EXPOSE 8080
ADD target/springboot-github-actions-demo-0.0.1-SNAPSHOT.jar springboot-github-actions-demo.jar
ENTRYPOINT [ "java"  "-jar", "springboot-github-actions-demo.jar"]