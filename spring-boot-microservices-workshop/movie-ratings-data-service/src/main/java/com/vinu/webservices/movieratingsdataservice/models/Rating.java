/**
 * 
 */
package com.vinu.webservices.movieratingsdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Jan 18, 2020
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class Rating {
	
	private String movieId;
	private int rating;
}
