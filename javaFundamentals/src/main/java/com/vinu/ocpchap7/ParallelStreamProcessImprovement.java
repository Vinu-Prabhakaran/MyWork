/**
 * 
 */
package com.vinu.ocpchap7;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Vinu Prabhakaran
 *         on Jul 28, 2021
 *
 */
public class ParallelStreamProcessImprovement {
	
	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		return input+1;
	}
	
	public void processAllData(List<Integer> data) {
		data.stream().map(a -> processRecord(a)).count();
	}
	
	public void processAllDataParallel(List<Integer> data) {
		data.parallelStream().map(a -> processRecord(a)).count();
	}
	
	public static void main(String[] args) {
		
		ParallelStreamProcessImprovement calculator= new ParallelStreamProcessImprovement();
		
		List<Integer> data=Stream.iterate(0, i-> i++).limit(4000).collect(Collectors.toList());;
		long start=System.currentTimeMillis();
		System.out.println("Stream Process started @ "+Instant.now());
		calculator.processAllData(data);
		double time = (System.currentTimeMillis() - start) /1000;
		
		System.out.println("Process Ended in "+time+" seconds");
		System.out.println("Stream Process ended @ "+Instant.now());
		long start2=System.currentTimeMillis();
		System.out.println("Parallel Stream Process started @ "+Instant.now());
		calculator.processAllDataParallel(data);
		double time2 = (System.currentTimeMillis() - start2) /1000;
		System.out.println("Process Ended in "+time2+" seconds");
		System.out.println("Parallel Stream Process ended @ "+Instant.now());
	}
}
