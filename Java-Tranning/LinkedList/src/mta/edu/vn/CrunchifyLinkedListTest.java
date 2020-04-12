package mta.edu.vn;

public class CrunchifyLinkedListTest {
	private static CrunchifyLinkedList list;
	private static CrunchifyLinkedList[] l;

	public static void main(String[] args) {
		list = new CrunchifyLinkedList();
		l = new CrunchifyLinkedList[5];

		//
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		//
		for (int i = 0; i < 5; i++) {
			l[i] = new CrunchifyLinkedList();
		}
		
		l[0].add(1);
		l[0].add(4);
		l[1].add(2);
		l[1].add(3);
		l[1].add(4);
		l[2].add(3);
		l[3].add(4);

		System.out.println(":::" + list.toString());
	}
}

class CrunchifyLinkedList {
	private static int counter;
	private Node head;

	// Default constructor
	public CrunchifyLinkedList() {

	}

	// appends the specified element to the end of this list
	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		}

		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;

		if (crunchifyCurrent != null) {
			while (crunchifyCurrent.getNext() != null) {
				crunchifyCurrent = crunchifyCurrent.getNext();
			}

			// the last node's "node" reference set to our new node
			crunchifyCurrent.setNext(crunchifyTemp);
		}
		// increment the number of element variable
		incrementCounter();
	}

	// inserts the specified element at the specified position int this list
	public void add(Object data, int index) {
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (crunchifyCurrent != null) {
			// crawl to the request indext or the last element in the list, whichever comes
			// first
			for (int i = 0; i < index && crunchifyCurrent.getNext() != null; i++) {
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
		}
		// set the new node's next-node reference to this node's next-node reference
		crunchifyTemp.setNext(crunchifyCurrent.getNext());

		// now set this node's next-node reference to the new node
		crunchifyCurrent.setNext(crunchifyTemp);

		// increment the number of elements variable
		incrementCounter();
	}

	// return the element at the specified position in this list
	public Object get(int index) {
		// index must be 1 or higher
		if (index < 0) {
			return null;
		}
		Node crunchifyCurrent = null;
		if (head != null) {
			crunchifyCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null) {
					return null;
				}
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			return crunchifyCurrent.getData();
		}
		return crunchifyCurrent;
	}

	//
	public boolean remove(int index) {
		// if the index is out of range, exit
		if (index < 1 || index > size()) {
			return false;
		}
		Node crunchifyCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null) {
					return false;
				}
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());

			// decrement the number of elements variable
			decrementCounter();
			return true;
		}
		return false;
	}

	//
	private static int getCounter() {
		return counter;
	}

	//
	private static void incrementCounter() {
		counter++;
	}

	//
	@SuppressWarnings("unused")
	private static void decrementCounter() {
		counter--;
	}

	//
	private static int size() {
		return getCounter();
	}

	//
	public String toString() {
		String output = "";
		if (head == null) {
			Node cruchifyCurrent = head.getNext();
			while (cruchifyCurrent != null) {
				output += "[" + cruchifyCurrent.getData().toString() + "]";
				cruchifyCurrent = cruchifyCurrent.getNext();
			}
		}
		return output;
	}

}

class Node {
	// referent to the next node in the chain, or null if there isn't one.
	Node next;

	// data carried by this node. Could be of any type you need
	Object data;

	// Node constructor
	public Node(Object data) {
		this.next = null;
		this.data = data;
	}

	//
	@SuppressWarnings("unused")
	public Node(Object data, Node next) {
		this.next = next;
		this.data = data;
	}

	//
	public Object getData() {
		return this.data;
	}

	//
	@SuppressWarnings("unused")
	public void setData(int data) {
		this.data = data;
	}

	//
	public Node getNext() {
		return this.next;
	}

	//
	@SuppressWarnings("unused")
	public void setNext(Node next) {
		this.next = next;
	}

}
