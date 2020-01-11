/**
 * 
 */
package com.vinu.codechallenge;

import java.util.Scanner;

/**
 * @author Vinu Prabhakaran
 *         on Jan 10, 2020
 *
 */
public class Ch03StringRev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String str=sc.next();
		sc.close();
		System.out.println("Reverse is "+new StringBuilder(str).reverse());
		
		char[] strCharArr = str.toCharArray();
		int len=str.length();
		char temp;
		for(int i=0;i<len/2;i++) {
			
			temp=strCharArr[i];
			strCharArr[i]=strCharArr[len - 1 - i];
			strCharArr[len -1 - i] = temp;
		}
		
		System.out.println("Reverse using charArray is "+ String.valueOf(strCharArr));
		
	}

}
