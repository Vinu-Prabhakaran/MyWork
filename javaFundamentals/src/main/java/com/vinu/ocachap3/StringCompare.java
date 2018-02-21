package com.vinu.ocachap3;

public class StringCompare {

	public static void main(String[] args) {

		String s1=new String("Vinu");
		String s2=new String("Vinu");
		String s3="Vinu";
		String s4="Vinu";
		
		System.out.println(s1 == s3);		//false
		System.out.println(s4 == s2);		//false
		System.out.println(s1 == s2);		//false
		System.out.println(s3 == s4);		//true
		System.out.println(s1.equals(s2));	//true
		
		System.out.println('1'+'2');			// chars '1' and '2' will be converted to int and added
		System.out.println((int)'1'+(int)'2');	// to explicitly verify the above case.
		
//		1. If both operands are numeric, + means numeric addition.
//		2. If either operand is a String, + means concatenation.
//		3. The expression is evaluated left to right.
		
		System.out.println(2+"1"+3);				// 2 and 3 are converted to String
		System.out.println(2+3+"1");				// 2 and 3 will be added and then concatenated with 1
		System.out.println("1"+2+3+"1"+2+3);
		System.out.println(2+3+"1"+2+3);
		
		String s5=s4.trim();
		System.out.println(s5==s3);
	}

}
