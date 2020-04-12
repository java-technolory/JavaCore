package mta.edu.vn.dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PathFindingPuzzles {

	// Queue
	private class Queue {
		int[] data;
		Queue next;

		Queue(int[] data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	private Queue front, rear;

	//
	private void enQueue(int x, int y) {
		int[] data = { x, y };
		Queue q = new Queue(data);
		if (front == null) {
			front = rear = q;
		} else {
			rear.next = q;
			rear = q;
		}
	}

	//
	private int[] deQueue() {
		if (front == null) {
			return null;
		}
		int[] data = front.data;
		front = front.next;
		return data;
	}

	// Stack
	private class Stack {
		int[] data;
		Stack next;

		Stack(int[] data) {
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
	private void push(int x, int y) {
		int[] data = { x, y };
		Stack s = new Stack(data);
		if (isEmpty()) {
			top = s;
		} else {
			s.next = top;
			top = s;
		}
	}

	//
	private int[] pop() {
		if (isEmpty()) {
			return null;
		}
		int[] data = top.data;
		top = top.next;
		return data;
	}

	private static boolean result;
	private static boolean[][] visited;
	private static Scanner sc;
	//

	static void Recusion(int a[][], int row, int col) {
		int h = a.length;
		int m;
		if (row < 0 || col < 0 || row >= h || col >= h || visited[row][col]) {
			return;
		}
		visited[row][col] = true;
		if (row == h - 1 && col == h - 1) {
			result = true;
		}
		m = a[row][col];
		Recusion(a, row, col + m);
		Recusion(a, row, col - m);
		Recusion(a, row - m, col);
		Recusion(a, row + m, col);
	}

	static void DFS(int a[][]) {
		int h = a.length;
		int location[], row, col, x, y;
		PathFindingPuzzles stack = new PathFindingPuzzles();
		stack.push(0, 0);
		while (!stack.isEmpty()) {
			location = stack.pop();
			row = location[0];
			col = location[1];
			if (row < 0 || col < 0 || row >= h || col >= h || visited[row][col]) {
				continue;
			}
			visited[row][col] = true;
			if (row == h - 1 && col == h - 1) {
				result = true;
			}
			x = a[row][col];
			stack.push(row, col + x);
			stack.push(row, col - x);
			stack.push(row - x, col);
			stack.push(row + x, col);
		}
	}

	static void BFS(int a[][]) {
		PathFindingPuzzles queue = new PathFindingPuzzles();
		int location[], row, col, x;
		queue.enQueue(0, 0);
		while (queue.front != null) {
			location = queue.deQueue();
			row = location[0];
			col = location[1];
			if (row < 0 || col < 0 || row >= a.length || col >= a[0].length || visited[row][col]) {
				continue;
			}
			if (row == a.length - 1 && col == a[0].length - 1) {
				result = true;
			}
			x = a[row][col];
			visited[row][col] = true;
			queue.enQueue(row, col + x);
			queue.enQueue(row, col - x);
			queue.enQueue(row - x, col);
			queue.enQueue(row + x, col);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("path.txt"));
		sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			result = false;
			int a[][] = new int[n][n];
			visited = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			//
//			DFS(a);
//			BFS(a);
			Recusion(a, 0, 0);
			//
			if (result) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}