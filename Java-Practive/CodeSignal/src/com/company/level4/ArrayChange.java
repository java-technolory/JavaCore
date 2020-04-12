package com.company.level4;

public class ArrayChange {

	public static void main(String[] args) {
		int inputArray [] = { -1000, 0, -2, 0 };
		arrayChange(inputArray);
	}

	static int arrayChange(int[] inputArray) {
		int sum = 0;

		int i = 1;
		while (i < inputArray.length) {

			if (inputArray[i - 1] >= inputArray[i]) {
				inputArray[i] = inputArray[i] + 1;
				sum++;
			} else {
				i++;
			}
		}

		return sum;
	}

}
