package com.tcs.myApp.model;

class ErrorExt extends Error{}

public  class TestSomething {
	public static void main(String...args) {
		
		int[] num1= {1,2,3};
		int[] num2= {4,5,6,7,8};
		num1=num2;
		for(int i: num1) {
			System.out.println(i+":");
		}
		
		System.out.println(" "+(1)+(2));
	}
}
