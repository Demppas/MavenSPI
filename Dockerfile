FROM eclipse-temurin:22-jdk-alpine

WORKDIR app/

COPY ./api/target/*.jar /app/
COPY ./service/target/*.jar /app/
COPY ./provider/target/*.jar /app/

ENTRYPOINT ["java", "--module-path", "/app", "--module"]
CMD ["org.example.provider/org.example.provider.CurrencyProvider"]