package com.learningportal.EfAcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EfAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAcademyApplication.class, args);
	}

}
