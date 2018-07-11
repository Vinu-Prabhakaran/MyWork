package com.vinu.learn;

import java.time.LocalDateTime;

public class MainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current Thread is "+t);
		t.setName("MainThread");
		System.out.println("Thread after name change is "+t.getName());
		System.out.println("Thread priority is "+t.getPriority());
		System.out.println("Going to sleep for 5 seconds @ "+LocalDateTime.now());
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {
			System.out.println("Main Thread Interrupted");
		}
		finally{
			System.out.println("After 5 seconds...current thread is exiting @ "+LocalDateTime.now());
		}
	}

}
