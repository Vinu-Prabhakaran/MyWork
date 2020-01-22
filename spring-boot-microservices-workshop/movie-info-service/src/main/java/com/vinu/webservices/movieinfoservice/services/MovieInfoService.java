/**
 * 
 */
package com.vinu.webservices.movieinfoservice.services;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.vinu.webservices.movieinfoservice.models.Movie;

/**
 * @author Vinu Prabhakaran
 *         on Jan 21, 2020
 *
 */
@Service
public class MovieInfoService {
	
	List<Movie> movies = Arrays.asList(new Movie("M123", "The Matrix"),
									   new Movie("M234", "Pikachu"),
									   new Movie("M345", "Moana"));
	
	public List<Movie> getAllMovies(){
		return movies;
	}
	
	public Movie getMovieById(String movieId) {
		return movies.stream().filter(m -> m.getMovieId().equals(movieId)).findFirst().get();
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public void removeMovie(String movieId) {
		
		movies.removeIf(m -> m.getMovieId().equals(movieId));
	}
	
	public void updateMovie(String movieId, Movie movie) {
		
		for (int i=0;i<movies.size();i++) {
			if (movies.get(i).getMovieId().equals(movieId)) {
				movies.set(i, movie);
			}
		}
	}
}
