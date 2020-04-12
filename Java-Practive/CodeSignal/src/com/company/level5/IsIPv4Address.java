package com.company.level5;

import java.util.Arrays;
import java.util.regex.Pattern;

public class IsIPv4Address {

	public static void main(String[] args) {
		String inputString = ".254.255.0";
		System.out.println(isIPv4Address(inputString));
	}

	static boolean isIPv4Address(String inputString) {
		String[] str = inputString.split(Pattern.quote("."));
		if (str.length != 4) {
			return false;
		}
		for (String s : str) {
			if (!s.isEmpty() && s.length() < 4) {
				for (int i = 0; i < s.length(); i++) {
					if (!Character.isDigit(s.charAt(i))) {
						return false;
					}
				}
				int n = Integer.parseInt(s);
				if (n > 255) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	boolean isIPv4Address1(String inputString) {
		String[] splitString = inputString.split("[.]");
		if (splitString.length > 4) {
			return false;
		}
		for (String string : splitString) {
			if (string.isEmpty()) {
				return false;
			}
			if (!string.matches("[0-9]{1,3}")) {
				return false;
			}
			int number = Integer.parseInt(string);
			if (!(number >= 0 && number <= 255)) {
				return false;
			}
		}
		return true;
	}

}
