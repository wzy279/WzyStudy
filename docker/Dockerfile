FROM openjdk:8-jdk-alpine
WORKDIR /app
ADD consumer.jar /app/consumer.jar
ADD utils-1.0-SNAPSHOT.jar /app/utils.jar
ADD provider.jar /app/provider.jar
ADD gateway.jar /app/gateway.jar
ADD start.sh /app/start.sh
RUN chmod 777 /app/start.sh
ENTRYPOINT ["sh","-c","/app/start.sh"]