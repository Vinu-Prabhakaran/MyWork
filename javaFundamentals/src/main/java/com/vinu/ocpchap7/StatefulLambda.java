/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Vinu Prabhakaran
 *         on Jul 28, 2021
 *
 */
/*A stateful lambda expression is one whose result depends on any state that might change during
the execution of a pipeline. On the other hand, a stateless lambda expression is one whose
result does not depend on any state that might change during the execution of a pipeline.*/
public class StatefulLambda {
	
	public static void main(String[] args) {
		
		List<Integer> data=Collections.synchronizedList(new ArrayList<>());
		/*We applied the parallel stream to a synchronized list in the previous example. Anytime
		you are working with a collection with a parallel stream, it is recommended that you use
		a concurrent collection. For example, if we had used a regular ArrayList rather than a
		synchronized one, we could have seen output such as the following:*/
		
		Arrays.asList(1,2,3,4,5,6)
				.parallelStream()
				.map(n -> {data.add(n);
							return n;})
				.forEachOrdered(n -> {System.out.print(n+" ");});
		
		System.out.println();
		data.forEach(n -> {System.out.print(n+" ");});
		
		System.out.println();
		Arrays.asList(1,2,3,4,5,6)
			.stream()
			.skip(3)
			.limit(2)
			.findFirst()
			.ifPresent(System.out::println);
		
		System.out.println("Different result with parallel stream");
		Arrays.asList(1,2,3,4,5,6)
			.parallelStream()
			.skip(3)
			.limit(2)
			.findFirst()
			.ifPresent(System.out::println);
		
		Stream.generate(() -> new Random().nextInt(50))
			  .limit(10)
			  .forEach(System.out::println);
	}
}
