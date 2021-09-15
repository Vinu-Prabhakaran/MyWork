/**
 * 
 */
package com.vinu.euler.codechallenge;

import java.math.BigDecimal;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */
/*2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?*/
public class P16PowerDigitSum {
	
	public static void main(String[] args) {
		String num = new BigDecimal(2).pow(1000).toString();
		System.out.println(num);
		System.out.println(num.length());
		int sum=0;
		for (int i=0;i<num.length();i++) {
			sum+=Integer.valueOf(String.valueOf(num.charAt(i)));
		}
		
		System.out.println("Answer is "+sum);
	}
}
