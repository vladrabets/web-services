# A Java SOAP Web Service


# Prerequisites

1. [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 8+
2. [Maven](https://maven.apache.org) 3+


# How to run

### Clone

```
git clone git@github.com:vladrabets/web-services.git
git checkout soap-service
```

### Inside

```
cd web-services
```

### Run

```
mvn package
mvn embedded-glassfish:run -Dhttp.port=8080
```

### Endpoint

[http://localhost:8080/BusStationEndpointService](http://localhost:8080/BusStationEndpointService)

### WSDL

[http://localhost:8080/BusStationEndpointService?wsdl](http://localhost:8080/BusStationEndpointService?wsdl)

# References

[Maven plugin for GlassFish](https://jinahya.wordpress.com/2015/04/23/using-maven-embedded-glassfish-plugin-4-x/)
