package com.vinu.ocpchap3;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		/*
		boolean add(E e) Adds an element to the back of the queue and returns true or throws an exception
		E element() Returns next element or throws an exception if empty queue
		boolean offer(E e) Adds an element to the back of the queue	and returns whether successful
		E remove() Removes and returns next element or throws an exception if empty queue
		void push(E e) Adds an element to the front of the queue
		E poll() Removes and returns next element or returns null if empty queue
		E peek() Returns next element or returns null if empty queue
		E pop() Removes and returns next element or	throws an exception if empty queue
		*/

		Queue<Integer> q1 = new ArrayDeque<>();	//double ended queue
		System.out.println(q1.add(10));
		System.out.println(q1.add(20));
		System.out.println(q1);
		System.out.println("offer :"+q1.offer(30));
		System.out.println("offer :"+q1.offer(40));
		System.out.println(q1);
		System.out.println("size :"+q1.size());
		System.out.println("Remove "+q1.remove());	//returns exception if empty
		System.out.println("After remove() :"+q1);
		System.out.println("Poll :"+q1.poll());		//returns null on empty queue
		System.out.println("After poll() :"+q1);
		System.out.println("Peek :"+q1.peek());		//returns null on empty queue
		System.out.println("After peek() :"+q1);
		
		ArrayDeque<Integer> q2 = new ArrayDeque<>();
		System.out.println(q2.add(1));
		System.out.println(q2.add(2));
		System.out.println(q2.offer(3));
		System.out.println(q2);
		q2.push(4);
		System.out.println("After push(4) "+q2);
		q2.push(5);
		System.out.println("After push(5) "+q2);
		System.out.println("Poll :"+q2.poll());
		System.out.println("After poll() :"+q2);
		System.out.println("Peek :"+q2.peek());
		System.out.println("After peek() :"+q2);
		System.out.println("Pop "+q2.pop());
		System.out.println("After pop() :"+q2);		//returns exception on empty queue/stack
		
		
		
	}

}
