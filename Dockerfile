FROM openjdk:8
ADD target/annaDoc.jar annaDoc.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","annaDoc.jar"]