FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-ecs.jar spring-boot-docker-ecs.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-ecs.jar"]