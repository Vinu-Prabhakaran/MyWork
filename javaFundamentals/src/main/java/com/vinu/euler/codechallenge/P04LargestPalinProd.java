/**
 * 
 */
package com.vinu.euler.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */
/*A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
public class P04LargestPalinProd {
	public static void main(String[] args) {
		//System.out.println(checkPalindrome(9009));
		
		long max=0;
		for (int i=100;i<1000;i++) {
			for(int j=i;j<1000;j++) {
				long prod=i*j;
				if (checkPalindrome(prod) && prod> max) {
					max=prod;
				}
			}
		}
		
		System.out.println("Largest Palindrome product is "+max);
	}
	
	public static boolean checkPalindrome(long num) {
		
		String numS=String.valueOf(num);
		int len = numS.length();
		boolean check=false;
		for (int i=0;i<=len/2-1;i++) {
			if (numS.charAt(i) == numS.charAt(len-1-i)) {
				check=true;
			}else {
				check=false;
				break;
			}
		}
		return check;
	}
	
	
}
