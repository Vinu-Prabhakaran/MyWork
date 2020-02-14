package com.vinu.springbootstarter;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Tells SpringBoot that this is the starting point
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//Static method call tells SpringBoot to start this application, create a servlet container and host this app
		ApplicationContext applicationContext =SpringApplication.run(CourseApiApp.class, args);
		//Print host of beans that are automatically loaded by the application context.
		for(String beanName :applicationContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
		

	}

}
