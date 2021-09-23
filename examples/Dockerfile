FROM maven:3.6-jdk-11

COPY devops/ /usr/src/api

RUN mvn --batch-mode -f /usr/src/api/pom.xml clean package 

FROM openjdk:11-jdk-slim

COPY --from=0 /root/.m2 /root/.m2

COPY --from=0 /usr/src/api/target /app

WORKDIR /app

CMD ["/bin/bash", "-c", "find -type f -name '*.jar' | xargs java -jar"]

EXPOSE 8080