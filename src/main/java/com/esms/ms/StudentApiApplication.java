package com.esms.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class StudentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
	}

}
