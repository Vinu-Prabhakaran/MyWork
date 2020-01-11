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
public class Ch04IntReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Ameya...Enter the number to reverse");
		int num=sc.nextInt();
		sc.close();
		System.out.println("Reverse is "+reverseInt(num));

	}
	
	public static long reverseInt(int num) {
		
		long revNum = 0l;
		
		while (num != 0) {
			revNum = (revNum *10) + num % 10;
			num /= 10;
		}
		
		return revNum;
			
	}
}
