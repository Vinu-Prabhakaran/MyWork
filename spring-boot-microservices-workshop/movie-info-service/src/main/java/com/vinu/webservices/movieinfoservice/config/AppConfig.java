/**
 * 
 */
package com.vinu.webservices.movieinfoservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vinu Prabhakaran
 *         on Feb 13, 2020
 *
 */
@Configuration
public class AppConfig {
	
	@Bean
	//@LoadBalanced
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
}

