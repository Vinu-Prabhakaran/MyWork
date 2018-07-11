package com.vinu.ocachap3;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Animalsanimals";
		System.out.println(s1.length());	//14
		System.out.println(s1.charAt(4));	//a
		System.out.println(s1.indexOf('a'));//4 case sensitive check
		System.out.println(s1.indexOf('i',4));	// just starts search at index 4 but resultant index position will from beginning
		System.out.println(s1.substring(4, 13)); // last index is not printed so end should be length of string as given below.
		System.out.println(s1.substring(4,s1.length()));
		System.out.println(s1.substring(4));
		
		System.out.println(s1.startsWith("a"));
		
		System.out.println("\t abc \t \n cde");
		System.out.println("\t abc \t \n cde".trim());
		System.out.println(" a b c ".trim());  	//leaves the space withing the String asis
		
		System.out.println("animals".replace('a','A'));	//replaces only the first occurrence
		
		String start = "AniMaL ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal"
		String result = lowercase.replace('a', 'A'); // "Animal"
		System.out.println(result);
		
		System.out.println(start.trim().toLowerCase().replace("a","A"));
		System.out.println(start.trim().toLowerCase().replaceFirst("a","A"));  // this case only first 'a' is replaced with 'A'.
		
		//Important
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');	//here b points to a new object A23
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
