/**
 * 
 */
package com.vinu.euler.codechallenge;

import java.util.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */
/*The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.*/
public class P14LongestCollatzSequence {
	public static void main(String[] args) {
		Map<Integer,Integer> nMap=new HashMap<>();
		long startTime=System.currentTimeMillis();
		//System.out.println(generateCollatz(13));
		for (int i=999999;i>0;i--) {
			nMap.put(i, generateCollatz(i));
		}
		long ms=System.currentTimeMillis() - startTime;
		System.out.println("Time taken :"+ms/(1000*60)+" mins"+(ms%(1000*60))/1000 +" seconds");
		Integer key = nMap.entrySet().stream().max((e1,e2) -> (e1.getValue() - e2.getValue())).get().getKey();
		System.out.println("Answer :"+key+" has a series length "+nMap.get(key));
		//generateCollatz(key);
		
	}
	
	public static int generateCollatz(int num) {
		int count=0;
		long localNum=num;
		while(true) {
			//System.out.print(localNum +"->");
			count++;
			if(localNum ==1 ) {
				break;
			}
			localNum = localNum%2==0 ? localNum/2: (3*localNum +1);
		}
		//System.out.println();
		return count;

	}
}
