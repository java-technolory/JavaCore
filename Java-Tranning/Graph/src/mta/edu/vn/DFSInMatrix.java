package mta.edu.vn;

public class DFSInMatrix {

	class Stack {
		int[] data;
		Stack next;

		Stack(int[] data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	Stack head = null;

	//
	boolean isEmpty() {
		return head == null;
	}

	//
	void push(int x, int y) {
		int data[] = { x, y };
		Stack p = new Stack(data);
		if (isEmpty()) {
			head = p;
		} else {
			p.next = head;
			head = p;
		}
	}

	//
	int[] pop() {
		int data[] = new int[2];
		if (isEmpty()) {
			return null;
		} else {
			data = head.data;
			head = head.next;
		}
		return data;
	}

	//
	static void DFS(int a[][]) {
		DFSInMatrix stack = new DFSInMatrix();
		int h = a.length;
		int l = a[0].length;
		boolean visited[][] = new boolean[h][l];
		stack.push(0, 0);
		int row = 0, col = 0;
		int data[] = new int[2];
		while (!stack.isEmpty()) {
			data = stack.pop();
			row = data[0];
			col = data[1];
			if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col]) {
				continue;
			}
			visited[row][col] = true;
			System.out.print(a[row][col] + " ");
			stack.push(row, col + 1); // go right
			stack.push(row, col - 1); // go left
			stack.push(row + 1, col); // go down
			stack.push(row - 1, col); // go up
		}
	}

	public static void main(String[] args) {
		int a[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } 
		};
		
		DFS(a);
	}

}
