/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.vinu.webservices.moviecatalogservice.models.CatalogItem;
import com.vinu.webservices.moviecatalogservice.models.CatalogItems;
import com.vinu.webservices.moviecatalogservice.models.Movie;
import com.vinu.webservices.moviecatalogservice.models.Movies;
import com.vinu.webservices.moviecatalogservice.models.UserRating;

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
	
	@Value("${ratingsurl}")
	String ratingsUrl;
	@Value("${moviesurl}")
	String moviesUrl;
	
	@GetMapping("/ratings/{rating}")
	public CatalogItems getCatalog(@PathVariable Integer rating){
		
		//return Arrays.asList(new CatalogItem("Martrix", "Hifi", 8));
		//get all rated movies, collect details for each of them and return as a list
		UserRating ratings = restTemplate.getForEntity(ratingsUrl+rating.toString(), UserRating.class).getBody();
		List<CatalogItem> catItems=new ArrayList<>();
		//return ratings;
		ratings.getRatingList().forEach(r -> {
			System.out.println("Call MovieInfo for "+r.getMovieId());
			Movie movie=restTemplate.getForEntity(moviesUrl+r.getMovieId(), Movie.class).getBody();
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
