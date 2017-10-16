package com.wei.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	// 1. Annotation
	@RequestMapping("/")
	public String first() { // 3
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String second() { // 3
		return "Spring Boot is great! So easy to just respond with strings";
	}


}
