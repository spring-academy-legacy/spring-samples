# Git commit id in Spring Boot Actuator info endpoint

**[Video tutorial on YouTube](https://www.youtube.com/watch?v=HJqdevlVuEk)**

Sample showing how to include Git commit information in Spring Boot Actuator `/info` endpoint.

[![Youtube Video](https://j.gifs.com/L7zoJA.gif)](https://www.youtube.com/watch?v=tan2UglgvME)

### 1. Add Git Commit Id Maven plugin

```xml
<plugin>
    <groupId>pl.project13.maven</groupId>
    <artifactId>git-commit-id-plugin</artifactId>
    <configuration>
        <offline>true</offline>
    </configuration>
</plugin>
```

### 2. Hit `/actuator/info` endpoint

```
$ curl http://localhost:8080/actuator/info
```
