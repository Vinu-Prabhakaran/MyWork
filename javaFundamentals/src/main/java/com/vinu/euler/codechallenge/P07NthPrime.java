/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
public class P07NthPrime {
	
	public static void main(String[] args) {
		System.out.println("Answer :"+giveNthPrime(10001));
	}
	
	public static int giveNthPrime(int n) {
		int i=0,num=2;

		while(true) {
			if (checkPrime(num)) {
				i++;
				if(i==n)
					break;
			}
			num++;
		}
		return num;
	}
	
	public static boolean checkPrime(long num) {
		
		
		for (int i=2;i <= num/2;i++) {
			if (num % i == 0) {
				return false;
			}
		}
		System.out.println(num);
		return true;
	}
}
