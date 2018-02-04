package com.tcs.myApp.model;

public class Car extends Vehicle 
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String color, double price) {
		super(color);
		this.price = price;
	}
	
	
	public void move()
	{
		System.out.println("Move method in Car class");
	}
	
	public void m1()
	{
		System.out.println("In method m1 - no args");
	}
	
	public void m1(String text)
	{
		System.out.println("In method m1 - with arg"+text);
	}
	
	public void m1(int num)
	{
		System.out.println("In method m1 - with arg"+num);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Display in child class");
	}
}
