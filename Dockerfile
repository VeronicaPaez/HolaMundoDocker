# Imagen base de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Copiar el JAR a la imagen
COPY target/HolaMundoDocker-0.0.1-SNAPSHOT.jar app.jar

# Ejecutar el JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]