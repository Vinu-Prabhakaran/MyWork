package com.vinu.ocapractice;

public class Egg {
	public Egg() {
		number = 5;
	}
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
	
	private int number = 3;
	{ number = 4; } 
	{System.out.println("(Instance initiator)Number is "+number);}
}