package com.example.learning_gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.learning_gradle.repository")
public class LearningGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningGradleApplication.class, args);
	}

}
