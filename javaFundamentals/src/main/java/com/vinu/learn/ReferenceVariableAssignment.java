package com.vinu.learn;


class Animal{
	String name;
	
}

class Cat extends Animal{
	String breed;
}

public class ReferenceVariableAssignment {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat c = new Cat();
		a = c ;			//	Child can be assigned to parent object
		c = (Cat) a; 	//	Parent when assigned to child needs type casting
		
	}

}
