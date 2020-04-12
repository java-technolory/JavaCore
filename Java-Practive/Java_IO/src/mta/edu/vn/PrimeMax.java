package mta.edu.vn;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrimeMax {

	static boolean isCheck(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void input() {
		Scanner sc = new Scanner(System.in);
		int N, T;
		int temp = 2;
		int a[] = new int[100];
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
		}
		for (int k = 0; k < T; k++) {
			for (int j = 2; j <= a[k]; j++) {
				if (isCheck(j) && j > temp) {
					temp = j;
				}
			}
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		Path path = Paths.get("input2.txt");
		int count = 0;
		int temp = 2;
		try {
			Scanner sc = new Scanner(path);
			for (int h = 0; h < 1; h++) {
				int T = sc.nextInt();
				count = count + 1;
				for (int i = 0; i < T; i++) {
					int N = sc.nextInt();

					for (int j = N; j >= 2; j--) {
						if (isCheck(j)) {
//							temp = j;
							System.out.println(j);
							break;
						}
					}
//					System.out.println("#" + count + " " + temp);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

//		input();
	}

}
