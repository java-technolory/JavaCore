package com.company.level3;

public class ReverseInParentheses {

	public static void main(String[] args) {
		String inputString = "(abc))";
		reverseInParentheses1(inputString);
	}

	/*
	 * Mục tiêu 
	 * thiết kế 
	 * kỹ thuật 
	 */
	static void reverseInParentheses1(String inputString) {
		String [] str = inputString.split("(, ?.@)");
		StringBuilder sb = new StringBuilder();
		int count = 0, h = 0, k = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) == '(') {
				h = i;
			}
			if(inputString.charAt(i) == ')') {
				
			}
		}
	}

	static String reverseInParentheses(String inputString) {
		String str = "";
		int count = 0;
		int k = 0;
		int s = 0;
		if (!inputString.contentEquals("g")) {
			char[] c = inputString.toCharArray();
			if (c[0] == '(' && c[1] == ')') {
				c[0] = c[1] = ' ';
			}
			if (c[c.length - 1] == ')' && c[c.length - 2] == '(') {
				c[c.length - 1] = c[c.length - 2] = ' ';
			}
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '(') {
					count = i;
					s++;
				}
				if (c[i] == ')') {
					k = i;
					if (c[i - 1] != ' ' && c[i - 2] != ' ') {
						for (int j = count; j <= k; j++) {
							if (k - j == 1 | k == j) {
								c[i] = ' ';
								c[i - 1] = ' ';
								i = 0;
								break;
							} else {
								char tmp = c[j];
								c[j] = c[k - 1];
								c[k - 1] = tmp;
								k--;
							}
						}
					} else {
						for (int j = count; j <= k; j++) {
							if (k - j == 1 | k == j) {
								c[i] = ' ';
								c[i - 3] = ' ';
								break;
							} else if (c[k - 1] != ' ') {
								j = count;
								char tmp = c[j];
								c[j] = c[k - 1];
								c[k - 1] = tmp;
								k--;
								count++;
							} else {
								k--;
							}
						}
					}
				}
			}
			for (int i = 0; i < c.length; i++) {
				if (c[i] != ' ') {
					str += c[i] + "";
				}
			}
			return str;
		} else {
			return "";
		}
	}

}
