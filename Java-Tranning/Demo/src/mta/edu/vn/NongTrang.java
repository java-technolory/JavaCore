package mta.edu.vn;

import java.io.FileInputStream;
import java.util.Scanner;

public class NongTrang {

	private static int size1 = 0;
	private static int size2 = 0;

	//
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
	private boolean isEmpty() {
		return front == null;
	}

	//
	private void clear() {
		front = rear = null;
	}

	//
	private void enQueue(int x, int y) {
		int[] data = { x, y };
		Queue q = new Queue(data);
		if (isEmpty()) {
			front = rear = q;
		} else {
			rear.next = q;
			rear = q;
		}
		size1++;
//		size2++;
	}

	//
	private int[] deQueue() {
		if (isEmpty()) {
			return null;
		}
		int[] data = front.data;
		front = front.next;
		size2--;
		return data;
	}

	static int N, M;
	static Scanner sc;
	static int[][] arr;
	static int[][] check;
	static int[][] checkDinh;
	static int[] Qx, Qy;
	static int font, read;
	static int[] xx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] yy = { 0, -1, 1, -1, 1, -1, 0, 1 };
	static boolean kt;
	static int result;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("baove.txt"));
		sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int testCase = 0; testCase < tc; testCase++) {
			if (sc.hasNextInt()) {
				N = sc.nextInt();
				M = sc.nextInt();
				arr = new int[N][M];
				check = new int[N][M];
				result = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						if (sc.hasNextInt()) {
							arr[i][j] = sc.nextInt();
						}
					}
				}
			}
			size1 = 0;
			size2 = 0;
			BFS();
			System.out.println("#" + (testCase + 1) + " " + result + " - " + size1 + " - " + size2);
		}

	}

	private static void BFS() {
		int location[], row, col;
		NongTrang queue = new NongTrang();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (check[i][j] == 0 && arr[i][j] != 0) {
					queue.clear();
					queue.enQueue(i, j);
					kt = true;
					while (!queue.isEmpty()) {
						location = queue.deQueue();
						row = location[0];
						col = location[1];
						for (int k = 0; k < 8; k++) {
							int x = row + xx[k];
							int y = col + yy[k];
							if (x < 0 || y < 0 || x >= N || y >= M) {
								continue;
							}
							if (arr[x][y] > arr[row][col]) {
								kt = false;
							}
							if (arr[x][y] == arr[row][col] && check[x][y] == 0) {
								check[x][y] = 1;
								check[row][col] = 1;
								queue.enQueue(x, y);
							}
						}
					}
					if (kt) {
						result++;
					}
				}
			}
		}
	}
}
