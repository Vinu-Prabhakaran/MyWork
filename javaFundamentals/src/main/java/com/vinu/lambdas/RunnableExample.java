package com.vinu.lambdas;

// 1.public class RunnableExample extends Thread{
public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside thread run()");
			}
		});
		
		t.run();
		Runnable runLambda = () -> System.out.println("Inside Lambda run");
		runLambda.run();
	}

}
