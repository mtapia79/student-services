FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER manueltapiamorales@gmail.com
ADD student-services-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 3000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
# Use one of the standard Node images from Docker Hub 
#FROM node:boron
# The Dockerfile's author
#LABEL Manuel Tapia
# Create a directory in the container where the code will be placed
#RUN mkdir -p /backend-dir-inside-container
# Set this as the default working directory.
# We'll land here when we SSH into the container.
#WORKDIR /backend-dir-inside-container
# Our Nginx container will forward HTTP traffic to containers of 
# this image via port 3000. For this, 3000 needs to be 'open'.
#EXPOSE 3000