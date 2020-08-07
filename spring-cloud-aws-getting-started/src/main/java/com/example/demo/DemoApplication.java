package com.example.demo;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = ContextInstanceDataAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AmazonS3 amazonS3) {
		return args -> {
			amazonS3.listBuckets().forEach(bucket -> System.out.println(bucket.getName()));
		};
	}

}
