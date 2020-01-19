/**
 * 
 */
package com.vinu.webservices.movieratingsdataservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.webservices.movieratingsdataservice.models.Rating;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}
}
