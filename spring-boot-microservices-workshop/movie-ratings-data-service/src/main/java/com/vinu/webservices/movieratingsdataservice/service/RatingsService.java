/**
 * 
 */
package com.vinu.webservices.movieratingsdataservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vinu.webservices.movieratingsdataservice.models.Rating;
import com.vinu.webservices.movieratingsdataservice.models.UserRating;


/**
 * @author Vinu Prabhakaran
 *         on Jan 21, 2020
 *
 */
@Service
public class RatingsService {
	
	UserRating ratings = new UserRating(Arrays.asList(new Rating("200", 9),
			   new Rating("100", 7),
			   new Rating("101", 8),
			   new Rating("102", 9)));

	public UserRating getMovieListByRating(Integer rating) {
		//return ratings.getRatingList().stream().filter(r -> r.getRating().equals(rating)).map(r -> r.getMovieId()).collect(Collectors.toList());
		List<Rating> moviesByRating=ratings.getRatingList()
									.stream()
									.filter(r -> r.getRating().equals(rating))
									.collect(Collectors.toList());
		if (moviesByRating.size() > 0) {
			return new UserRating(moviesByRating);
		}else {
			return new UserRating();
		}
	}
	
	public Rating getMovieRating(String movieId) {
		return ratings.getRatingList().stream().filter(r -> r.getMovieId().equals(movieId)).findFirst().get();
	}
	
	public void addRating(Rating rating) {
		ratings.getRatingList().add(rating);
	}
}
