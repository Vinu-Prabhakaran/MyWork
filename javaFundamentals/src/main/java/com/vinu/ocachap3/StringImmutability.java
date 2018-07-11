package com.vinu.ocachap3;

public class StringImmutability {

	public static void main(String[] args) {
		
		String s1 = "1";
		String s2 = s1.concat("2");
		System.out.println(s2.concat("3"));
		System.out.println(s2);

	}

}
