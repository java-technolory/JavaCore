package com.company;

public class StringBuffer_Reverse {

	static boolean checkPalindrome(String inputString) {
		StringBuffer sb = new StringBuffer(inputString);
		String str = sb.reverse().toString();
		if (str.equals(inputString)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrome("aabbaa"));
	}
}
