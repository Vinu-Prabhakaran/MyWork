/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */
class Node{
	
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	@Override
	public String toString() {
		return "Node [key=" + key + ", name=" + name + "]";
	}
	
	public Node(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}	
	
}

public class BinaryTree {
	
	private Node root;
	
	public void addNode(int key,String name) {
		Node newNode = new Node(key,name);
		
		if (root == null) {
			root=newNode;
			return;
		} 
		Node currNode=root;
		while(true) {
			if(key < currNode.key) {
				if(currNode.leftChild == null) {
					currNode.leftChild=newNode;
					System.out.println("Node with key "+key+" added");
					return;
				}else {
					currNode = currNode.leftChild;
				}
				
			}else if (key > currNode.key) {
				if(currNode.rightChild == null) {
					currNode.rightChild=newNode;
					System.out.println("Node with key "+key+" added");
					return;
				}else {
					currNode = currNode.rightChild;
				}
			} else {
				System.out.println("Node with key "+key+" already exists");
				return;
			}
		}
	}
	//Ascending order - left,root,right
	public void inorderTraversal(Node focusNode) {
		
		if (focusNode != null) {
			inorderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inorderTraversal(focusNode.rightChild);
		}
	}
	//preOrder - start from root , left,right
	public void preorderTraversal(Node focusNode) {
		
		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraversal(focusNode.leftChild);
			preorderTraversal(focusNode.rightChild);
		}
	}
	//postOrder - left,right,root
	public void postorderTraversal(Node focusNode) {
		
		if (focusNode != null) {
			postorderTraversal(focusNode.leftChild);
			postorderTraversal(focusNode.rightChild);
			System.out.println(focusNode);

		}
	}
	public int treeDepth(Node focusNode) {
		if (focusNode == null) {
			return -1;
		}
		int left,right;
		left=treeDepth(focusNode.leftChild);
		right=treeDepth(focusNode.rightChild);
		//System.out.println(left +" "+right);
		if (left > right) {
			return left+1;
		}else {
			return right + 1;
		}
		
	}
	
	public int numOfNodes(Node focusNode) {
		if (focusNode == null) {
			return 0;
		}
		return 1+numOfNodes(focusNode.leftChild)+numOfNodes(focusNode.rightChild);
		
	}
	
	public Node searchNode(int key) {
		
		Node currNode=root;
		while (key != currNode.key) {
			if (key < currNode.key) {
				currNode=currNode.leftChild;
				System.out.print(currNode +"=>");
			}else {
				currNode=currNode.rightChild;
				System.out.print(currNode +"=>");
			}
			if(currNode ==null) break;
		}
		return currNode;
	
	}
	public static void main(String[] args) {
		
		BinaryTree myTree=new BinaryTree();
		
		myTree.addNode(50, "A");
		myTree.addNode(15, "B");
		myTree.addNode(75, "C");
		myTree.addNode(10, "D");
		myTree.addNode(30, "E");
		myTree.addNode(55, "F");
		myTree.addNode(80, "G");
		myTree.addNode(80, "G");
		//myTree.addNode(85, "H");
		System.out.println("InOrder Tree traversal");
		myTree.inorderTraversal(myTree.root);
		/*System.out.println("PreOrder Tree traversal");
		myTree.preorderTraversal(myTree.root);
		System.out.println("PostOrder Tree traversal");
		myTree.postorderTraversal(myTree.root);*/
		System.out.println("Max Tree Depth"+ myTree.treeDepth(myTree.root));
		System.out.println("# of Nodes"+ myTree.numOfNodes(myTree.root));
		System.out.println("Searching for a node");
		System.out.println("\n"+myTree.searchNode(30));
		
		
	}
}
