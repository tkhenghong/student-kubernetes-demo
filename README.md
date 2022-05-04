# Spring Boot Student Kubernetes Demo

Build an application that demonstrates the use of Spring Boot with Kubernetes.

[Tutorial Link](https://dzone.com/articles/spring-boot-with-kubernetes)


## Generated File
student-kubernetes-demo-0.0.1-SNAPSHOT.jar

## Requirements
* [Kubernetes](https://kubernetes.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud](https://spring.io/projects/spring-cloud)
* [Docker](https://www.docker.com/)

## Steps
1. gradle clean build
2. docker build -t student-kubernetes-demo:0.0.1-SNAPSHOT .
3. docker run -p 8080:8080 student-kubernetes-demo:0.0.1-SNAPSHOT
4. kubectl apply -f deployment.yaml
5. kubectl port-forward service/student-kubernetes-demo 8080:8080

### Diagnose Docker Vulnerabilities
docker scan student-kubernetes-demo:0.0.1-SNAPSHOT

### Publish Docker container to Docker Hub
1. docker login
2. docker tag student-kubernetes-demo:0.0.1-SNAPSHOT tkhenghong/student-kubernetes-demo:0.0.1-SNAPSHOT
3. docker push student-kubernetes-demo:0.0.1-SNAPSHOT
