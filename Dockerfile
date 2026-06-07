FROM ghcr.io/catthehacker/ubuntu:java-tools-24.04-20260429

RUN mkdir /opt/test
COPY . /opt/test/
WORKDIR /opt/test

ENV JAVA_HOME=/usr/lib/jvm/temurin-25-jdk-amd64

CMD ["/opt/test/mvnw",  "quarkus:dev"]
