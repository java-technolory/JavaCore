package com.company.level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreSimilar {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2 };
		int[] b = { 2, 3, 1 };
		System.out.println(areSimilar(a, b));
	}

	/*
	 * [147, 148, 279, 455, 533, 561, 570, 832, 894, 998] [147, 148, 279, 455, 533,
	 * 561, 570, 832, 894, 998]
	 * 
	 * [147, 148, 279, 455, 533, 561, 570, 832, 894, 998] [147, 148, 279, 455, 533,
	 * 561, 570, 832, 894, 998]
	 */

	static boolean areSimilar(int[] a, int[] b) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				list.add(i);
			}
		}

		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1 || list.size() > 2) {
			return false;
		} else if (list.size() == 2) {
			return a[list.get(0)] == b[list.get(1)] && a[list.get(1)] == b[list.get(0)] ? true : false;
		} else {
			return false;
		}
	}

	boolean areSimilar1(int[] a, int[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				sum++;
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b) && sum < 3;
	}

	boolean areSimilar2(int[] a, int[] b) {
		int rs = 0, s1 = 1, s2 = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				rs++;
			}
			s1 *= a[i];
			s2 *= b[i];
		}
		return rs <= 2 && s1 == s2;
	}

}
