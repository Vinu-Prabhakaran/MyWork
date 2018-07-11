package com.vinu.ocachap4;

//Order of initialzation
//Static variable declaration
//static initializer
//instance declaration
//Instance initializer
//Constructor


public class InitializationOrderSimple {
	
	private String name = "Torchie";
	{ System.out.println(name); }
	 private static int COUNT = 0;
	 static { System.out.println(COUNT); }
	 static { COUNT += 10; System.out.println(COUNT); }
	 public InitializationOrderSimple() {
	 System.out.println("constructor");
	 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before instantiation");
		InitializationOrderSimple io1 = new InitializationOrderSimple();  	//instance declaration,initialization and 
																			//Constructor happens only when a new instance is created 
		InitializationOrderSimple io2 = new InitializationOrderSimple(); 
	}	

}
