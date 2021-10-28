/**
 * 
 */
package com.vinu.codechallenge.datastructures;

import java.io.PrintWriter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Sep 15, 2021
 *
 */
@Getter
@Setter
class Node {
	
	private int data;
	private Node nextNode;
	
	public Node(int data) {
		this.data=data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
public class LinkedListImplementation {
	
	private Node head;
	
	public void addNodeAtHead(int data) { // O(1)
		Node newNode=new Node(data);
		newNode.setNextNode(head);
		head=newNode;
	}
	
	public void deleteHead() {  // O(1)
		head=head.getNextNode();
		
	}
		
	public void searchNode(int num) {  // O(n)
		int pos=0;
		boolean found=false;
		Node currNode=head;
		while (currNode != null) {
			pos++;
			if (currNode.getData() == num) {
				found=true;
				break;
			}
			currNode=currNode.getNextNode();
		}
		if (found)
			System.out.println(num +" is found at position "+pos);
		else
			System.out.println(num +" is not found ");
		
	}
		
	@Override
	public String toString() {
		Node currNode=head;
		StringBuilder listPrint=new StringBuilder();
		while (currNode != null) {
			listPrint.append(currNode.toString());
			currNode=currNode.getNextNode();
		}
		return "LinkedList ["+listPrint+ "]";
	}

	public void printLength() {
		int length=0;
		Node currNode=head;
		while (currNode != null) {
			length++;
			currNode=currNode.getNextNode();
		}
		System.out.println("Length is "+length);
	}
	
	public static void main(String[] args) {
		
		LinkedListImplementation list=new LinkedListImplementation();
		
		list.addNodeAtHead(1);
		list.addNodeAtHead(2);
		list.addNodeAtHead(3);
		list.addNodeAtHead(4);
		
		System.out.println(list);
		list.printLength();
		System.out.println("Deleting head");
		list.deleteHead();
		System.out.println("After deletion");
		System.out.println(list);
		list.searchNode(1);
	}
}
