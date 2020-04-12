package mta.edu.vn;

import java.util.*;

public class Demo {

	private static Scanner sc;

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

	public static void main(String[] args) {
		sc = new Scanner(System.in);
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
			temp = 2;
		}
	}

}
