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
public class ExecutorSingleThreadExecute {
	
	public static void main(String[] args) {
		
		ExecutorService service=null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			service.execute(() -> System.out.println("Printing Zoo inventory"));
			service.execute(() -> {
				for (int i=0;i<3;i++) {
					System.out.println("Printing Record :"+i);
				}
			});
			service.execute(() -> System.out.println("Printing Zoo inventory"));
			System.out.println("end");
		}finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}
