package mta.edu.vn;

public class LinkedListExample {

	Node head; // node đầu tiên của linked list.

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		Node fourd = new Node(400);
		list.head.next = second;
		second.next = third;
		third.next = fourd;
		list.display();
	}

}
