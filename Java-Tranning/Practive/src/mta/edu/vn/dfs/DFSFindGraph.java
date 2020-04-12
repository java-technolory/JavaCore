package mta.edu.vn.dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFSFindGraph {

	private class Stack {
		int data;
		Stack next;

		Stack(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	private Stack top = null;

	//
	private boolean isEmpty() {
		return top == null;
	}

	//
	private void clear() {
		top = null;
	}

	//
	private void push(int x) {
		Stack s = new Stack(x);
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
		int x = top.data;
		top = top.next;
		return x;
	}

	//
	private int peek() {
		return top.data;
	}

	private static boolean visited[];
	private static int parent[];

	private static void DFS(int a[][], int n, int x) {
		DFSFindGraph stack = new DFSFindGraph();
		stack.push(x);
		visited[x] = true;
		parent[x] = 0;
		int v = 0;
		while (!stack.isEmpty()) {
			int count = 0;
			v = stack.peek();
			for (int i = 0; i < n; i++) {
				if (a[v][i] != 0 && !visited[i]) {
					stack.push(i);
					visited[i] = true;
					parent[i] = v;
					break;
				} else {
					count++;
				}
			}
			if (count == n) {
				stack.pop();
			}
		}
	}

	private static void DFSDemo(int a[][], int n) {
		DFSFindGraph stack = new DFSFindGraph();
		stack.push(0);
		visited[0] = true;
		parent[0] = 0;
		while (!stack.isEmpty()) {
			int v = stack.pop();
			for (int i = 0; i < n; i++) {
				if (!visited[i] && a[v][i] != 0) {
					stack.push(i);
					visited[i] = true;
					parent[i] = v;
				}
			}
		}
	}

	private static void DFSRecusion(int a[][], int n, int x) {
		visited[x] = true;
		for (int i = 0; i < n; i++) {
			if (a[x][i] != 0 && !visited[i]) {
				visited[i] = true;
				parent[i] = x;
				DFSRecusion(a, n, i);
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("find.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			parent = new int[n];
			visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
				parent[i] = -1;
			}

			//
			DFS(a, n, 0);
//			DFSRecusion(a, n, 0);
//			DFSDemo(a, n);

			//
			System.out.println("Case #" + t);
			for (int i : parent) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
