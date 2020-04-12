package com.company.level5;

public class ArrayMaximalAdjacentDifference {

	public static void main(String[] args) {
		int[] inputArray = { -1, 1, -3, -4};
		System.out.println(arrayMaximalAdjacentDifference(inputArray));

	}

	static int arrayMaximalAdjacentDifference(int[] inputArray) {
		int max = 0;
		int b = 0;
		for (int i = 0; i < inputArray.length-1; i++) {
			int c = Math.abs(inputArray[i] - inputArray[i + 1]);
			max = Math.max(b, c);
			b = max;
		}
		return max;
	}

}
