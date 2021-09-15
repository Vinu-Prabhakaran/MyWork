/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */
/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
public class P09SpecialPythagoreanTriplet {
	public static void main(String[] args) {
		
		int i=0,j=0,k=0;
		//System.out.println(isPythagoreanTriplet(3,4,5));
		OUTER_LOOP:for(i=1;i<=997;i++) {
			for (j=2;j<=998;j++) {
				for (k=3;k<=999;k++) {
					if (isPythagoreanTriplet(i, j, k) && (i+j+k == 1000)) {
						System.out.println("Breaking at "+i+","+j+","+k);
						break OUTER_LOOP;
					}
				}
			}
		}
		
		System.out.println("Answer is "+(i*j*k));
		
	}
	
	public static boolean isPythagoreanTriplet(int a,int b,int c) {
		
		return (c*c == (a*a)+(b*b));
	}
}
