/**
 * 
 */
package com.vinu.ocpchap7;

/**
 * @author Vinu Prabhakaran
 *         on Jul 20, 2021
 *
 */
public class ImplementRunnable implements Runnable{
	
	
	public ImplementRunnable() {
		System.out.println("ImplementRunnable instance created");
	}

	@Override
	public void run() {
		for (int i=0;i<3;i++) {
			System.out.println("Printing record ImplementRunnable :"+i);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Starting new thread");
		new Thread(new ImplementRunnable()).start();
	}
}
