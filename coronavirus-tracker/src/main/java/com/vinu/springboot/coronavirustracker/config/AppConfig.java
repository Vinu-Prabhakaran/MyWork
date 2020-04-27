/**
 * 
 */
package com.vinu.springboot.coronavirustracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vinu Prabhakaran
 *         on Jan 21, 2020
 *
 */
@Configuration
public class AppConfig {
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
}
