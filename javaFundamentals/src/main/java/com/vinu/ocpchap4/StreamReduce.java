/**
 * 
 */
package com.vinu.ocpchap4;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author Vinu Prabhakaran
 *         on Jul 16, 2021
 *
 */
public class StreamReduce {
	
	public static void main(String[] args) {
		System.out.println("Merge letters to form a word");
		Stream.of("V","i","n","u")
			  .reduce((l1,l2) -> l1+l2).ifPresent(System.out::println);
		Stream.of("V","i","n","u")
			  .reduce(String::concat).ifPresent(System.out::println);
		  // or .reduce((l1,l2) -> l1.concat(l2)).ifPresent(System.out::println);
		
		System.out.println("Multiply numbers in a stream");
		Stream.of(1,2,3,4)
			  .reduce((n1,n2) -> n1*n2).ifPresent(System.out::println);
		
		BinaryOperator<Integer> op=(a,b) -> a*b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(2,3,4);
		
		empty.reduce(op).ifPresent(System.out::println);			//no output
		oneElement.reduce(op).ifPresent(System.out::println);		//same element printed
		threeElements.reduce(op).ifPresent(System.out::println);	//result of BinaryOperation printed
		//Reduce using Identity,Accumulator and combiner
		System.out.println(Stream.of('V','i','n','u')
				.reduce("", (c, s1) -> c+s1, String::concat));
		System.out.println(Stream.of("V","i","n","u")
		  .parallel().reduce("@", String::concat));
		System.out.println(Stream.of("V","i","n","u")
				  .reduce("@", (l1,l2)-> l1+"@"+l2));
	}
}
