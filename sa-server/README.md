# Spring Angular Server

Spring Angular Server will handle backend business logic for iFinance.

## Stack

The Spring Angular Server is built on top of a few core technologies:

* Java 21
* [Maven](https://maven.apache.org) (3.0.0+)
* [Spring Boot](https://spring.io/projects/spring-boot) (4.0.0+)

# Technologies

![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=white&style=plastic)
![Java](https://img.shields.io/badge/Java-ED8B00?style=plastic&logo=java&logoColor=white)
![Apache Maven Badge](https://img.shields.io/badge/Apache%20Maven-C71A36?logo=apachemaven&logoColor=white&style=plastic)

## Build

To build the Spring Angular Server without running tests:

`mvn clean compile`

To build the Spring Angular Server and run tests:

`mvn clean test`

To build the Spring Angular Server and generate code coverage:

`mvn clean verify`

## Environment

In order to run the Spring Angular Server the following environment variables must be set:

| VARIABLE | Description |
|:---------|:------------|
|          |             |

## Endpoints

A brief description of the endpoints can be found in this section.

### REST Endpoint

This endpoint will be called to...

| Method | Url           | Description |
|:-------|:--------------|:------------|
| GET    | .../endpoint/ | Returns ... |

### Health Check Endpoint

To verify the app is up and running you can call the health endpoint below

| Method | Url                  | Description                                      |
|:-------|:---------------------|:-------------------------------------------------|
| GET    | .../actuator/health/ | Returns `up` or `down` status of the application |
