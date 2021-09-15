/**
 * 
 */
package com.vinu.euler.codechallenge;

import java.math.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 24, 2021
 *
 */
/*The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?*/
public class P25FibNumber1000Digit {
	
	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(fibNumber(i).compareTo(BigInteger.TEN.pow(100)) >= 0) {
				break;
			}
			i++;
		}
		System.out.println("Answer is "+i);
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(fibNumber(3));
	}
	
	public static BigInteger fibNumber(int n) {
		if (n == 1) {
			return BigInteger.ONE;
		} else if (n == 2) {
			return BigInteger.ONE;
		}else {
			return fibNumber(n-2).add(fibNumber(n-1));
		}
	}
}
