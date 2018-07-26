package com.vinu.spring;

public class Triangle {
	
	private String type;
	private int height;	
	
	public Triangle(int height) {
		super();
		this.height = height;
	}


	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public Triangle(String type) {
		super();
		this.type = type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getHeight() {
		return height;
	}


	public void draw() {
		System.out.println(this.getType()+" triangle Drawn of height "+this.getHeight());
	}
}
