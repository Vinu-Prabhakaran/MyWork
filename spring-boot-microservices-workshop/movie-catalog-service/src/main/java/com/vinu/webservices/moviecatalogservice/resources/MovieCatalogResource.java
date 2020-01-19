/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.resources;

import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.webservices.moviecatalogservice.models.CatalogItem;

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
		
		return Arrays.asList(new CatalogItem("Martrix", "Hifi", 8));
		
	}
}
