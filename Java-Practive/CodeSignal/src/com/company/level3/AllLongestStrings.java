package com.company.level3;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {

	public static void main(String[] args) {
		String[] inputArray = { "aba", "aa", "ad", "cdc", "aba" };
//		allLongestStrings(inputArray);

		String l = ""; // full string with "-" separator

		for (String s : inputArray) {
			System.out.println(l.indexOf("-"));
			// length is first index of substring
			// if list has same size strings, add this one
			if (l.indexOf("-") == s.length()) {
				l += s + "-";
			}
			// reset if list has smaller strings
			else if (l.indexOf("-") < s.length()) {
				l = s + "-";
			}
		}

//		return l.split("-");

	}

	static String[] allLongestStrings(String[] inputArray) {
		String strMax = "";
		String[] result;
		List<String> list = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() > strMax.length()) {
				strMax = inputArray[i];
			}
		}

		for (int j = 0; j < inputArray.length; j++) {
			if (inputArray[j].length() >= strMax.length()) {
				list.add(inputArray[j]);
			}
		}
		result = new String[list.size()];
		for (String str : list) {
			result[count] = list.get(count);
			count++;
		}

		return result;
	}

}
