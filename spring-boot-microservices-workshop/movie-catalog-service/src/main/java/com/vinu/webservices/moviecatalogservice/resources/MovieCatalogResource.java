/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.webservices.moviecatalogservice.models.CatalogItem;
import com.vinu.webservices.movieratingsdataservice.models.Rating;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		//return Arrays.asList(new CatalogItem("Martrix", "Hifi", 8));
		//get all rated movies, collect details for each of them and return as a list
		List<Rating> ratings = Arrays.asList(new Rating("M123", 4),new Rating("M234", 3));
		return ratings.stream().map(rating -> new CatalogItem("Matrix", "HiFi", 4)).collect(Collectors.toList());
		
	}
}
