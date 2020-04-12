package mta.edu.vn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimAlgorithm {

	static int V[];
	static int W[];
	static int P[];
	static boolean visited[];

	static int extractMin() {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 1; i < W.length; i++) {
			if (W[i] < min && visited[i] == false) {
				min = W[i];
				index = i;
			}
		}
		return index;
	}

	static void Prim(int a[][], int n) {
		int v = 0;
		W[0] = 0;
		visited[0] = true;
		int count = 0;
		while (v < n) {
			for (int i = 0; i < n; i++) {
				if (a[count][i] != 0 && visited[i] == false) {
					if (W[i] > a[count][i]) {
						W[i] = a[count][i];
						P[i] = count;
					}
				}
			}
			int min = extractMin();
			visited[min] = true;
			count = min;
			v++;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("prim.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			V = new int[n];
			P = new int[n];
			W = new int[n];
			visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
				V[i] = i;
				P[i] = -1;
				W[i] = Integer.MAX_VALUE;
			}

			//
			Prim(a, n);

			//

			//

			int sum = 0;
			for (int i = 0; i < n; i++) {
				System.out.println(W[i]);
				sum += W[i];
			}

			System.out.println("Case #" + t + "\n" + sum);
			//
		}
	}

}
