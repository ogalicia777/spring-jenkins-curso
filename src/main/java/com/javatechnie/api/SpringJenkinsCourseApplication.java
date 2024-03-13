package com.javatechnie.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsCourseApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsCourseApplication.class);
	
	@PostConstruct
	//public void intt() {
	public intt() {
		logger.info("Application started...");
		
		logger.info("Application started 2...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsCourseApplication.class, args);
	}

}
