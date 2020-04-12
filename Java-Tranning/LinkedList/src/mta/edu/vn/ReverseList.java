package mta.edu.vn;

public class ReverseList {

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
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	void addFirst(int data) {
		Node first = new Node(data);
		if (head == null) {
			head = tail = first;
		} else {
			first.next = head;
			head = first;
		}
	}

	// xóa đầu
	void delFront() {
//		Node p = head;
		head = head.next;
//		p = null;
	}

	// xóa cuối
	void delEnd() {
		Node n;
		for (n = head; n.next != tail; n = n.next) {

		}
		n.next = null;
	}

	// xóa phần tử ở giữa
	void delMid(int data) {
		Node r;
		Node q;
		// c1
		for (r = head; r.next.data != data; r = r.next);			
		q = r.next; // gán vị node cần xóa trong list hiện tại 
		r.next = q.next;	// gán node mà q trỏ tới cho r
		q = null;	// xóa q
		
		// c2
		
	}
	
	

	//
	void reverse(Node current) {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		} else {
			if (current.next == null) { // trường hợp phần tử cuối cùng trong list
				System.out.print(current.data + " ");
				return;
			}
			reverse(current.next);
			System.out.print(current.data + " ");
		}

	}

	//
	void display() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list.addNewNode(1);
		list.addNewNode(2);
		list.addNewNode(3);
		list.addNewNode(4);
		list.addNewNode(5);
		list.addFirst(10);

		// Display
		list.display();
//		list.delFront();
		list.display();
//		list.delEnd();
		list.delMid(2);
		list.display();

		list.reverse(list.head);
	}

}
