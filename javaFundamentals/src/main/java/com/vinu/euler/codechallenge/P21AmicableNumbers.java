/**
 * 
 */
package com.vinu.euler.codechallenge;

import java.util.*;
import java.util.Map.Entry;
/**
 * @author Vinu Prabhakaran
 *         on Aug 24, 2021
 *
 */
/*Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.*/
public class P21AmicableNumbers {
	public static void main(String[] args) {
		//System.out.println(sumOfProperDivisors(220));
		Map<Integer,Integer> numMap=new HashMap<>();
		
		for (int i=1;i<10000;i++) {
			numMap.put(i, sumOfProperDivisors(i));
		}
		//System.out.println(numMap);
		Map<Integer,Integer> amicablePairs=new HashMap<>();
		numMap.forEach((k,v) ->{
			
			if (!k.equals(v) && k.equals(numMap.get(v))){
				amicablePairs.put(k, v);
			}
		});
		
		System.out.println("Amicable Pairs :"+amicablePairs);
		System.out.println(amicablePairs.keySet().stream().reduce((k1,k2)-> k1+k2));

	}
	
	private static int sumOfProperDivisors(int num) {
		int sum=0;
		for (int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum+=i;
			}
		}
		return sum;
	}
}
