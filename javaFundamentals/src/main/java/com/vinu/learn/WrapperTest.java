package com.vinu.learn;

public class WrapperTest {

	
	public static void main(String[] args) {
		
		Integer inumber=new Integer(12);
		Float fnum=new Float(52.3F);
		System.out.println(inumber);
		
		System.out.println(inumber.floatValue());
		
		String str="1011";
		System.out.println(Integer.parseInt(str,2)); // radix 2 indicates binary
		
		System.out.println(fnum.intValue());
		
		System.out.println(inumber.toString());
		
		
	}
}
