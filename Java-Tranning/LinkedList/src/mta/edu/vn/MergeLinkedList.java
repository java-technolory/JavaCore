package mta.edu.vn;

public class MergeLinkedList {

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
	void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// merge
	void merge(MergeLinkedList list) {
		Node one = head;
		Node two = list.head;
		Node p = null, q = null;
		while (one != null && two != null) {
			p = one.next;
			q = two.next;
			
			two.next = p;
			one.next = two;
			
			one = p;
			two = q;
			
		}
	}

	// display
	void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print(" null ");
	}

	public static void main(String[] args) {

		MergeLinkedList merge1 = new MergeLinkedList();
		MergeLinkedList merge2 = new MergeLinkedList();

		merge1.push(1);
		merge1.push(2);
		merge1.push(3);
		merge1.push(4);
		merge1.push(5);

		System.out.println("=>List 1");
		merge1.display();

		merge2.push(100);
		merge2.push(200);
		merge2.push(300);
		merge2.push(400);
		merge2.push(500);

		System.out.println("\n=>List 2");
		merge2.display();
		

		/*
		 * 1 -> 100 -> 2 -> 200 -> 3 -> 300 -> 4 -> 400 -> 5 -> 500
		 */

		merge1.merge(merge2);
		
	}

}
