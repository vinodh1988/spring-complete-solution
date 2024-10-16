package com.springapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.appx.solution") to scan the packages which are out of the base package
// @EntityScan(basePackages = "com.appx.entities")

public class SpringBootCompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCompleteApplication.class, args);
		System.out.println("App started");
		
	}

}
