/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
public class P05SmallestMul {
	public static void main(String[] args) {
		//System.out.println(divisibleBy1to10(2520));
		int num=1;
		while (true) {
			if (divisibleBy1to20(num)) {
				break;
			}
			num++;
		}
		System.out.println("Smallest Multiple is "+num);
	}
	
	public static boolean divisibleBy1to20(int num) {
		
		boolean check=false;
		for (int i=2;i<=20;i++) {
			if(num%i == 0) {
				check =true;
			}else {
				check=false;
				break;
			}
		}
		return check;
	}
}
