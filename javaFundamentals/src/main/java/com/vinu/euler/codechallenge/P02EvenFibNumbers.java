/**
 * 
 */
package com.vinu.euler.codechallenge;


/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */

/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.*/
public class P02EvenFibNumbers {
	public static void main(String[] args) {
		int i=1,sum=0;
		while(true) {
			long num=fibNumber(i);
			System.out.print(num+" ");
			if ((num  <= 4000000) && (num % 2 == 0)) {
				sum+= num;
			} else if (num > 4000000){
				break;
			}
			i++;
			
		}
		System.out.println("Sum :"+sum);
	}
	
	public static long fibNumber(int n) {
		if (n == 1) {
			return 1l;
		} else if (n == 2) {
			return 2l;
		}else {
			return fibNumber(n-2)+fibNumber(n-1);
		}
		
	}
}