package mta.edu.vn.bfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LinkList {
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
	void addLast(int data) {
		Node n = new Node(data);
		if (isEmpty()) {
			head = tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	//
	Node getNode() {
		return head;
	}

	//
	Node getNext() {
		head = head.next;
		return head;
	}
}

public class BFSFindGraph {

	// Queue
	class Queue {
		int data;
		Queue next;

		Queue(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Queue front, rear;

	//
	boolean isEmpty() {
		return front == null;
	}

	//
	void enQueue(int data) {
		Queue q = new Queue(data);
		if (isEmpty()) {
			front = rear = q;
		} else {
			rear.next = q;
			rear = q;
		}
	}

	//
	int deQueue() {
		if (isEmpty()) {
			return -1;
		}
		int data = front.data;
		front = front.next;
		return data;
	}

	private static LinkList[] list;
	private int n;

	private static boolean visited[];
	private static int parent[];

	public BFSFindGraph(int n) {
		this.n = n;
		list = new LinkList[n];
		for (int i = 0; i < n; i++) {
			list[i] = new LinkList();
		}
	}

	//
	static void BFS(int a[][], int n, BFSFindGraph queue) {
		visited[0] = true;
		queue.enQueue(0);
		int j = 0;
		while (!queue.isEmpty()) {
			int x = queue.deQueue();
			while (list[x].getNode() != null) {
				j = list[x].getNode().data;
				list[x].getNext();
				if (!visited[j]) {
					parent[j] = x;
					visited[j] = true;
					queue.enQueue(j);
				}
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("bfs-find.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int x = 0;
			BFSFindGraph queue = new BFSFindGraph(n);
			visited = new boolean[n];
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
//					a[i][j] = sc.nextInt();
					x = sc.nextInt();
					if (x != 0) {
						list[i].addLast(j);
					}
				}
				parent[i] = -1;
			}

			//
			BFS(a, n, queue);

			//
			for (int i = 0; i < n; i++) {
				System.out.print(parent[i] + " ");
			}
		}
	}

}
