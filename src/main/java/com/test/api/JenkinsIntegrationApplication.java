package com.test.api;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsIntegrationApplication {

	@PostConstruct
	public void init(){
		System.out.println("Application started ....");
	}

	public static void main(String[] args) {
		System.out.println("Application executed ....");
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

}
