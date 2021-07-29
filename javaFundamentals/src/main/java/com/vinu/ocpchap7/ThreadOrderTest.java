/**
 * 
 */
package com.vinu.ocpchap7;

/**
 * @author Vinu Prabhakaran
 *         on Jul 22, 2021
 *
 */
public class ThreadOrderTest {
	
	public static void main(String[] args) {
		System.out.println("Begin");
		new ExtendThread().start();
		new Thread(new ImplementRunnable()).start();
		new ExtendThread().start();
		System.out.println("end");
	}
}
