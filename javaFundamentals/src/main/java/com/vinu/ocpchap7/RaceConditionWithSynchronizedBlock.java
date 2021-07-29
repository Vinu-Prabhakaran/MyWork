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
/*How do we improve the results so that each worker is able to increment and report the
results in order? The most common technique is to use a monitor, also called a lock , to
synchronize access. A monitor is a structure that supports mutual exclusion or the property
that at most one thread is executing a particular segment of code at a given time.*/


/*We could have used an atomic count variable along with the synchronized
block in this example, although it is unnecessary. Since synchronized
blocks allow only one thread to enter, we're not gaining any improvement
by using an atomic variable if the only time that we access the variable is
within a synchronized block.*/
public class RaceConditionWithSynchronizedBlock {
	private int syncCount=0;
	private void incrementAndReport() {
		/*Although all threads are still created and executed at the same time, they each wait at
		the synchronized block for the worker to increment and report the result before entering.*/
		synchronized (this) {
			System.out.print((++syncCount+ " "));
		}
		
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = null;
		try {
			service= Executors.newFixedThreadPool(20);
			RaceConditionWithSynchronizedBlock test= new RaceConditionWithSynchronizedBlock();
			
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
