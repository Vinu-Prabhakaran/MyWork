/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/
public class P10SumOfPrimes {
	public static void main(String[] args) {
		
		long sum=0;
		
		for (long i=2;i<2000000;i++) {
			if (checkPrime(i)) {
				sum+=i;
			}
		}
		
		System.out.println("Answer is "+sum);
	}
	
	public static boolean checkPrime(long num) {
		
		
		for (int i=2;i <= num/2;i++) {
			if (num % i == 0) {
				return false;
			}
		}
		//System.out.println(num);
		return true;
	}
}
