/**
 * 
 */
package com.vinu.ocpchap7;

import java.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */
public class ScheduledExecutorSingleThread {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
		Runnable rTask=() -> System.out.println("Runnable Task @ "+Instant.now());
		Callable<String> cTask = () -> "Callable Task @ "+Instant.now();
		
		ScheduledFuture<String> cResult = service.schedule(cTask, 500, TimeUnit.MILLISECONDS);
		ScheduledFuture<?> rResult = service.schedule(rTask, 100, TimeUnit.MILLISECONDS);

		if (service != null) {
			service.shutdown();
		}
		if (service.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println(cResult.get());
			service.shutdownNow();
		}
	}
}
