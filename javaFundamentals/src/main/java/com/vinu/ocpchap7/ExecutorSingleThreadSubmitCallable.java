/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */
public class ExecutorSingleThreadSubmitCallable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> results = service.submit(() -> 30+40);
			System.out.println("Result :"+results.get(100,TimeUnit.MICROSECONDS));

		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Executor Timed out");
		}finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}
