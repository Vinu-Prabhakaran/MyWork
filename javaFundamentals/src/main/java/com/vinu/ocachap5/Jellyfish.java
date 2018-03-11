package com.vinu.ocachap5;

// Variable Hiding and polymorphism
class Animal {
	public int length = 2;
	
	public void display() {
		System.out.println("From Animal display..."+length); //call from parent class method will access parent class variable 
	}
	
	public void callDisplay() {
		display();
	}
	
}

public class Jellyfish extends Animal {
	public int length = 5;
	
	public void display() {
		System.out.println("From JellyFish display..."+length);	//call from child class method will access child class variable. use super.length for parent value
	}
	
	public void callDisplay() {
		display();
	}
	
	public static void main(String[] args) {
		Jellyfish jellyfish = new Jellyfish();
		Animal animal = new Jellyfish();	//Jellyfish object assigned to Animal type reference variable. Reference variable type determines which variable is accessed (from child or parent).
		Animal animal2= new Animal();
		
		jellyfish.display();
		animal.display();	//since the reference object is of type Animal display method of animal is used while compiling. But runtime it access Jellyfish method
		animal2.display();
		
		System.out.println("Calling callDisplay()");
		jellyfish.callDisplay();
		animal.callDisplay();
		animal2.callDisplay();
		
		System.out.println("Display Parent variable");
		System.out.println(jellyfish.length);
		System.out.println(animal.length);
		System.out.println(animal2.length);
		
		
	}

//parent variable is accessed when called from parent reference object 
//public class VariableHiding{
//
//	public static void main(String[] args) {
//			Jellyfish jellyfish = new Jellyfish();
//			Animal animal = new Jellyfish();
//			Animal animal2= new Animal();
//			
//			System.out.println(jellyfish.length);
//			jellyfish.display();
//			jellyfish.callDisplay(jellyfish);
//			
//			System.out.println(animal.length);
//			animal.display();
//			animal.callDisplay(animal);
//						
//			System.out.println(animal2.length);
//			animal2.display();
//			animal2.callDisplay(animal2);
//		}	
	
}
