package com.chandu.core;

import java.util.Scanner;


public class Practice {
	public static void main(String args[]) {

		binaryTree tree = new binaryTree();
		Scanner scan = new Scanner(System.in);
		int nodes = scan.nextInt();
		for (int i = 0; i < nodes; i++) {
			tree.insert(scan.nextInt());
		}

		tree.printInOrder(tree.root);
		System.out.println(tree.getLeafCount());
		
	}

}

class binaryTree {
	public Node root;

	public binaryTree() {
		root = null;
	}

	public void insert(int id) {
		Node newNode = new Node(id);
		newNode.data = id;
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (id < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else
					current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.println("  Traversed " + node.data);
			printInOrder(node.right);
		}
	}
	
	int getLeafCount() {
		return getLeafCount(root);
	}

	int getLeafCount(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}
	
}

class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int datain) {
		data = datain;
	}
}
