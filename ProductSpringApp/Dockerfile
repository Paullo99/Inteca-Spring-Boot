FROM openjdk:11
EXPOSE 8180
WORKDIR /app
COPY target/product-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "product-0.0.1-SNAPSHOT.jar" ]