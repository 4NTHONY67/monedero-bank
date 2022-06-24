FROM openjdk:11
VOLUME /tmp
EXPOSE 8087
ADD ./target/monedero-bank-0.0.1-SNAPSHOT.jar monedero-bank.jar
ENTRYPOINT ["java","-jar","monedero-bank.jar"]