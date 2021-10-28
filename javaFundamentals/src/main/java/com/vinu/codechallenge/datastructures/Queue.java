/**
 * 
 */
package com.vinu.codechallenge.datastructures;

import javax.management.RuntimeErrorException;

/**
 * @author Vinu Prabhakaran
 *         on Sep 19, 2021
 *
 */
public class Queue {
	private int queue[];
	private int front;
	private int rear;
	private int capacity;
	
	public Queue(int capacity) {
		this.capacity=capacity;
		this.queue=new int[capacity];
		front=rear=-1;
	}
	
	public boolean isFull() {
		return rear == capacity-1;
	}
	
	public boolean isEmpty() {
		return rear ==-1;
	}
	
	public void printQueue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue if Empty");
		}
		for (int i=0;i<=rear;i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		System.out.println();
	}
	public void enqueue(int item) { //Time Complexity of Enqueue : O(1) 
		if (isFull()) {
			throw new RuntimeException("Queue if full");
		}
		
		if(isEmpty()) {
			front++;
			rear++;
			queue[rear]= item;
		}else {
			queue[++rear]=item;
		}
		
		printQueue();
	}
	public int dequeue() { //		Time Complexity of Dequeue : O(n)

		int item;
		if (isEmpty()) {
			throw new RuntimeException("Queue if Empty");
		}
		
		item=queue[front];
		for(int i=0;i<rear;i++) {
			queue[i]=queue[i+1];
		}
		rear--;
		printQueue();
		return item;
	}
	
	public static void main(String[] args) {
		
		Queue queue=new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		

	}
}
