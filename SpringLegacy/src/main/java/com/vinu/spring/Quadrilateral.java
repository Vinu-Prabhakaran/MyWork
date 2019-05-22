package com.vinu.spring;

public class Quadrilateral implements Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	
	public void draw() {
		System.out.println("Quadrilateral drawn with corners at ("+
	    this.getPointA().getX()+","+this.getPointA().getY()+"),"+
	"("+this.getPointB().getX()+","+this.getPointB().getY()+"),"+
	"("+this.getPointC().getX()+","+this.getPointC().getY()+"),"+
	"("+this.getPointD().getX()+","+this.getPointD().getY()+")");
	}
}
