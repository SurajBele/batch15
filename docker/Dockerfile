# FROM ubuntu:20.04
# RUN apt-get update
# ENV DEBIAN_FRONTEND=noninteractive
# RUN apt-get install apache2 -y
# COPY index.html /var/www/html/index.html
# EXPOSE 80
# CMD [ "apache2ctl", "-D", "FOREGROUND" ]

FROM ubuntu:22.04
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && \
    apt-get install openjdk-21-jdk -y curl
ENV TOMCAT_VERSION=9.0.113

RUN curl https://dlcdn.apache.org/tomcat/tomcat-9/v{TOMCAT_VERSION}/bin/apache-tomcat-{TOMCAT_VERSION}.tar.gz \
| tar -xzf -C /opt
WORKDIR /opt/apache-tomcat-{TOMCAT_VERSION}/bin
EXPOSE 8080
# start tomcat
CMD [ "./catalina.sh", "run" ]

