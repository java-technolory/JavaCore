package mta.edu.vn;

import java.util.LinkedList;

class LinkList {

	static int count = 0;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Node head, tail;

	//
	boolean isEmpty() {
		return head == null;
	}

	//
	void addFirst(int data) {
		Node n = new Node(data);
		if (isEmpty()) {
			head = tail = n;
		} else {
			n.next = head;
			head = n;
		}
		count++;
	}

	//
	Node getNext() {
		Node tmp = head;
		head = head.next;
		return tmp;
	}

	Node getSize() {
		return head;
	}

	//
	int size() {
		return count;
	}

}

public class GraphImplementAdjacency {

	int vertex;
	LinkedList<Integer> list[];
	LinkList l[];

	public GraphImplementAdjacency(int vertex) {
		this.vertex = vertex;
		list = new LinkedList[vertex];
		l = new LinkList[vertex];
		for (int i = 0; i < vertex; i++) {
			list[i] = new LinkedList<Integer>();
			l[i] = new LinkList();
		}
	}

	public void addEdge(int source, int destination) {
		// add edge
		list[source].addFirst(destination);
		l[source].addFirst(destination);

		// add back edge ((for undirected))
		list[destination].addFirst(source);
		l[destination].addFirst(source);
	}

	public void printGraph() {
		for (int i = 0; i < vertex; i++) {
			if (list[i].size() > 0) {
				System.out.print("Vertex " + i + " is connected to: ");
				for (int j = 0; j < list[i].size(); j++) {
					System.out.print(list[i].get(j) + " ");
				}
				System.out.println();
			}
		}
	}

	public void printGraph1() {
		for (int i = 0; i < vertex; i++) {
			System.out.println(":::" + l[i].size());
			if (l[i].size() > 0) {
				System.out.print("Vertex " + i + " is connected to: ");
				while (l[i].getSize() != null) {
					System.out.print(l[i].getNext().data + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		GraphImplementAdjacency graph = new GraphImplementAdjacency(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph1();

		//

	}

}
