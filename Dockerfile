FROM maven:latest
LABEL authors='Jarkko'

WORKDIR /app

COPY pom.xml /app

COPY . /app

RUN mvn package

CMD ["java",  "jar", "target/caljar.jar"]