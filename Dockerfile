FROM eclipse-temurin:22-jdk-alpine

WORKDIR app/

COPY /api/target/*.jar /app/api.jar
COPY /service/target/*.jar /app/service.jar
COPY /provider/target/*.jar /app/provider.jar

# Ensure the script is executable
RUN chmod +x /__cacert_entrypoint.sh

CMD ["java","--enable-preview","-p", "/app/api.jar:/app/service.jar:/app/provider.jar", "-m", "org.example.provider/org.example.provider.CurrencyProvider"]
