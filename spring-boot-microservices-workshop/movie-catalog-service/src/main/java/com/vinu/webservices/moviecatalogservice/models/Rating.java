/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	
	private String movieId;
	private Integer rating;
}
