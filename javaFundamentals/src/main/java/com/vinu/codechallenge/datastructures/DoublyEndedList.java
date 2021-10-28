/**
 * 
 */
package com.vinu.codechallenge.datastructures;

/**
 * @author Vinu Prabhakaran
 *         on Sep 15, 2021
 *
 */
public class DoublyEndedList {
	private Node head;
	private Node tail;
	
	@Override
	public String toString() {
		Node currNode=head;
		StringBuilder listPrint=new StringBuilder();
		while (currNode != null) {
			listPrint.append(currNode.toString());
			currNode=currNode.getNextNode();
		}
		return "DoublyEndedList ["+listPrint+ "]";
	}

	public void addNodeAtHead(int data) {
		Node newNode=new Node(data);
		newNode.setNextNode(head);
		head=newNode;
		if (tail == null) {
			tail=head;
		}
	}
	
	public void addNodeAtTail(int data) {
		Node newNode=new Node(data);
		if (tail!= null) {
			tail.setNextNode(newNode);
		}
		tail=newNode;
		if (head == null) {
			head=tail;
		}
	}
	
	public static void main(String[] args) {
		DoublyEndedList list=new DoublyEndedList();
		
		list.addNodeAtTail(5);
		list.addNodeAtHead(10);
		list.addNodeAtHead(20);
		list.addNodeAtHead(30);
		list.addNodeAtTail(40);
		list.addNodeAtTail(50);
		
		System.out.println(list);

	}
}
