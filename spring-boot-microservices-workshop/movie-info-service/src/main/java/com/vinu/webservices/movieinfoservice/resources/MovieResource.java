/**
 * 
 */
package com.vinu.webservices.movieinfoservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vinu.webservices.moviedb.response.model.MovieDetail;
import com.vinu.webservices.movieinfoservice.models.Movie;
import com.vinu.webservices.movieinfoservice.models.Movies;
import com.vinu.webservices.movieinfoservice.services.MovieInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieResource {
	
	@Autowired
	MovieInfoService movieInfoService;
	@Autowired
	RestTemplate restTemplate;
	@Value("${moviedb.url}")
	String moviesUrl;
	@Value("${api.key}")
	String apiKey;
	
	@GetMapping
	public Movies getAllMovies(){
		
		return movieInfoService.getAllMovies();
	}
	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId){
		log.info("MovieInfo Service called for movieId "+movieId);
		//return movieInfoService.getMovieById(movieId);
		MovieDetail movie=restTemplate.getForEntity(moviesUrl+movieId+"?api_key="+apiKey, MovieDetail.class).getBody();
		log.info("MovieFetched -"+movie);
		return new Movie(movie.getId().toString(), movie.getTitle(), movie.getOverview());		
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
