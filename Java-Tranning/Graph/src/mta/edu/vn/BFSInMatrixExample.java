package mta.edu.vn;

public class BFSInMatrixExample {

	class Queue {
		int[] data;
		Queue next;

		public Queue(int[] data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Queue front = null, rear = null;

	//
	boolean isEmpty() {
		return front == null;
	}

	//
	void enQueue(int x, int y) {
		int[] data = { x, y };
		Queue q = new Queue(data);
		if (isEmpty()) {
			front = rear = q;
		} else {
			rear.next = q;
			rear = q;
		}
	}

	//
	int[] deQueue() {
		int[] data = new int[2];
		if (isEmpty()) {
			return data;
		} else {
			data = front.data;
			front = front.next;
		}
		return data;
	}

	private static boolean BFS(int[][] grid) {
		BFSInMatrixExample bfs = new BFSInMatrixExample();
		int h = grid.length;
		if (h == 0) {
			return false;
		}
		int l = grid[0].length;
		int data[] = new int[2];
		boolean[][] visited = new boolean[h][l];
		bfs.enQueue(0, 0);
		int x, y;
		int count[] = new int[h + 1];
		boolean check = false;
		int i = 1;
		while (i <= h) {
			while (true) {
				check = false;
				for (int p = 0; p < l; p++) {
					for (int q = 0; q < l; q++) {
						if (!visited[p][q] && grid[p][q] == i) {
							check = true;
							bfs.enQueue(p, q);
							break;
						}
					}
					if (check) {
						break;
					}
				}
				if (bfs.isEmpty()) {
					break;
				}
				while (!bfs.isEmpty()) {
					x = bfs.deQueue()[0];
					y = bfs.deQueue()[1];
					if (x >= h || y >= l || x < 0 || y < 0 || visited[x][y]) {
						continue;
					}
					visited[x][y] = true;
					if (y < l - 1 && grid[x][y + 1] == i) { // right
						bfs.enQueue(x, y + 1);
					}
					if (y > 0 && grid[x][y - 1] == i) { // left
						bfs.enQueue(x, y - 1);
					}
					if (x < h - 1 && grid[x + 1][y] == i) { // up
						bfs.enQueue(x + 1, y);
					}
					if (x > 0 && grid[x - 1][y] == i) { // down
						bfs.enQueue(x - 1, y);
					}
				}
				count[i] = count[i] + 1;
			}
			if (i >= 2 && count[i] != count[i - 1]) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		int a[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		BFS(a);
	}

}
