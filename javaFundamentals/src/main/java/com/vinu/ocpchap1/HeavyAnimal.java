package com.vinu.ocpchap1;

public class HeavyAnimal {
	public static void main(String... args) {
		
		HeavyAnimal hippo = new Hippo();
		System.out.println(hippo instanceof Hippo);
		System.out.println(hippo instanceof HeavyAnimal);
		System.out.println(hippo instanceof Elephant);
		
				
	}
}

class Hippo extends HeavyAnimal{}
class Elephant extends HeavyAnimal{}