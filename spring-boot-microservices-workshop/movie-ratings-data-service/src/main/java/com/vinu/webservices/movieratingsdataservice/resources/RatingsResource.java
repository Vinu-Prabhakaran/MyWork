/**
 * 
 */
package com.vinu.webservices.movieratingsdataservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.webservices.movieratingsdataservice.models.Rating;
import com.vinu.webservices.movieratingsdataservice.models.UserRating;
import com.vinu.webservices.movieratingsdataservice.service.RatingsService;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@Autowired
	RatingsService ratingsService;
	
	@GetMapping("/{movieId}")
	public Rating getMovieRating(@PathVariable String movieId) {
		return ratingsService.getMovieRating(movieId);
	}
	
	@GetMapping("/byrating/{rating}")
	public UserRating getMoviesByRating(@PathVariable Integer rating) {
		return ratingsService.getMovieListByRating(rating);
	}
}
