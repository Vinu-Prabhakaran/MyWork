/**
 * 
 */
package com.vinu.springboot.coronavirustracker.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vinu Prabhakaran
 *         on May 3, 2020
 *
 */
@Setter
@Getter
@ToString
public class LocationStats {
	
	String state;
	String country;
	Integer latestTotalCases;
}
