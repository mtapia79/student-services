FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER manueltapiamorales@gmail.com
RUN apk add --update \
    curl \
    && rm -rf /var/cache/apk/*
ADD target/student-services-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]