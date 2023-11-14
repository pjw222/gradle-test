package com.kyugiljava4.webSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSpringApplication.class, args);
	}
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
}
