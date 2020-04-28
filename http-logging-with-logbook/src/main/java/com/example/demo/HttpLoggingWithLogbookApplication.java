package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HttpLoggingWithLogbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpLoggingWithLogbookApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/")
	Hello hello() {
		return new Hello("hello world");
	}

}

class Hello {
	private final String message;

	Hello(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
