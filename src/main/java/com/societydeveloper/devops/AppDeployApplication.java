package com.societydeveloper.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppDeployApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AppDeployApplication.class, args);
	}

}
