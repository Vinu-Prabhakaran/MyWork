/**
 * 
 */
package com.vinu.ocpchap4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 * @author Vinu Prabhakaran
 *         on Jul 16, 2021
 *
 */
public class PrimitiveStreams {
	
	public static void main(String[] args) {
		
		List<Integer> intList=Arrays.asList(1,2,3);
		Stream<Integer> stream = Stream.of(1, 2, 3);
		
		System.out.println("IntStream");
		System.out.println(stream.mapToInt(n -> n).sum());
		System.out.println();
		
		System.out.println(IntStream.of(1,2,3)
				 .average());
		
		System.out.println("DoubleStream");
		DoubleStream.generate(Math::random)
					.limit(5)
					.forEach(System.out::println);
		
		DoubleStream.iterate(0.5, n -> n/2)
					.limit(5)
					.forEach(System.out::println);
		
		System.out.println("LongStream");
		System.out.println(LongStream.of(5, 10)
									 .sum());
		LongStream.of(5, 10)
		          .average()
		          .ifPresent(System.out::println);
	}
}
