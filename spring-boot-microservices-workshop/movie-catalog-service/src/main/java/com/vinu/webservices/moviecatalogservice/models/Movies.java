/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Jan 22, 2020
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
	
	List<Movie> movies;
}
