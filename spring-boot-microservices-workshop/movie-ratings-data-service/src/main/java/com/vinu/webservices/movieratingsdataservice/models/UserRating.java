/**
 * 
 */
package com.vinu.webservices.movieratingsdataservice.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Jan 21, 2020
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRating {
	
	private List<Rating> ratingList;
}
