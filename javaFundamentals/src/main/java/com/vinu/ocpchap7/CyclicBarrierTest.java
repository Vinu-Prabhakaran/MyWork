/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.concurrent.*;

/**
 * @author Vinu Prabhakaran
 *         on Jul 29, 2021
 *
 */
public class CyclicBarrierTest {
	
	private void removeAnimals() { System.out.println("Removing animals"); }
	private void cleanPen() { System.out.println("Cleaning the pen"); }
	private void addAnimals() { System.out.println("Adding animals"); }
	
	public void performTask() {
		try {
		removeAnimals();
		//c1.await();
		cleanPen();
		//c2.await();
		addAnimals();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void performTaskWithBarrier(CyclicBarrier c1,CyclicBarrier c2) {

			removeAnimals();
			try {
				c1.await();
				cleanPen();
				c2.await();
				addAnimals();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		
		ExecutorService service=null;
		
		try {
			
			service = Executors.newFixedThreadPool(4);
			CyclicBarrierTest manager=new CyclicBarrierTest();
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4,
							() -> System.out.println("*** Pen Cleaned!"));
			
			for (int i=0;i<4;i++) {
				//service.submit(() -> manager.performTask());
			}
			
			for (int i=0;i<4;i++) {
				service.submit(() -> manager.performTaskWithBarrier(c1,c2));
			}
			
		}finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}
}
