/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */
/*A problem occurs when two threads both execute the right side of the expression, reading
the “old” value before either thread writes the “new” value of the variable. The two
assignments become redundant; they both assign the same new value, with one thread
overwriting the results of the other*/
public class RaceConditionFail {
	
	private int count=0;
	private void incrementAndReport() {
		System.out.print((++count+ " "));
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = null;
		try {
			service= Executors.newFixedThreadPool(20);
			RaceConditionFail test= new RaceConditionFail();
			
			for (int i=0; i<10;i++) {
				service.submit(() -> test.incrementAndReport());
		}
		}finally {
			if (service != null) {
				service.shutdown();
			}
		}
		
	}
}
