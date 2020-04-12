package mta.edu.vn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaoVeNongTrang {

	private class Queue {
		int[] data;
		Queue next;

		public Queue(int[] data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	private Queue front = null;
	private Queue rear = null;

	//
	private boolean isEmpty() {
		return front == null;
	}

	//
	private void clear() {
		front = rear = null;
	}

	//
	private void enQueue(int x, int y) {
		int data[] = { x, y };
		Queue q = new Queue(data);
		if (isEmpty()) {
			front = rear = q;
		} else {
			rear.next = q;
			rear = q;
		}
	}

	//
	private int[] deQueue() {
		if (isEmpty()) {
			return null;
		}
		int[] data = front.data;
		front = front.next;
		return data;
	}

	//
	private static boolean[][] visited;
	private static int[][] temp = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 1 }, { -1, -1 }, { 1, -1 },
			{ -1, 1 } };
	private static int result;
	private static Scanner sc;

	//
	private static void BFS(int a[][]) {
		BaoVeNongTrang queue = new BaoVeNongTrang();
		int h = a.length;
		int l = a[0].length;
		int location[], row, col, x, y;
		boolean check = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
				if (!visited[i][j] && a[i][j] != 0) {
					queue.clear();
					queue.enQueue(i, j);
					check = true;
					while (!queue.isEmpty()) {
						location = queue.deQueue();
						row = location[0];
						col = location[1];
						for (int k = 0; k < 8; k++) {
							x = row + temp[k][0];
							y = col + temp[k][1];
							if (x < 0 || y < 0 || x >= h || y >= l) {
								continue;
							}
							if (a[x][y] == a[row][col] && !visited[x][y]) {
								visited[x][y] = true;
								visited[row][col] = true;
								queue.enQueue(x, y);
							}
							if (a[x][y] > a[row][col]) {
								check = false;
							}
						}
					}
					if (check) {
						result++;
					}
				}
			}
		}

	}

	static int a[][];

	//
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("baove.txt"));
		sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				a = new int[n][m];
				visited = new boolean[n][m];
				result = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (sc.hasNextInt()) {
							a[i][j] = sc.nextInt();
						}
					}
				}
			}
			//
			BFS(a);
			//
			System.out.println("#" + t + " " + result);
		}
	}

}
