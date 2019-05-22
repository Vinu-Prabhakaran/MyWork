/**
 * 
 */
package com.vinu.spring;

/**
 * @author Vinu Prabhakaran
 *         on May 21, 2019
 *
 */
public class Circle implements Shape {
	
	private Point pointA;
	
	public void draw() {
		System.out.println("Circle drawn with center at ("+
	    this.getPointA().getX()+","+this.getPointA().getY()+")");
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

}
