/**
 * 
 */
package com.vinu.webservices.movieinfoservice.services;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.vinu.webservices.movieinfoservice.models.Movie;
import com.vinu.webservices.movieinfoservice.models.Movies;

/**
 * @author Vinu Prabhakaran
 *         on Jan 21, 2020
 *
 */
@Service
public class MovieInfoService {
	
	Movies movies = new Movies(Arrays.asList(new Movie("M123", "The Matrix","Keanu Reeves and Team"),
									   new Movie("M234", "Pikachu","Pokemon series"),
									   new Movie("M345", "Moana","A travels the sea"),
									   new Movie("M456", "Conjuring","Horror Wonder")));
	
	public Movies getAllMovies(){
		return movies;
	}
	
	public Movie getMovieById(String movieId) {
		return movies.getMovies().stream().filter(m -> m.getMovieId().equals(movieId)).findFirst().get();
	}
	
	public void addMovie(Movie movie) {
		movies.getMovies().add(movie);
	}
	
	public void removeMovie(String movieId) {
		
		movies.getMovies().removeIf(m -> m.getMovieId().equals(movieId));
	}
	
	public void updateMovie(String movieId, Movie movie) {
		
		for (int i=0;i<movies.getMovies().size();i++) {
			if (movies.getMovies().get(i).getMovieId().equals(movieId)) {
				movies.getMovies().set(i, movie);
			}
		}
	}
}
