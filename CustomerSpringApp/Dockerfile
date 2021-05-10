FROM openjdk:11
EXPOSE 8280
WORKDIR /app
COPY /target/customer-0.0.1-SNAPSHOT.jar /app
run chmod +x /app
CMD java -jar customer-0.0.1-SNAPSHOT.jar