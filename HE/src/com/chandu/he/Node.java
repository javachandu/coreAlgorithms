package com.chandu.he;

public class Node {

	int data;
	Node left, right;
	Node link;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	public Node(Node n, int data) {
		link = n;
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
