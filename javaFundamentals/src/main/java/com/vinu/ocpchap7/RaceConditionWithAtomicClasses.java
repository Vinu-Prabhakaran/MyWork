/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */

/*Any thread trying to access the sheepCount
variable while an atomic operation is in process will have to wait until the atomic operation on
the variable is complete. Of course, this exclusivity applies only to the threads trying to access
the sheepCount variable, with the rest of the memory space not affected by this operation*/


public class RaceConditionWithAtomicClasses {
	
	private AtomicInteger atomicCount= new AtomicInteger(0);
	private void incrementAndReport() {
		System.out.print((atomicCount.incrementAndGet()+ " "));
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = null;
		try {
			service= Executors.newFixedThreadPool(20);
			RaceConditionWithAtomicClasses test= new RaceConditionWithAtomicClasses();
			
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
