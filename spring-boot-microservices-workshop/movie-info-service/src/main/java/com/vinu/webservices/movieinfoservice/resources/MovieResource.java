/**
 * 
 */
package com.vinu.webservices.movieinfoservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.webservices.movieinfoservice.models.Movie;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@GetMapping("/{movieId}")
	public List<Movie> getMovie(@PathVariable String movieId){
		
		return Arrays.asList(new Movie("M123","Matrix"));
	}
}
