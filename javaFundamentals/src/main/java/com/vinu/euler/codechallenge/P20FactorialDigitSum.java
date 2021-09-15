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
/*n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/
public class P20FactorialDigitSum {
	public static void main(String[] args) {
		System.out.println(getSumOfDigits(getFactorial(100)));
	}
	
	public static BigDecimal getFactorial(int num) {
		
		BigDecimal factorial=new BigDecimal(1);
		for (int i=1;i<=num;i++) {
			factorial=factorial.multiply(new BigDecimal(i));
		}
		return factorial;
	}
	
	public static int getSumOfDigits(BigDecimal num) {
		
		int sum=0;
		String numString=num.toString();
		for(int i=0;i<numString.length();i++) {
			sum+=(Integer.valueOf(String.valueOf(numString.charAt(i))));
		}
		return sum;
	}
}
