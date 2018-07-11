package com.vinu.ocpchap1;

 class Outer1{
	
	private int length=10;
	public void getArea() {
		
		final int breadth=20;
		
		class Inner{
			
			void mutliply() {
				System.out.println("Area is "+(length*breadth));
			}
		}
		Inner in = new Inner();
		in.mutliply();
	}
}


public class LocalInner {

	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		out.getArea();
		
	}

}
