FROM ubuntu
RUN sudo apt-get update -y
RUN sudo apt-get install apache2 -y
COPY index.html /var/www/html/index.html
RUN sudo apt install openjdk-21-jdk -y
ADD https://downloads.apache.org/tomcat/tomcat-10/v10.1.50/bin/apache-tomcat-10.1.50.tar.gz.asc /opt
WORKDIR /opt
RUN tar -xzf apache-tomcat-10.1.50.tar.gz -C /opt 
ENV department dev
EXPOSE 8080
CMD [ "./catalina.sh", "run" ]
#ENTRYPOINT ["./catalina.sh", "run" ]
