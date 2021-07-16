/**
 * 
 */
package com.vinu.ocpchap4;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vinu Prabhakaran
 *         on Jul 16, 2021
 *
 */
public class StreamPipeline {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		//Get the first two names alphabetically that are four characters long
		list.stream()
			.filter(n -> n.length() ==4)
			.limit(2)
			.forEach(System.out::println);
		
	}
}
