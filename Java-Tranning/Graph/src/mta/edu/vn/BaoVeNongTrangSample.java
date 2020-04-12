package mta.edu.vn;

import java.io.FileInputStream;
import java.util.Scanner;

public class BaoVeNongTrangSample {

	public static void main(String[] args) throws Exception {
		new BaoVeNongTrangSample().inIt();
	}

	int N, M;
	int map[][];
	int visit[][];
	int Result;
	boolean isHead;
	int move[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 1 }, { -1, -1 }, { 1, -1 }, { -1, 1 } };
	MyQueue mQ;
	private Scanner sc;

	class Location {
		int x;
		int y;
		int value;

		public Location(int a, int b, int v) {
			x = a;
			y = b;
			value = v;
		}
	}

	class MyQueue {
		Location ele[];
		int front;
		int rear;

		public MyQueue() {
			front = 0;
			rear = 0;
			ele = new Location[100000];
		}

		boolean isEmpty() {
			if (front == rear)
				return true;
			else
				return false;
		}

		void push(Location x) {
			ele[rear] = x;
			rear++;
			if (rear == 100000)
				rear = 0;
		}

		Location pop() {
			Location a = ele[front];
			front++;
			if (front == 100000)
				front = 0;
			return a;
		}
	}

	private void inIt() throws Exception {
		System.setIn(new FileInputStream("baove.txt"));
		sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			if (sc.hasNextInt()) {
				N = sc.nextInt();
				M = sc.nextInt();
				map = new int[N][M];
				visit = new int[N][M];
				mQ = new MyQueue();
				Result = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						if (sc.hasNextInt()) {
							map[i][j] = sc.nextInt();
						}
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] != 0 && visit[i][j] == 0) {
						BFS(new Location(i, j, map[i][j]));
						if (isHead) {
							Result++;
						}
					}
				}
			}

			System.out.println("#" + test_case + " " + Result);
		}
	}

	private void BFS(Location location) {
		mQ.push(location);
		int head = location.value;
		isHead = true;
		while (!mQ.isEmpty()) {
			Location u = mQ.pop();
			for (int i = 0; i < 8; i++) {
				int X = u.x + move[i][0];
				int Y = u.y + move[i][1];
				if (checkSize(X, Y)) {
					if (map[X][Y] == head && visit[X][Y] == 0) {
						visit[u.x][u.y] = 1;
						visit[X][Y] = 1;
						mQ.push(new Location(X, Y, map[X][Y]));
					}
					if (map[X][Y] > head) {
						isHead = false;
					}
				}
			}
		}

	}

	private boolean checkSize(int x, int y) {
		if (x >= 0 && x < N && y >= 0 && y < M)
			return true;
		else
			return false;
	}

}
