package com.vinu.learn;

public class StringTest {
	
	
	public static void main(String[] args) {
		String ts = "Calculator";
		char[] carr;
		double i=564.008;
		System.out.println("Length is "+ts.length());
		System.out.println(ts.substring(4, 8));
		System.out.println(ts.substring(5));
		
		System.out.println(String.valueOf(i));
		System.out.println(ts.toUpperCase());
		
		System.out.println(ts.endsWith("or"));
		carr=ts.toCharArray();
		System.out.println(ts.toCharArray()[0]);
		System.out.println(carr.length);
		
	}
	
}
