/**
 * 
 */
package com.vinu.webservices.movieratingsdataservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vinu.webservices.movieratingsdataservice.models.Rating;


/**
 * @author Vinu Prabhakaran
 *         on Jan 21, 2020
 *
 */
@Service
public class RatingsService {
	
	List<Rating> ratings = Arrays.asList(new Rating("M123", 9),
			   new Rating("M234", 7),
			   new Rating("M345", 8));

	public List<String> getMovieListByRating(Integer rating) {
		return ratings.stream().filter(r -> r.getRating().equals(rating)).map(r -> r.getMovieId()).collect(Collectors.toList());
	}
	
	public Rating getMovieRating(String movieId) {
		return ratings.stream().filter(r -> r.getMovieId().equals(movieId)).findFirst().get();
	}
	
	public void addRating(Rating rating) {
		ratings.add(rating);
	}
}
