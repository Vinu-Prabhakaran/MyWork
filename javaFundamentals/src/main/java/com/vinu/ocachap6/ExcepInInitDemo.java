package com.vinu.ocachap6;


//Execute from command line to see the exception details
public class ExcepInInitDemo {
	
	static int[] num = new int[3];
	static int count;
	static {
		count = num[-1];
	}

	public static void main(String[] args) {
		
		System.out.println(count);
		
	}

}
