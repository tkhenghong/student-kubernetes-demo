FROM openjdk:8
ADD ./build/libs/student-kubernetes-demo-0.0.1-SNAPSHOT.jar student-kubernetes-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/student-kubernetes-demo-0.0.1-SNAPSHOT.jar"]
