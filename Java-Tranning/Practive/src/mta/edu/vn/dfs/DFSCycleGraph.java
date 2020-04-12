package mta.edu.vn.dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFSCycleGraph {

	private class Stack {
		int data;
		Stack next;

		Stack(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Stack top = null;

	//
	private boolean isEmpty() {
		return top == null;
	}

	//
	private void push(int data) {
		Stack s = new Stack(data);
		if (isEmpty()) {
			top = s;
		} else {
			s.next = top;
			top = s;
		}
	}

	//
	private int pop() {
		if (isEmpty()) {
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	//
	private int peek() {
		if (isEmpty()) {
			return -1;
		}
		return top.data;
	}

	private static boolean visited[];
	private static int parent[];
	private static int result;

	private static void DFS(int a[][], int n) {
		DFSCycleGraph stack = new DFSCycleGraph();
		int count;
		visited[0] = true;
		boolean check = false;
		for (int j = 0; j < n; j++) {
			stack.push(j);
			visited = new boolean[n];
			while (!stack.isEmpty()) {
				count = 0;
				int x = stack.peek();
				check = false;
				for (int i = 0; i < n; i++) {
					if (a[x][i] != 0) {
						if (!visited[i]) {
							stack.push(i);
							parent[i] = x;
							visited[i] = true;
							check = true;
							break;
						} else if (j == i) {
							result = 1;
							return;
						}
					}
				}
				if (!check) {
					stack.pop();
				}
			}
		}
	}

	private static void DFSRecursion(int a[][], int n, int x) {
		for (int i = x; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != 0) {
					if (!visited[j]) {
						visited[j] = true;
						parent[j] = x;
						DFSRecursion(a, n, j);
					} else if (i == j) {
						result = 1;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("cycle.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			visited = new boolean[n];
			parent = new int[n];
			result = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}

//			DFS(a, n);
			DFSRecursion(a, n, 0);

			//
			System.out.println("Case #" + t + "\n" + result);

		}
	}

}
