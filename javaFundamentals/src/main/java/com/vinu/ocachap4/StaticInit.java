package com.vinu.ocachap4;

public class StaticInit {
	
	//Static Init Block is called only for the first time use of the class 
	private static final int NUM_SECONDS_PER_HOUR;
	static {
	int numSecondsPerMinute = 60;	// this is just a local variable in static init block
	int numMinutesPerHour = 60;		// this is just a local variable in static init block
	NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	System.out.println("In static init");
	}
	{
		System.out.println("From Instance initiator");	//called for every instance
	}
	
	public StaticInit() {
		
		System.out.println("In Constructor");
	}
	
	public static void display() {
		System.out.println("In static display()");
	}
	
	public static void main(String[] args) {
		
		StaticInit si1 = new StaticInit();
		StaticInit si2 = new StaticInit();
		
		si1.display();
		
	}

}
