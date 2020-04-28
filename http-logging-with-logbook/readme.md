# HTTP request and response logging with Spring Boot and Logbook

**[Video tutorial on YouTube](https://www.youtube.com/watch?v=0rWoTZBMTxI)**

Sample showing how to set up detailed HTTP logging with Spring Boot and [Logbook](https://github.com/zalando/logbook) and [Logbook Spring Boot Starter](https://github.com/zalando/logbook/tree/master/logbook-spring-boot-starter).

[![Youtube Video](https://j.gifs.com/QnG4WZ.gif)](https://www.youtube.com/watch?v=0rWoTZBMTxI)

### 1. Add Logbook dependency

```xml
<dependency>
    <groupId>org.zalando</groupId>
    <artifactId>logbook-spring-boot-starter</artifactId>
    <version>2.1.0</version>
</dependency>
```

### 2. Enable logging in application.yml

```yml
logging.level.org.zalando.logbook.Logbook: trace
```

### 3. Choose your logging style

```yml
logbook:
  format.style: http
```

### 4. Configure Logbook to obfuscate headers etc.

```yml
lobgook:
  obfuscate.headers:
    - MY-HEADER
```

Check [this table in Logbook docs](https://github.com/zalando/logbook#configuration) for all configuration options.
