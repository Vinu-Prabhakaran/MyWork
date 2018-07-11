package com.tcs.myApp.model;

public abstract class Vehicle 
{
	private String color;
	
	
	public String getColor() {
		return color;
	}

	public Vehicle(String color) {
		super();
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public abstract void move();
	
	public void display()
	{
		System.out.println("Display from parent");
	}
	
}
