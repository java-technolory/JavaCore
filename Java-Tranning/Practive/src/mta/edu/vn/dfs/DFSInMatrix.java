package mta.edu.vn.dfs;

public class DFSInMatrix {

	//
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
	private void push(int x, int y) {
		int data[] = { x, y };
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

	//
	private int[] peek() {
		if (isEmpty()) {
			return null;
		}
		return top.data;
	}

	// c1
	private static boolean[][] visited;

	static void DFSRecursion(int a[][], int x, int y) {
		int h = a.length;
		int l = a[0].length;
		int location[], row, col;
		DFSInMatrix stack = new DFSInMatrix();
		stack.push(x, y);
		while (!stack.isEmpty()) {
			location = stack.pop();
			row = location[0];
			col = location[1];
			if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col]) {
				continue;
			}
			visited[row][col] = true;
			System.out.print(a[row][col] + " ");
			DFSRecursion(a, row + 1, col);
			DFSRecursion(a, row, col + 1);
			DFSRecursion(a, row - 1, col);
			DFSRecursion(a, row, col - 1);
		}
	}

	// c2
	static void DFS(int a[][]) {
		int h = a.length;
		int l = a[0].length;
		int location[], row, col;
		boolean[][] visited = new boolean[h][l];
		DFSInMatrix stack = new DFSInMatrix();
		stack.push(0, 0);
		while (!stack.isEmpty()) {
			location = stack.pop();
			row = location[0];
			col = location[1];
			if (row < 0 || col < 0 || row >= h || col >= h || visited[row][col]) {
				continue;
			}
			visited[row][col] = true;
			System.out.print(a[row][col] + " ");
			stack.push(row, col + 1);
			stack.push(row, col - 1);
			stack.push(row - 1, col);
			stack.push(row + 1, col);
		}
	}

	public static void main(String[] args) {
		int a[][] = { //
				{ 1, 2, 3, 4 }, //
				{ 5, 6, 7, 8 }, //
				{ 9, 10, 11, 12 }, //
				{ 13, 14, 15, 16 }//
		};
		int h = a.length;
		int l = a[0].length;
		DFS(a);
		System.out.println("\n=============================");
		visited = new boolean[h][l];
		DFSRecursion(a, 0, 0);
	}

}
