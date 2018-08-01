package com.vinu.spring;

import java.util.List;

public class Pentagon {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	void draw() {
		System.out.println("Pentagon drawn with corners at follwing points");
		for(Point p : this.getPoints()) {
			System.out.println("Point("+p.getX()+","+p.getY()+")");
		}
				
	}
	
}
