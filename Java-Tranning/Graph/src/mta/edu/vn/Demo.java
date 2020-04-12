package mta.edu.vn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demo {
	public boolean BFS(int[][] grid) {

		int h = grid.length;
		if (h == 0) {
			return false;
		}
		int l = grid[0].length;

		boolean[][] visited = new boolean[h][l];

		Queue<String> queue = new LinkedList<>();

		System.out.println("Breadth-First Traversal: ");
		int i = 1;
		boolean check = false;
		String x;
		int count[] = new int[l+1];
		int row, col;
		int p = 0, q = 0, j = 0;
		while (i <= h) {
			while (true) {
				check = false;

				//
				for (q = 0; q < h; q++) {
					for (p = 0; p < h; p++) {
						if (visited[q][p] == false && grid[q][p] == i) {
							queue.add(q + "," + p);
							check = true;
							break;
						}
					}
					if (check) {
						break;
					}
				}

				if (queue.isEmpty()) {
					break;
				}
				//
				check = false;
				while (!queue.isEmpty()) {
					x = queue.remove();
					row = Integer.parseInt(x.split(",")[0]);
					col = Integer.parseInt(x.split(",")[1]);

					if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col] || grid[row][col] != i) {
						continue;
					}
					visited[row][col] = true;
					if (row >= 0 && col >= 1 && grid[row][col - 1] == i && !visited[row][col - 1]) {
						check = true;
						System.out.println(visited[row][col]);
						queue.add(row + "," + (col - 1));
					}
					if (row >= 0 && col >= 0 && col < h - 1 && grid[row][col + 1] == i && !visited[row][col + 1]) {
						check = true;
						queue.add(row + "," + (col + 1));
						System.out.println(visited[row][col]);
					}
					if (row >= 1 && col >= 0 && grid[row - 1][col] == i && !visited[row - 1][col]) {
						check = true;
						queue.add((row - 1) + "," + (col));
						System.out.println(visited[row][col]);
					}
					if (row >= 0 && col >= 0 && row < h - 1 && grid[row + 1][col] == i && !visited[row + 1][col]) {
						check = true;
						queue.add((row + 1) + "," + (col));
						System.out.println(visited[row][col]);
					}
				}
				//

				count[i] = count[i] + 1;
			}
			if (i >= 2 && count[i] != count[i - 1]) {
				return false;
			}
			i++;
		}
		return true;
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
		Demo d = new Demo();
		d.BFS(a);
	}
}