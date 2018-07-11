package com.vinu.lambdas;



public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnyName lambdaGreeting = () -> System.out.println("Hello World");
		lambdaGreeting.anyFunction();
		
	}
	
	interface AnyName{
		public void anyFunction();
	}

}
