FROM openjdk:21
ADD ./dslist.jar dslist.jar
ENTRYPOINT ["java", "-jar", "dslist.jar"]