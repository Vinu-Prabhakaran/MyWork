/**
 * 
 */
package com.vinu.ocpchap7;

/**
 * @author Vinu Prabhakaran
 *         on Jul 20, 2021
 *
 */
public class ExtendThread extends Thread{
	
	public ExtendThread(){
		System.out.println("ExtendThread Instance created");
	}
	@Override
	public void run() {
		for (int i=0;i<3;i++) {
			System.out.println("Printing record ExtendThread :"+i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Starting new Thread");
		new ExtendThread().start();
	}
}
