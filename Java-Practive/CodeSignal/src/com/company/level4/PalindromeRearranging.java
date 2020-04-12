package com.company.level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeRearranging {

	public static void main(String[] args) {
//		String inputString = "abdhuierf";
//		System.out.println(palindromeRearranging(inputString));
		int i = 0;
		for (char c = 'A'; c <= 'z'; c++) {
			if (i <= 10) {
				System.out.println(c + " - " + (int)c);
				i++;
			} else {
				i = 0;
				System.out.print("");
			}

		}

	}

	boolean palindromeRearranging1(String inputString) {

		int[] niz = new int[26];

		for (int i = 0; i < inputString.length(); i++)
			niz[inputString.charAt(i) - 97]++;

		int cnt = 0;
		for (int i = 0; i < niz.length; i++)
			if (niz[i] % 2 != 0)
				cnt++;

		return cnt <= 1;
	}

	static boolean palindromeRearranging(String inputString) {
		char[] c = inputString.toCharArray();
		int[] a = new int[c.length];
		List<Character> list = new ArrayList<Character>();
		for (char ch : c) {
			list.add(ch);
		}
		String s = "";
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i] == list.get(j)) {
					count++;
					list.set(j, '-');
				}
			}
			if (count > 0) {
				a[i] = count;
				count = 0;
			} else {
				count = 0;
			}
		}

		count = 0;
		int k = 0;
		for (int n : a) {
			if (n == 1) {
				count++;
			}
			if (count > 1) {
				return false;
			} else {
				if (n % 2 != 0) {
					k++;
				}
			}
		}
		if (k > 1) {
			return false;
		}
		return true;
	}

}
