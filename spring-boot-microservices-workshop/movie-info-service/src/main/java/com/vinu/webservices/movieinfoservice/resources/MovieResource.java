/**
 * 
 */
package com.vinu.webservices.movieinfoservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.webservices.movieinfoservice.models.Movie;
import com.vinu.webservices.movieinfoservice.models.Movies;
import com.vinu.webservices.movieinfoservice.services.MovieInfoService;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@Autowired
	MovieInfoService movieInfoService;
	
	@GetMapping
	public Movies getAllMovies(){
		
		return movieInfoService.getAllMovies();
	}
	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId){
		
		return movieInfoService.getMovieById(movieId);
	}
	
	@PostMapping("/{movieId}")
	public void updateMovie(@PathVariable String movieId, @RequestBody Movie movie){
		
		movieInfoService.updateMovie(movieId, movie);;
	}
	
	@PostMapping
	public void addMovie(@RequestBody Movie movie){
		
		movieInfoService.addMovie(movie);
	}
}
