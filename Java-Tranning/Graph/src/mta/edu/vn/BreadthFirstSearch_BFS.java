package mta.edu.vn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BreadthFirstSearch_BFS {

	class Queues {
		int data;
		Queues next;

		public Queues(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Queues front = null;
	Queues rear = null;

	//
	boolean isEmpty() {
		return front == null;
	}

	//
	void enQueues(int data) {
		Queues q = new Queues(data);
		if (front == null) {
			front = rear = q;
		} else {
			rear.next = q;
			rear = q;
		}
	}

	//
	int deQueues() {
		int data = 0;
		if (isEmpty()) {
			return -1;
		} else {
			data = front.data;
			front = front.next;
		}
		return data;
	}
	

	static int[] parent;
	static boolean[] visisted;

	static void BFS(int start, int a[][], BreadthFirstSearch_BFS bfs) {
		int v = start;
		int count = 0;
		visisted[0] = true;
		parent[0] = 0;
		bfs.enQueues(0);
		while (!bfs.isEmpty()) {
			v = bfs.deQueues();
			for (int i = 0; i < a.length; i++) {
				if (a[v][i] != 0 && visisted[i] == false) {
					bfs.enQueues(i);
					visisted[i] = true;
					parent[i] = v;
				}
			}
		}
//		printPath(1, 6);

	}

	static void printPath(int u, int v) {
		if (u == v) {
			System.out.print(v + " ");
			return;
		} else {
			if (parent[v] == -1) {
				System.out.println("Ko co duong di");
			} else {
				printPath(u, parent[v]);
				System.out.print(v + " ");
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("bfs.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		BreadthFirstSearch_BFS bfs = new BreadthFirstSearch_BFS();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			parent = new int[n];
			visisted = new boolean[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
				parent[i] = -1;
			}

			//
			BFS(0, a, bfs);

			//
			for (int i = 0; i < n; i++) {
				System.out.print(parent[i] + " ");
			}
			System.out.println();

		}
//		System.out.println("Hello");
	}

}
