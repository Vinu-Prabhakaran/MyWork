package com.vinu.learn;

// This code doesn't work. Need to check how to compile the program to enable assertions
// javac -source 1.8 AssertDemo.java
// java ea:AssertDemo to execute with assert enabled.
// Checked - in Run configurations, under VM arguments add -ea
public class AssertDemo {
	
	static float balance=1000;
	static void transaction(float amt) {
		balance-=amt;
		System.out.println("The current balance is "+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i<4;i++) {
			transaction(400);
			assert balance > 500:"Balance has gone below 500!";
		}
	}

}
