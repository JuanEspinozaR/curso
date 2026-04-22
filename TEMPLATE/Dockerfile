FROM openjdk:17-alpine
WORKDIR /spring
# Create a non-root user
RUN addgroup -S spring && adduser -S spring -G spring
# Install OpenSSL as root
RUN apk add --no-cache openssl

# Extraer y agregar certificado PAS
COPY ca-bundle.pem ./ca-bundle.pem
# Importar el certificado al keystore de Java
RUN keytool -importcert -trustcacerts -file ca-bundle.pem -keystore /opt/openjdk-17/lib/security/cacerts \
    -alias app.penoles.mx -storepass changeit -noprompt
# Verificar que el certificado fue agregado correctamente
RUN keytool -list -v -keystore /opt/openjdk-17/lib/security/cacerts \
    -alias app.penoles.mx -storepass changeit

# Switch to non-root user
USER spring:spring
# Verify OpenSSL installation (this will now work)
RUN openssl version
# Copy JAR file into container
ADD codigo/target/sicap-backend.jar /spring
ARG JAR_FILE=target/*.jar
CMD ["java", "-jar", "sicap-backend.jar"]
EXPOSE 1223
