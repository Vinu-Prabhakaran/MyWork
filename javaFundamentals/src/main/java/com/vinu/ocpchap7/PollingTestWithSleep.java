/**
 * 
 */
package com.vinu.ocpchap7;

import java.time.LocalDateTime;

/**
 * @author Vinu Prabhakaran
 *         on Jul 22, 2021
 *
 */
public class PollingTestWithSleep {
	
	private static int counter;
	public static void main(String[] args) throws InterruptedException {
		
		new Thread(() -> {
			for (int i=0;i < 500;i++) {
				counter++;
			}
		}).start();
		
		while(counter < 100) {
			System.out.println("Not yet reached counter ="+counter +" @ "+LocalDateTime.now());
			Thread.sleep(1000);
		}
		System.out.println("Reached counter="+counter+" @ "+LocalDateTime.now());
	}
}
