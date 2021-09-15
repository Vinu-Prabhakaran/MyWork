/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */

/*The sum of the squares of the first ten natural numbers is,
385
The square of the sum of the first ten natural numbers is,
3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
3025-385 = 2640
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
public class P06SumSquareDiff {
	public static void main(String[] args) {
		System.out.println(sumOfSquares(100));
		System.out.println(squareofSum(100));
		System.out.println("Diff :"+(squareofSum(100) - sumOfSquares(100)));
	}
	
	public static long sumOfSquares(int count) {
		long sumOfSq=0;
		for (int i=1;i<=count;i++) {
			sumOfSq+=(i*i);
		}
		
		return sumOfSq;
	}
	public static long squareofSum(int count) {
		long sum=0;
		for (int i=1;i<=count;i++) {
			sum+=(i);
		}
		
		return sum*sum;
	}
}
