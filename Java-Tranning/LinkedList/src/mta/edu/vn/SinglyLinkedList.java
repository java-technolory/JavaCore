package mta.edu.vn;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Node head = null;
	Node tail = null;

	//
	void addNewNode(int data) {
		Node newNode = new Node(data);
		if (head == null) { // list empty
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	//
	void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of simply linked list:");
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNewNode(100);
		list.addNewNode(200);
		list.addNewNode(300);
		list.addNewNode(400);
		list.addNewNode(500);
		list.display();

	}

}
