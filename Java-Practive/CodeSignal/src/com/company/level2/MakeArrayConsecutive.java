package com.company.level2;

import java.util.Arrays;

public class MakeArrayConsecutive {

	// main 
	public static void main(String[] args) {
		int statues[] = { 5, 4, 6 };
		System.out.println(makeArrayConsecutive2(statues));
		System.out.println(makeArrayConsecutive1(statues));
	}

	// cách 1
	static int makeArrayConsecutive1(int[] statues) {
		Arrays.parallelSort(statues);
		int n = statues[statues.length - 1] - statues[0];
		return n - statues.length + 1;
	}

	// cách 2
	static int makeArrayConsecutive2(int[] statues) {
		int[] a = statues;
		Arrays.parallelSort(a);
		int n = a[a.length - 1];
		int[] tmp = new int[n + 1];
		int count = 0;

		//
		for (int i = 0; i < a.length; i++) {
			tmp[a[i]]++;
		}

		//
		for (int k = a[0]; k < tmp.length; k++) {
			if (tmp[k] == 0) {
				count++;
			}
		}

		return count;
	}

}
