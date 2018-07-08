package com.vinu.learn;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		int b=259;
		double d = 375.66;
		
		a=(byte)b;
		System.out.println("Result of type casting from int to byte is "+a); //a can store only a maximum of 255
		a=(byte)d;
		System.out.println("Result of type casting from double to byte is "+a);
		b=(int)d;
		System.out.println("Result of type casting from double to int is "+b);
	}

}
