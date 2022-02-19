package com.chandu.he;

public class SingleLinkedListEx {

	private Node start = null;
	private Node end = null;
	private int size = 0;

	public SingleLinkedListEx() {
		this.start = null;
		this.end = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void addFirst(int val) {
		Node newNode = new Node(null, val);
		size++;
		if (this.start == null) {
			this.start = newNode;
			this.end = this.start;
		} else {
			newNode.setLink(this.start);
			start = newNode;
		}
	}

	public void addEnd(int val) {
		Node endNode = new Node(null, val);
		size++;
		if (this.start == null) {
			start = endNode;
			endNode = start;
		} else {
			end.setLink(endNode);
			end = endNode;
		}
	}

	public void insertAt(int val, int pos) {
		Node posNode = new Node(null, val);
		Node temp = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (pos == i) {
				Node temp1 = temp.getLink();
				temp.setLink(posNode);
				posNode.setLink(temp1);
				break;
			}
			temp = temp.getLink();
		}
		size++;
	}

	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}

}
