package com.vinu.ocachap1;

class Egret{
	
	String color;
	public Egret() {
		this("white");
	}
	
	public Egret(String color) {
		color=color;	// assignment is to same variable and not to attribute
	}
}

public class ConstructorCall1 {

	public static void main(String[] args) {
		
		Egret e = new Egret();
		System.out.println("Color :"+e.color);
	}

}
