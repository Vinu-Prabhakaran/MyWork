package com.vinu.ocachap1;

public class InstanceInitiators {
	
	//Order of execution Field initiator,instance initiator,Constructor
	int numbers=0;				
	{System.out.println("Inside Instance Initiator");
	 numbers=10;
	}
	
	public InstanceInitiators() {
		System.out.println("FieldInitiators constructor");
	}
	
	public static void main(String[] args) {

		InstanceInitiators fi1 = new InstanceInitiators();
		System.out.println("fi1.numbers = "+fi1.numbers);
		InstanceInitiators fi2 = new InstanceInitiators();

	}

}
