/**
 * 
 */
package com.vinu.ocpchap7;

/**
 * @author Vinu Prabhakaran
 *         on Jul 22, 2021
 *
 */
/*Anytime you create a Thread instance, make sure that you remember to start the
task with the Thread.start() method. This starts the task in a separate operating system
thread. Here when run() is invoked the thread that made the
call will be used to execute the task, causing the thread to wait until each run() method is
complete before moving on to the next line*/
public class ThreadWithoutStart {
	
	public static void main(String[] args) {
		System.out.println("Begin");
		new ImplementRunnable().run();
		new ExtendThread().run();
		new Thread(new ImplementRunnable()).run();
		System.out.println("End");
	}
}
