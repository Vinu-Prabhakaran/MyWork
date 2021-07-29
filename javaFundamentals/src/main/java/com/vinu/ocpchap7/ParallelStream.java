/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */
public class ParallelStream {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Stream<Integer> s1=list.stream();
		s1.forEach(System.out::print);
		System.out.println("\nIs s1 parallel :"+s1.isParallel());
		
		//Parallel stream may not maintain order since parallel threads execute concurrently on stream entriess.
		list.stream().parallel().forEach(System.out::print);
		//Method 2 to generate parallel stream
		System.out.println("\nMethod2 for parallel stream generation from collections");
		list.parallelStream().forEach(System.out::print);
		/*The Streams	API includes an alternate version of the forEach() operation called	forEachOrdered(),
		which forces a parallel stream to process the results in order at the cost of performance*/
		System.out.println("\nProcess in order using forEachOrdered");
		list.parallelStream().forEachOrdered(System.out::print);
	}
}
