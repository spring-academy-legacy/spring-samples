package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoggingSqlDatasourceProxyApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingSqlDatasourceProxyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingSqlDatasourceProxyApplication.class, args);
	}

	/**
	 * This piece of code is executed on application startup.
	 */
	@Bean
	ApplicationRunner applicationRunner(BookRepository bookRepository) {
		return args -> {
			bookRepository.save(new Book("Lean Startup"));
			bookRepository.save(new Book("Atomic Habits"));

			LOGGER.info("{}", bookRepository.findByTitle("Lean Startup"));
		};
	}

}
