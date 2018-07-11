package com.vinu.learn;

import java.time.LocalDateTime;

class NewThread implements Runnable{
	Thread t;
	public NewThread(){
		t=new Thread(this,"ChildThread");
		System.out.println("Child Thread :"+t);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread started");
		System.out.println("Exiting Child Thread");
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
		System.out.println("Main Thread Started");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {
			System.out.println("Main Thread Interrupted");
		}
		finally{
			System.out.println("Main thread is exiting @ "+LocalDateTime.now());
		}
	}

}
