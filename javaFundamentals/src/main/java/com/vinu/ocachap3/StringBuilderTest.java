package com.vinu.ocachap3;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("start");
		sb1.append("+middle"); 							// sb = "start+middle" sb is mutable so it changes when appeneded
		StringBuilder same = sb1.append("+end"); 		// "start+middle+end"	here again. sb and same refer to same object
		System.out.println("same ="+same+"\nsb1="+sb1);
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a.reverse();
		System.out.println("Reversed - "+a);
		
		//Important
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));	//sb doesn't change here since substring only returns a string
		int len = sb.length();		//because of above reason the length is still 7
		char ch = sb.charAt(6);		// last character
		System.out.println(sub + " " + len + " " + ch);
		
	}

}
