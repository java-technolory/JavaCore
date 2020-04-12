package com.company.level3;

public class CommonCharacterCount {

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "adcaa";
		System.out.println(test(s1, s2));
	}

	static int test(String s1, String s2) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				count++;
				s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
			}
		}
		return count;
	}

	static int commonCharacterCount(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count = 0;
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					count++;
					c2[j] = '-';
					break;
				}
			}
		}
		return count;
	}

	int commonCharacterCount1(String s1, String s2) {
		int[] a = new int[26], b = new int[26];
		for (char c : s1.toCharArray())
			a[c - 'a']++;
		for (char c : s2.toCharArray())
			b[c - 'a']++;
		int s = 0;
		for (int i = 0; i < 26; ++i)
			s += Math.min(a[i], b[i]);
		return s;

	}

	int commonCharacterCount2(String s1, String s2) {
		int counter = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				counter++;
				s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
			}
		}
		return counter;
	}

}
