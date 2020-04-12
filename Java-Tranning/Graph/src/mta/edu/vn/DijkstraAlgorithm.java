package mta.edu.vn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DijkstraAlgorithm {

	static int V[];
	static int P[];
	static int W[];
	static boolean visited[];
	private static Scanner sc;

	static int extractMin() {
		int index = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < W.length; i++) {
			if (W[i] < min && visited[i] == false) {
				min = W[i];
				index = i;
			}
		}
		return index;
	}

	static void printPath() {
		int start = 0, count = 0;
		int n = P.length;
		while (start < n) {
			count = start;
			System.out.print(count + " ");
			while (true) {
				if (P[count] == -1) {
					break;
				}
				System.out.print(P[count] + " ");
				count = P[count];
			}
			System.out.println(" {" + W[start] + "}");
			start++;
		}
	}

	static void Dijkstra(int a[][], int n) {
		visited[0] = true;
		W[0] = 0;
		int start = 0;
		int count = 0;
		int m, min;
		while (start < n) {
			for (int i = 0; i < n; i++) {
				if (a[count][i] != 0 && visited[i] == false) {
					m = W[count] + a[count][i];
					if (W[i] > m) {
						W[i] = m;
						P[i] = count;
					}
				}
			}

			min = extractMin();
			visited[min] = true;
			count = min;
			start++;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("dijkstra.txt"));
		sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			V = new int[n];
			P = new int[n];
			W = new int[n];
			visited = new boolean[n];
			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
				V[i] = i;
				P[i] = -1;
				W[i] = Integer.MAX_VALUE;
			}

			//
			Dijkstra(a, n);
			//

			printPath();
			//

			//

		}
	}

}
