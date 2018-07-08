package com.vinu.ocpchap1;

class Outer{
	
	private String greeting="Hello there";
	
	class Inner{
		int repeat = 3;
		
		void innerGreeting() {
			
			for(int i=0;i<repeat;i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		Inner in = new Inner();
		in.innerGreeting();
		
	}
}


public class MemberInnerClass {
	
	public static void main(String[] args) {
		
		Outer out=new Outer();
		out.callInner();
	}
}
