package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class QuaTet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;

		n = sc.nextInt();
		m = sc.nextInt();
		int a[] = new int[m];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);
		int minus = (m - n) + 1;
		int min = 0;
		int b = a[n - 1] - a[0];
		int c = b;
		for (int j = 0; j < minus - 1; j++) {
			int f = a[n] - a[j + 1];
			min = Math.min(b, f);
			if(min <= 1) {
				continue;
			}
			b = min;
			n++;
			System.out.println("-" + min);
		}
		System.out.println(b);
//		for (int j = 0; j < minus - 1; j++) {
//			int f = a[n] - a[j + 1];
//			min = Math.min(b, f);
//			b = min;
//			n++;
//			if (f == 0 || f > c || f <= 4) {
//				continue;
//			}
//			c = f;
//			System.out.println("-" + min);
//		}
//		if (min == 0) {
//			System.out.println(c);
//		} else {
//			System.out.println(min);
//		}
	}

}
