/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.resources;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinu Prabhakaran
 *         on Feb 2, 2020
 *
 */
@RestController
public class HealthCheck {
	
	@GetMapping("/")
	public String healthCheck() {
		
		InetAddress id;
		try {  
		      id = InetAddress.getLocalHost();  
		      System.out.println( id.getHostName());  
		    } catch (UnknownHostException e) { 
		    	return e.getMessage();
		    }  
		return "Movie Catalog service running on "+id.getHostName();
	}
}
