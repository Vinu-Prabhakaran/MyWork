/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */
/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/
public class P03LargestPrimeFactor {
	public static void main(String[] args) {
		
		System.out.println("Largest Prime Factor :"+findLargestPrimeFactor(600851475143L));
		//System.out.println(checkPrime(600851475143L));
	}
	
	public static boolean checkPrime(long num) {
		
		for (int i=2;i<Math.sqrt(num);i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static long findLargestPrimeFactor(long num) {
		
		long max=0;
		for (long i=2;i <Math.sqrt(num);i++) {
			if (num%i==0 && checkPrime(i) && i>max) {
				max=i;
				}
				//return i;
			}
		return max;
	}
}
