/**
 * 
 */
package com.vinu.codechallenge.datastructures;

/**
 * @author Vinu Prabhakaran
 *         on Sep 19, 2021
 *
 */
public class Stack {
	private int arr[];
	private int top;
	private int capacity;
	
	public Stack(int capacity) {
		this.capacity=capacity;
		this.arr=new int[capacity];
	}
	
	public boolean isFull() {
		return top == capacity-1;
	}
	
	public boolean isEmpty() {
		return top ==-1;
	}
	public void push(int item) {
		System.out.println("Pushing "+item);
		if(isFull()) {
			throw new RuntimeException("Stack is full");
		}
		arr[++top]=item;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[top--];
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		
		Stack stack=new Stack(5);
		
		
		stack.push(10);
		System.out.println(stack.pop());
		System.out.println(stack.top);
		stack.push(20);
		System.out.println(stack.top);
		stack.push(30);
		System.out.println(stack.top);
		stack.push(40);
		System.out.println(stack.top);
		stack.push(50);
		System.out.println(stack.top);
		stack.push(60);
		System.out.println(stack.top);
		stack.push(70);
	}
}
