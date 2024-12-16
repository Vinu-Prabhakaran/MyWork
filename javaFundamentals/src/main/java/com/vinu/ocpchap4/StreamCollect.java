/**
 * 
 */
package com.vinu.ocpchap4;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Vinu Prabhakaran
 *         on Jul 16, 2021
 *
 */
public class StreamCollect {
	
	public static void main(String[] args) {
		Stream<String> letterStream = Stream.of("V","i","n","u");
		
		StringBuilder sb1=letterStream.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
		System.out.println("Merged :"+sb1);
		
		Stream<String> letterStream2 = Stream.of("M","e","r","g","e");
		System.out.println(letterStream2.collect(Collectors.joining("|")));
		
		System.out.println("Max length is "+Stream.of("lions", "tigers", "bears")
												  .collect(Collectors.summarizingInt(String::length))
												  .getMax());
		System.out.print("Max length is ");
		Stream.of("lions", "tigers", "bears")
			.mapToInt(String::length).max().ifPresent(System.out::println);
		System.out.println("****Collecting to Map****");
		System.out.println(Stream.of("lions", "tigers", "bears")
							  		.collect(Collectors.toMap(w -> w, String::length)));	
		System.out.println(Stream.of("lions", "tigers", "bears", "deers")
		  							.collect(Collectors.toMap(String::length, s -> s, (s1,s2) -> s1+","+s2)));
		
		System.out.println("Collecting Using Grouping, Partitioning, and Mapping");
		System.out.println("Group by Length :"+Stream.of("lions", "lions","tigers", "bears", "deers")
			.collect(Collectors.groupingBy(String::length)));
		System.out.println("Group by Length to Set:"+Stream.of("lions", "lions","rats","tigers", "bears", "deers")
		.collect(Collectors.groupingBy(String::length,Collectors.toSet())));
		System.out.println("Group by Length to Tree Set:"+Stream.of("lions", "lions","tigers", "bears", "deers")
		.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet())).firstKey());
		System.out.println("Partitioning based on length > 5 :"+
						Stream.of("lions", "lions","tigers", "bears", "deers")
							  .collect(Collectors.partitioningBy(w -> w.length() > 5)));
		System.out.println("Count of each group by length :"+
				Stream.of("lions", "lions","tigers", "bears", "deers")
					  .collect(Collectors.groupingBy(String::length, Collectors.counting())));
		/*System.out.println("Count of each group by length :"+
				Stream.of("lions", "lions","tigers", "bears", "deers")
				.collect(
					Collectors.groupingBy(
						String::length,
						Collectors.mapping(s -> s.charAt(0),
						Collectors.minBy(Comparator.naturalOrder()))));*/
		System.out.print("Max by length :");
				Stream.of("rats","lions","tigers", "bears", "deers")
					  .collect(Collectors.maxBy((a1,a2) -> a1.length() - a2.length())).ifPresent(System.out::println);
		System.out.print("Min by length :");
		Stream.of("rats","lions","tigers", "bears", "deers")
			  .collect(Collectors.minBy((a1,a2) -> a1.length() - a2.length())).ifPresent(System.out::println);

	}
}
