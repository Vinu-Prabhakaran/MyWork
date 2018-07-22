package com.vinu.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tells SpringBoot that this is the starting point
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//Static method call tells SpringBoot to start this application, create a servlet container and host this app
		SpringApplication.run(CourseApiApp.class, args);
		

	}

}
