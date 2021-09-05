/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vinu.webservices.moviecatalogservice.models.CatalogItem;
import com.vinu.webservices.moviecatalogservice.models.CatalogItems;
import com.vinu.webservices.moviecatalogservice.models.Movie;
import com.vinu.webservices.moviecatalogservice.models.Rating;
import com.vinu.webservices.moviecatalogservice.models.UserRating;
import com.vinu.webservices.moviecatalogservice.services.MovieInfo;
import com.vinu.webservices.moviecatalogservice.services.UserRatingInfo;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	@Autowired
	MovieInfo movieInfo;
	
	@GetMapping("/user/{userId}")
	public CatalogItems getCatalog(@PathVariable String userId){
		
		//return Arrays.asList(new CatalogItem("Martrix", "Hifi", 8));
		//get all rated movies, collect details for each of them and return as a list
		UserRating ratings = userRatingInfo.getUserRating(userId);
		List<CatalogItem> catItems=new ArrayList<>();
		//return ratings;
		ratings.getRatingList().forEach(r -> {
			System.out.println("Call MovieInfo for "+r.getMovieId());
			Movie movie=movieInfo.getMovieForRating(r);
			//WebClient Substitute for RestTemplate
			/*Movie movie=WebClient.builder().build()
						.get()
						.uri(moviesUrl+r.getMovieId())
						.retrieve()
						.bodyToMono(Movie.class)
						.block();*/
			catItems.add(new CatalogItem(movie.getTitle(),movie.getDescription(),r.getRating()));
			});
		return new CatalogItems(catItems);
	}
	

}
