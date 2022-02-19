package com.chandu.he;

import java.util.Scanner;

public class LeafCount {

	Node root;

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		LeafCount leaf = new LeafCount();
		int nodes = scan.nextInt();
		leaf.root = new Node(scan.nextInt());
		for (int i = 0; i < nodes - 1; i++) {
			int value = scan.nextInt();
			leaf.root = leaf.insertNode(leaf.root, value);

		}

		System.out.println(leaf.getLeafCount());
		printInOrder(leaf.root);

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

	public Node insertNode(Node head, int data) {

		if (head == null) {
			head = new Node(data);
			//head.data = data;
			return head;
		}
		if (head.data < data) {
			head.right = insertNode(head.right, data);
		} else {
			head.left = insertNode(head.left, data);
		}
		// System.out.println("data "+head.data);
		return head;
	}

	public static void printInOrder(Node node)

	{

		if (node != null)

		{

			printInOrder(node.left);

			System.out.println("  Traversed " + node.data);

			printInOrder(node.right);

		}

	}

}
