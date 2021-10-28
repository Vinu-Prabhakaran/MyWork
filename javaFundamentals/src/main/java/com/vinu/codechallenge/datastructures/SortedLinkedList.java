/**
 * 
 */
package com.vinu.codechallenge.datastructures;

/**
 * @author Vinu Prabhakaran
 *         on Sep 15, 2021
 *
 */
public class SortedLinkedList {
	private Node head;
	
	public void addNodeAtHead(int data) { // O(1)
		Node newNode=new Node(data);
		Node currNode=head;
		if (head == null) {
			head=newNode;
			return;
		}
		while(currNode.getNextNode() != null && currNode.getNextNode().getData() <= data) {
			currNode=currNode.getNextNode();
		}
		
		if (currNode == head && currNode.getData() > data) {
			newNode.setNextNode(head);
			head=newNode;
			return;
		}
		newNode.setNextNode(currNode.getNextNode());
		currNode.setNextNode(newNode);
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

	public static void main(String[] args) {
		
		SortedLinkedList list=new SortedLinkedList();
		
		list.addNodeAtHead(5);
		list.addNodeAtHead(3);
		list.addNodeAtHead(2);
		list.addNodeAtHead(6);
		
		System.out.println(list);
		
	}
}
