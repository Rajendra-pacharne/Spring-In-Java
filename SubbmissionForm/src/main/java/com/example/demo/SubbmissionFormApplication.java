package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication

public class SubbmissionFormApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SubbmissionFormApplication.class, args);
	}

}
