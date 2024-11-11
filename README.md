# Spring Boot with Spring Cloud OpenFeign REST Client

### Pre-requisite

- [JDK version 17](https://openjdk.org/)

### Run Integration Test

```shell
# This will run @SpringBootTest for external and internal customer controllers
./gradlew test
```

### Start Server

```shell
# Start Spring Boot with Gradle
./gradlew bootRun

# Get customer information from given id with cURL command
curl localhost:8080/api/v1/customers/C001
```

### References

- [Declarative REST Client: Feign](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)
- [Spring Cloud OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)