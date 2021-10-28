/**
 * 
 */
package com.vinu.codechallenge.datastructures;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Sep 15, 2021
 *
 */
@Getter
@Setter
class DoublyLinkedNode {
	
	private int data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode prevNode;
	
	public DoublyLinkedNode(int data) {
		this.data=data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
public class DoublyLinkedList {
	private DoublyLinkedNode head;
	
	public void addNodeAtHead(int data) { // O(1)
		DoublyLinkedNode newNode=new DoublyLinkedNode(data);
		if (head == null) {
			head=newNode;
			return;
		}
		head.setPrevNode(newNode);
		newNode.setNextNode(head);
		head=newNode;
	}
		
	@Override
	public String toString() {
		DoublyLinkedNode currNode=head;
		StringBuilder listPrint=new StringBuilder();
		while (currNode != null) {
			listPrint.append(currNode.toString());
			currNode=currNode.getNextNode();
		}
		return "LinkedList ["+listPrint+ "]";
	}

	public static void main(String[] args) {
		
		DoublyLinkedList list=new DoublyLinkedList();
		
		list.addNodeAtHead(5);
		list.addNodeAtHead(3);
		list.addNodeAtHead(2);
		list.addNodeAtHead(6);
		
		System.out.println(list);
		
	}
}
