package com.getwayssolution.www;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Node root = createTree();
		
		inOrderTree(root);
		System.out.println();
		preOrderTree(root);
		System.out.println();
		postOrderTree(root);

	}

	public static Node createTree() {
		Scanner sc = new Scanner(System.in);
		Node root = null;

		int data = sc.nextInt();

		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left of "+data);
		root.left = createTree();
		
		System.out.println("Enter right of "+data);
		root.right = createTree();
		return root;
	}

	public static void inOrderTree(Node root) {
		if(root == null) return;
		
		inOrderTree(root.left);
		System.out.print(root.data+" ");
		inOrderTree(root.right);
	}
	
	public static void preOrderTree(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrderTree(root.left);
		
		preOrderTree(root.right);
	}
	
	public static void postOrderTree(Node root) {
		if(root == null) return;
		
		postOrderTree(root.left);
		
		postOrderTree(root.right);
		System.out.print(root.data+" ");
	}


}


class Node{
	Node left, right;
	int data;
	public Node( int data) {
		this.data = data;
	}
}
