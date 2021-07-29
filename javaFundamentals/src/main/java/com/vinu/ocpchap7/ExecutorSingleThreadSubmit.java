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
public class ExecutorSingleThreadSubmit {
	
	private static int counter = 0;
	public static void main(String[] args) {
			
		ExecutorService service=null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for (int i=0;i<500;i++) {
					counter++;
				}
			});
			result.get(100, TimeUnit.MICROSECONDS);
			
			System.out.println("Reached!!!");
		}catch (TimeoutException e) {
			// TODO Auto-generated catch block
			System.out.println("Not reached in time");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}
