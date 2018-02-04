package com.vinu.learn;

class Shape
{
	float fLength;
	float fBreadth;
	
	Shape(float length,float breadth)
	{
		System.out.println("Rectangle defined with length "+length+" and breadth "+breadth);
		fLength=length;
		fBreadth=breadth;
	}
	
	Shape(float radius)
	{
		System.out.println("Circle defined with radius "+radius);
		fLength=radius;
		fBreadth=0;
	}
	
	double getArea()
	{
		return ((fBreadth == 0)?(3.14*fLength*fLength):(fLength*fBreadth));
	}

}


public class TestMethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape(3);
		System.out.println("Area is "+s1.getArea());
		Shape s2 = new Shape(3,5);
		System.out.println("Area is "+s2.getArea());
	}

}
