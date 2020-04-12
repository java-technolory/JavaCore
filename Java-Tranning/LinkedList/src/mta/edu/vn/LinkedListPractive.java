package mta.edu.vn;

public class LinkedListPractive {

	// size of list
	private int size;

	// Create Node
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Node head;
	Node tail;

	// IsEmpty
	boolean isEmpty() {
		return (head == null);
	}

	// Add node
	void add(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		++size;
	}

	// Thêm vào đầu
	void addFirst(int data) {
		System.out.println("\n=> Thêm đầu danh sách");
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		++size;
	}

	// Thêm vào cuối
	void addLast(int data) {
		System.out.println("\n=> Thêm cuối danh sách");
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		++size;
	}

	// Thêm vào giữa 2 node xác định
	// node cần thêm vào vị trí f và s (f: vị trí trc, s: vị trí sau node cần thêm)
	void addMid(int data, int f, int s) {
		System.out.println("\n=> Thêm vào giữa 2 node " + f + "vs" + s + " trong danh sách");
		if (isEmpty()) {
			System.out.println("=>List is null!");
			return;
		}
		Node q = head;
		Node newNode = new Node(data);
		Node first, second;
		while (true) {
			if (q.data == f && q.next.data == s) {
				first = q;
				second = q.next;
				break;
			}
			q = q.next;
		}
		first.next = newNode;
		newNode.next = second;
		++size;
	}

	// Thêm vào sau vị trí k
	void addLastIndex(int data, int k) {
		System.out.println("\n=>Thêm vào sau vị trí " + k);
		if (isEmpty()) {
			System.out.println("=>List is null!");
			return;
		}
		if (k > size - 1) {
			System.out.println("=>Index not found!");
			return;
		}
		if (size == 1 || k == size - 1) {
			addLast(data);
			return;
		}
		int count = 0;
		Node current = new Node(data);
		Node q = head;
		while (true) {
			if (k == count) {
//				current = q;
				break;
			}
			q = q.next;
			++count;
		}
		current.next = q.next;
		q.next = current;
		++size;
	}

	// Thêm vào trước vị trí k
	void addFirstIndex(int data, int k) {
		System.out.println("\n=>Thêm vào trước vị trí " + k);
		if (isEmpty()) {
			System.out.println("\n=>List is null!");
			return;
		}
		if (k > size - 1) {
			System.out.println("\n=>Index not found!");
			return;
		}
		if (size == 1 || k == 0) {
			addFirst(data);
			return;
		}
		int count = 0;
		Node current = new Node(data);
		Node q = head;
		while (true) {
			if (k - 1 == count) {
				break;
			}
			q = q.next;
			++count;
		}
		current.next = q.next;
		q.next = current;
		++size;
	}

	// Thêm vào vị trí bất kỳ

	// Xóa đầu
	void delFirst() {
		if (isEmpty()) {
			System.out.println("\n=>List is null!");
			return;
		}
		System.out.println("\n=>Xóa node đầu");
		head = head.next;
		--size;
	}

	// Xóa cuối
	void delLast() {
		if (isEmpty()) {
			System.out.println("\n=>List is null!");
			return;
		}
		System.out.println("\n=>Xóa node cuối");
		Node current = head;
		while (true) {
			if (current.next.next == null) {
				break;
			}
			current = current.next;
		}
		current.next = null;
		--size;
	}

	// Xóa giữa hai node
	void delAfter(int f) {
		System.out.println("\n=>Xóa node sau node " + f);
		if (isEmpty() || size < 2) {
			System.out.println("List is null!");
			return;
		}
		Node current = head;
		Node q;
		while (true) {
			if (current.data == f) {
				break;
			}
			current = current.next;
		}
		q = current.next;
		current.next = q.next;
		q = null;
	}

	// Xóa trước node
	void delBefore(int data) {
		if (isEmpty()) {
			System.out.println("List is null!");
			return;
		}
		Node current = head;
		while (current != null) {
			if (current.next.data == data) {
				break;
			}
			current = current.next;
		}
	}

	// Xóa node xác định
	void delNode(int data) {
		System.out.println("\n=>Xóa node " + data + " trong list");
		if (isEmpty() || size < 1) {
			System.out.println("List is null!");
			return;
		}
		Node current = head;
		Node q = null;
		while (current != null) {
			if (current.data == data) {
				// node cần xóa ở ngay đầu danh sách
				delFirst();
				return;
			}
			if (current.next.next == null) {
				delLast();
				return;
			}
			if (current.next.data == data && current.next != null) {
				break;
			}
			current = current.next; // node đứng trước node cần xóa
		}
		q = current.next;
		current.next = q.next;
		q = null;
		--size;
	}

	// xóa phần tử trùng nhau
	void delDuplicate() {

		Node current = head;
		Node first = null, second = null;
		while (current != null) {
			if (current.data == current.next.data) {
				first = current;
				second = current.next;
			}
			current = current.next;
		}
	}

//	void removeDuplicate() {
//		Node current = head;
//		Node index = null, temp = null;
//		while (current != null) {
//			temp = current;
//			index = current.next;
//			while (index != null) {
//				if (current.data == index.data) {
//					temp.next = index.next;
//				} else {
//					temp = index;
//				}
//				index = index.next;
//			}
//			current = current.next;
//		}
//	}

	// Xóa vị trí bất kỳ

	// Tìm phẩn tử trong list

	// Hiển thị
	void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	void reverse() {
		Node next = null;
		Node prev = null;
		Node current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListPractive list = new LinkedListPractive();
		list.add(100);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(400);
		list.add(300);
		list.add(300);
		list.add(400);
		list.add(9);
		list.add(600);
		list.display();

		System.out.println();
//		list.removeDuplicate();
//		list.display();

//		System.out.println();
//		list.delDuplicate();
//		list.display();

		// Thêm đầu
		list.addFirst(1);
		list.display();

		// Thêm cuối
		list.addLast(10);
		list.display();

		// Thêm vào giữa 2 node
		list.addMid(8, 300, 400);
		list.display();

		// Thêm vào sau vị trí thứ 6 (tức là sau node 500 và trước node 600)
		list.addLastIndex(9, 6);
		list.display();

		// Thêm vào vị trí thứ 9 (tức là thêm vào vị trí giữa 600 vs 10)
		list.addFirstIndex(7, 9);
		list.display();

		// Xóa node đầu (1)
		list.delFirst();
		list.display();

		// Xóa node cuối (10)
		list.delLast();
		list.display();
		list.delLast();
		list.display();
		list.delLast();
		list.display();
		list.delLast();
		list.display();

//
//		// Xóa node (9) sau node 500
//		list.delAfter(500);
//		list.display();
//
//		// Display reverse
//		list.reverse();
//		list.display();
//
//		// Xóa node 300
//		list.delNode(300);
//		list.display();
//		list.delNode(100);
//		list.display();
//		list.delNode(7);
//		list.display();
//		list.delNode(500);
//		list.display();
//		list.delNode(400);
//		list.display();
//		list.delNode(8);
//		list.display();
//		list.delNode(200);
//		list.display();
//		list.delNode(600);
//		list.display();
	}

}
