FROM arm64v8/openjdk:11.0.15-jdk-oracle
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.war"]