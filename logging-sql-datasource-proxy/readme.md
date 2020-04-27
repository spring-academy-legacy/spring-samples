# Logging SQL in Spring Boot application with Datasource Proxy

**[Video tutorial on YouTube](https://www.youtube.com/watch?v=tan2UglgvME)**

Sample showing how to set up Spring Boot application to log all the SQL statements including parameter values and execution times using [Datasource Proxy](https://github.com/ttddyy/datasource-proxy) and [Spring Boot Data Source Decorator Starter](https://github.com/gavlyukovskiy/spring-boot-data-source-decorator).

[![Youtube Video](https://j.gifs.com/p8m08V.gif)](https://www.youtube.com/watch?v=tan2UglgvME)

### 1. Add Datasource Proxy Spring Boot Starter

```xml
<dependency>
    <groupId>com.github.gavlyukovskiy</groupId>
    <artifactId>datasource-proxy-spring-boot-starter</artifactId>
    <version>1.6.1</version>
</dependency>
```

### 2. Enable logging in application.properties

```properties
logging.level.net.ttddyy.dsproxy.listener.logging.SLF4JQueryLoggingListener=debug
```
