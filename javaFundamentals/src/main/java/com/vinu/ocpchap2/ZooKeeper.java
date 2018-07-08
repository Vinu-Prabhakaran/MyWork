package com.vinu.ocpchap2;


//Example of Factory design principle

abstract class Food {
	private int quantity;
	public Food(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public abstract void consumed();
}

class Hay extends Food {
	public Hay(int quantity) {
		super(quantity);
	}
	public void consumed() {
		System.out.println("Hay eaten: "+getQuantity());
	}
}
	
class Pellets extends Food {
	public Pellets(int quantity) {
		super(quantity);
	}
	public void consumed() {
		System.out.println("Pellets eaten: "+getQuantity());
	}
}

class Fish extends Food {
	public Fish(int quantity) {
		super(quantity);
	}
	public void consumed() {
		System.out.println("Fish eaten: "+getQuantity());
	}
}

class FoodFactory {

	public static Food getFood(String animal) {
		
		switch(animal) {
			
		case "zebra": return new Hay(100);
		case "rabbit": return new Pellets(5);
		case "goat": return new Pellets(30);
		case "angelFish": return new Fish(10);
		default: throw new IllegalArgumentException("Unhandled Animal :"+animal);
		
		}

	}

}

public class ZooKeeper{
	
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("angelFish");
		food.consumed();
	}
}
