FROM openjdk:8-jre-alpine
EXPOSE 8091
WORKDIR /usr/src
COPY target/springDemo-0.0.1-SNAPSHOT.jar springdemo.war
CMD ["java","-jar","springdemo.war"]
