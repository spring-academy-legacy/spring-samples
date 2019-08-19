package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Scheduled(fixedRate = 1000L)
    void somJob() throws InterruptedException {
        LOGGER.info(" someJob Now is " + new Date());
        Thread.sleep(1000L);
    }

    @Scheduled(fixedRate = 1000L)
    void somJob2() throws InterruptedException {
        LOGGER.info("somejob 2 Now is " + new Date());
        Thread.sleep(1000L);
    }
}

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "Scheduling.enabled", matchIfMissing = true)
class SchedulingConfiguration {

}