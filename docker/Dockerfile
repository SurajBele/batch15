FROM ubuntu:20.04
RUN apt-get update
RUN apt-get install apache2 -y
COPY index.html /var/www/html/index.html
EXPOSE 80
CMD [ "apache2ctl", "-D", "FOREGROUND" ]