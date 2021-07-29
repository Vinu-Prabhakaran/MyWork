/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */
/*When two threads try to modify the same non-concurrent collection, the JVM may
throw a ConcurrentModificationException at runtime. This snippet will throw a ConcurrentModificationException at runtime, since the
iterator keyset() is not properly updated after the first element is removed. Changing the
first line to use a ConcurrentHashMap will prevent the code from throwing an exception at
runtime:*/
public class UsingConcurrentCollection {
	
	public static void main(String[] args) {
		Map<String, Object> foodData = new ConcurrentHashMap<>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		System.out.println("Original Map :"+foodData);
		for(String key: foodData.keySet())
			foodData.remove(key);
		System.out.println("Final Map :"+foodData);
		
		Map<String,Integer> map = new ConcurrentHashMap<>();
		map.put("zebra", 52);
		map.put("elephant", 10);
		System.out.println(map.get("elephant"));
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(31);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		Deque<Integer> deque = new ConcurrentLinkedDeque<>();
		deque.offer(10);
		deque.push(4);
		System.out.println(deque.peek());
		System.out.println(deque.pop());
	}
}
