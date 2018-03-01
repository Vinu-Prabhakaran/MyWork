package com.vinu.ocachap5;

class Reptile {
	public String getName() {
	return "Reptile";
	}
}
class Alligator extends Reptile {
	public String getName() {
	return "Alligator";
	}
}
class Crocodile extends Reptile {
	public String getName() {
	return "Crocodile";
	}
}

public class PolymorphicParameters {
	
	//feed method can is defined with superclass type argument. So it can take any of the subclass type without explicit casting 
	// and behave differently depending on the type of argument
	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile "+reptile.getName());
		}
	public static void main(String[] args) {
		
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());

	}

}
