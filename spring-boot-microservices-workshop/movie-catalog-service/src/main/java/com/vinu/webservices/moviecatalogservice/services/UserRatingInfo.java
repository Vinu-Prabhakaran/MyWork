/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vinu.webservices.moviecatalogservice.models.Rating;
import com.vinu.webservices.moviecatalogservice.models.UserRating;

/**
 * @author Vinu Prabhakaran
 *         on Sep 4, 2021
 *
 */
@Service
public class UserRatingInfo {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${ratingsurl}")
	String ratingsUrl;
	
	@HystrixCommand(fallbackMethod="getFallbackUserRating")
	public UserRating getUserRating(String userId) {
		return restTemplate.getForEntity(ratingsUrl+userId, UserRating.class).getBody();
	}
	
	public UserRating getFallbackUserRating(String userId) {
	
		return new UserRating(userId, Arrays.asList(new Rating("000", 0)));
	}
}
