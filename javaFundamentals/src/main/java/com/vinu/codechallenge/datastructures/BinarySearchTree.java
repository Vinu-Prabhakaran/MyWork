/**
 * 
 */
package com.vinu.codechallenge.datastructures;

/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */
class TreeNode{
	
	int key;
	String name;
	
	TreeNode leftChild;
	TreeNode rightChild;
	@Override
	public String toString() {
		return "Node [key=" + key + ", name=" + name + "]";
	}
	
	public TreeNode(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}	
	
}

public class BinarySearchTree {
	
	private TreeNode root;
	
	public void addNode(int key,String name) {
		TreeNode newNode = new TreeNode(key,name);
		
		if (root == null) {
			root=newNode;
			return;
		} 
		TreeNode currNode=root;
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
	public void inorderTraversal(TreeNode focusNode) {
		
		if (focusNode != null) {
			inorderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inorderTraversal(focusNode.rightChild);
		}
	}
	//preOrder - start from root , left,right
	public void preorderTraversal(TreeNode focusNode) {
		
		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraversal(focusNode.leftChild);
			preorderTraversal(focusNode.rightChild);
		}
	}
	//postOrder - left,right,root
	public void postorderTraversal(TreeNode focusNode) {
		
		if (focusNode != null) {
			postorderTraversal(focusNode.leftChild);
			postorderTraversal(focusNode.rightChild);
			System.out.println(focusNode);

		}
	}
	public int treeDepth(TreeNode focusNode) {
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
	
	public int numOfNodes(TreeNode focusNode) {
		if (focusNode == null) {
			return 0;
		}
		return 1+numOfNodes(focusNode.leftChild)+numOfNodes(focusNode.rightChild);
		
	}
	
	public TreeNode searchNode(int key) {
		
		TreeNode currNode=root;
		while (key != currNode.key) {
			if (key < currNode.key) {
				currNode=currNode.leftChild;
				System.out.print(currNode +"=>");
			}else if(key > currNode.key){
				currNode=currNode.rightChild;
				System.out.print(currNode +"=>");
			}
			if(currNode ==null) break;
		}
		return currNode;
	
	}
	
	public void deleteNode(int key) {
		
		TreeNode currNode=root;
		TreeNode parentNode=root;
		boolean isLeftChild=true;
		
		// Search for the node keeping track of its parent O(log n)
		while (currNode != null && key != currNode.key) {
			parentNode = currNode;
			if (key < currNode.key) {
				currNode= currNode.leftChild;
				isLeftChild = true;
			}else {
				currNode=currNode.rightChild;
				isLeftChild = false;
			}
		}
		//Check if found
		if (currNode == null) {
			System.out.println("Node to be deleted not found");
			return;
		}
		
		//Check if the node to be deleted is a leaf
		if (currNode.leftChild == null && currNode.rightChild == null) {
			if (currNode == root) {
				root = null;
			} else { // current Node is not a root
				if (isLeftChild) {
					parentNode.leftChild = null;
				}else {
					parentNode.rightChild = null;
				}
			}
		}else if (currNode.leftChild == null) { // Node has only right child
			if (currNode == root) { //Node to be deleted is root and has only right children.
				root = currNode.rightChild;
			}else {
				if (isLeftChild) {
					parentNode.leftChild = currNode.rightChild;
				}else {
					parentNode.rightChild = currNode.rightChild;
				}
			}
		}else if (currNode.rightChild == null){ // Node has only left child
			if (currNode == root) { //Node to be deleted is root and has only left children.
				root = currNode.leftChild;
			}else {
				if (isLeftChild) {
					parentNode.leftChild = currNode.leftChild;
				}else {
					parentNode.rightChild = currNode.leftChild;
				}
			}
		}
		
		
	}
	
	public void levelOrderTraversal(TreeNode focusNode) {
		int height=treeDepth(focusNode);
		System.out.println("Height :"+height);
		for (int i = 1; i <=height+1; i++) {
			printCurrentlevel(focusNode,i);
		}	
	}
	
	public void printCurrentlevel(TreeNode focusNode,int level) {
		if (focusNode == null) {
			return;
		}
		if (level == 1) {
			System.out.println(focusNode);
		}else {
			printCurrentlevel(focusNode.leftChild, level-1);
			printCurrentlevel(focusNode.rightChild, level-1);

		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree myTree=new BinarySearchTree();
		
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
		System.out.println("Level Order Traversal");
		myTree.levelOrderTraversal(myTree.root);
		
		
	}
}
