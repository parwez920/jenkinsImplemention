package com.jenkins.git;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsImplementionApplication {

	public static Logger logger= LoggerFactory.getLogger(JenkinsImplementionApplication.class);
	
	public void init() {
		logger.info("Application started......");
	}
	public static void main(String[] args) {
		logger.info("Application exceuted...");
		SpringApplication.run(JenkinsImplementionApplication.class, args);
	}

}