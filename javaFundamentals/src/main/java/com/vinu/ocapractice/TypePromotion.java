package com.vinu.ocapractice;

public class TypePromotion {

	public static void main(String[] args) {
		//long and double will be automatically promoted to int
		byte x = 5;
		byte y = 10;
		int z1 = x + y;  	//x + y automatically produced int result
		long z2 = x + y; 	// the int result can be automatically promoted to long
		double z3 = x + y;	// same with double 
		float z4 = x + y;	// and float
		
		System.out.println(z1+" "+z2+" "+z3+" "+z4);
		float f1=10.23f,f2=11.23f;
		double d1=13.23;
		z1=(int) (f1+f2);
		
//		Smaller data types, namely byte, short, and char, are first promoted to int any time
//		they’re used with a Java binary arithmetic operator, even if neither of the operands is
//		int.
		
		char c = '1';
		System.out.println(c+1-1);  // char is converted to int
		System.out.println((int)c);
	}

}
