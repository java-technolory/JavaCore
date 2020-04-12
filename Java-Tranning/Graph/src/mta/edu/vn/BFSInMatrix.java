package mta.edu.vn;

public class BFSInMatrix {

	class Queue {
		int[] data;
		Queue next;

		Queue(int[] data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Queue front = null;
	Queue rear = null;

	//
	boolean isEmpty() {
		return front == null;
	}

	//
	void enQueue(int x, int y) {
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
	int[] deQueue() {
		int[] data = new int[2];
		if (isEmpty()) {
			return null;
		} else {
			data = front.data;
			front = front.next;
		}
		return data;
	}

	//
	static void BFS(int a[][]) {
		BFSInMatrix queue = new BFSInMatrix();
		int h = a.length;
		int l = a.length;
		boolean visited[][] = new boolean[h][l];
		queue.enQueue(0, 0);
		int row = 0, col = 0;
		int data[] = new int[2];
		while (!queue.isEmpty()) {
			data = queue.deQueue();
			row = data[0];
			col = data[1];
			if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col]) {
				continue;
			}
			visited[row][col] = true;
			System.out.print(a[row][col]+ " ");
			queue.enQueue(row, col + 1); // go right
			queue.enQueue(row, col - 1); // go left
			queue.enQueue(row + 1, col); // go up
			queue.enQueue(row - 1, col); // go down
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		BFS(a);
	}

}
