/**
 * 
 */
package com.vinu.webservices.moviecatalogservice.models;

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
public class CatalogItem {
	
	private String title;
	private String description;
	private int rating;
}
