/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vinu.webservices.moviecatalogservice.models.Movie;
import com.vinu.webservices.moviecatalogservice.models.Rating;

/**
 * @author Vinu Prabhakaran
 *         on Sep 4, 2021
 *
 */
@Service
public class MovieInfo {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${moviesurl}")
	String moviesUrl;
	
	@HystrixCommand(fallbackMethod="getFallbackMovieForRating")
	public Movie getMovieForRating(Rating r) {
		return restTemplate.getForEntity(moviesUrl+r.getMovieId(), Movie.class).getBody();
	}
	
	public Movie getFallbackMovieForRating(Rating r) {
		return new Movie("000", "No Movie", "No Description");
	}
}
