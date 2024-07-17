package com.springboot_github_actions_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubActionsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubActionsDemoApplication.class, args);
	}

	@GetMapping("/home")
	public String get(){
		return "My first github actions demo";
	}

}
