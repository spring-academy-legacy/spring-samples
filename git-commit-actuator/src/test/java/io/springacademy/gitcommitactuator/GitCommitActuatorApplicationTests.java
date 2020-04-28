package io.springacademy.gitcommitactuator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class GitCommitActuatorApplicationTests {

    @LocalServerPort
    private int port;

    private TestRestTemplate testRestTemplate = new TestRestTemplate();

    @Test
    void gitCommitIdIsPresent() {
        String info = testRestTemplate.getForObject("http://localhost:"+ port + "/actuator/info", String.class);
        assertThatJson(info)
                .inPath("$.git.commit.id")
                .isNotNull()
                .isString();
    }

}
