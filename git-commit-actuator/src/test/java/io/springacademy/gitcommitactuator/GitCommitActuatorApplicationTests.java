package io.springacademy.gitcommitactuator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

@SpringBootTest
class GitCommitActuatorApplicationTests {

    private TestRestTemplate testRestTemplate = new TestRestTemplate();

    @Test
    void gitCommitIdIsPresent() {
        String info = testRestTemplate.getForObject("http://localhost:8080/actuator/info", String.class);
        assertThatJson(info)
                .inPath("$.git.commit.id")
                .isNotNull()
                .isString();
    }

}
