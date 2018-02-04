package com.tcs.myApp.model;

public class Cell 
{
	private String make; //Nokia, Samsung, Apple
	private double price;
	public Cell(String make, double price) {
	    this.make = make;
	    this.price = price;
	}
	public String getMake() {
	    return make;
	}
	public void setMake(String make) {
	    this.make = make;
	}
	public double getPrice() {
	    return price;
	}
	public void setPrice(double price) {
	    this.price = price;
	}
}

