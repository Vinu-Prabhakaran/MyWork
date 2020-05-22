package com.vinu.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Marks this class as a controller.Tells SpringBoot that this is a class that deals with providing rest response to rest requests.
public class HelloController {
	
	@RequestMapping("/hello")
	//Tells to execute this method when the request to /hello
	public String sayHello() {
		
		return "Hello Vinu";
	}
	
	@RequestMapping("/")
	public String home() {
		
		return "TopicsApp";
	}
}
