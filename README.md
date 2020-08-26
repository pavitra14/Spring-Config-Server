# Spring Cloud Config Server using BUS
![Version](https://img.shields.io/badge/version-0.0.1--SNAPSHOT-blue.svg?cacheSeconds=2592000)
[![Documentation](https://img.shields.io/badge/documentation-yes-brightgreen.svg)](todo)
[![License: TCS](https://img.shields.io/badge/License-TCS-yellow.svg)](#)

Springboot Cloud Config Server Implementation using kafka bus
 - Supports GIT Backend
 - Supports Spring Bus - Kafka
 - Supports AutoRefresh using /monitor webhook endpoint

> Kindly check application.yml file inside src/main/resources before running.
> Update git push event webhook to /monitor endpoint in git dashboard for autorefresh to work
***


## Compile

```sh
mvn clean package
```

## Usage

```sh
java -jar target/ConfigServer-0.0.1-SNAPSHOT.jar
```

## Author

👤 **Pavitra Behre**

* Website: pbehre.in
* Email: [behre.p1@tcs.com](mailto:behre.p1@tcs.com)
* LinkedIn: [@pavitrabehre](https://linkedin.com/in/pavitrabehre)