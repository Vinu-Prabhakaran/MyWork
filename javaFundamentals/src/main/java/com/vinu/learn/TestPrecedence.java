package com.vinu.learn;

public class TestPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=0,x=10;
		b=++a+a++;
		System.out.println("Value of b is "+b);
		System.out.println("Value of a is "+a);
		x=x++ + 1 - 2 * 3 + 4 << 2 / 2;
		System.out.println("Value of x is "+x);
		x=++x + 1 - 2 * 3 + 4 << 2 / 2;
		System.out.println("Value of x is "+x);
	}

}
