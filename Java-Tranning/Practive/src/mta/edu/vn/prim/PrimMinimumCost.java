package mta.edu.vn.prim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimMinimumCost {

	private static boolean visited[];
	private static int parent[];
	private static int w[];

	//
	private static int extracMin(int n) {
		int min = Integer.MAX_VALUE;
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (min > w[i] && !visited[i]) {
				min = w[i];
				index = i;
			}
		}
		return index;
	}

	//
	private static void algorithmPrim(int a[][], int n) {
		int x = 0;
		int v = 0;
		visited[x] = true;
		w[x] = 0;
		while (v < n) {
			for (int i = 0; i < n; i++) {
				if (a[x][i] != 0 && !visited[i] && a[x][i] < w[i]) {
					parent[i] = x;
					w[i] = a[x][i];
				}
			}
			int min = extracMin(n);
			visited[min] = true;
			x = min;
			v++;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("prim.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			visited = new boolean[n];
			parent = new int[n];
			w = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
				visited[i] = false;
				parent[i] = -1;
				w[i] = Integer.MAX_VALUE;
			}

			//
			algorithmPrim(a, n);

			//

		}
	}

}
