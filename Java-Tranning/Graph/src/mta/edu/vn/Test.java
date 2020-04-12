package mta.edu.vn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
	public void BFS(int[][] grid) {

		int h = grid.length;
		if (h == 0)
			return;
		int l = grid[0].length;

		boolean[][] visited = new boolean[h][l];

		Queue<String> queue = new LinkedList<>();

		queue.add(0 + "," + 0);

		System.out.println("Breadth-First Traversal: ");
		while (queue.isEmpty() == false) {

			String x = queue.remove();
			int row = Integer.parseInt(x.split(",")[0]);
			int col = Integer.parseInt(x.split(",")[1]);

			if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col])
				continue;

			visited[row][col] = true;
			System.out.print(grid[row][col] + " ");
			queue.add(row + "," + (col - 1)); // go left
			queue.add(row + "," + (col + 1)); // go right
			queue.add((row - 1) + "," + col); // go up
			queue.add((row + 1) + "," + col); // go down
		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("demo.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		Test d = new Test();
		d.BFS(a);
	}
}