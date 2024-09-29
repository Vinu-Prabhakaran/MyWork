/**
 * 
 */
package com.vinu.ocpchap3;

import java.util.*;

/**
 * @author Vinu Prabhakaran
 *         on Nov 6, 2021
 *
 */
public class ListIteration {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Vinu","Ramya","Ammu","Kunji");
		
		for (Iterator<String> i=names.iterator();i.hasNext();) {
			System.out.println(i.next());
		}
		
		Deque<Integer> stack=new LinkedList<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Stack "+stack);

	}
}
