package com.company.level2;

public class AdjacentElements {

	public static void main(String[] args) {
		int[] inputArray = { 3, 6, -2, -5, 7, 3};
		int max = adjacentElementsProduct(inputArray);
		System.out.println("Max = " + max);
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int[] a = inputArray;
		int max = a[0]*a[1];
		for (int i = 1; i < inputArray.length - 1; i++) {
			int tmp = a[i]*a[i+1];
			if (tmp > max) {
				max = tmp;
			}
		}
		return max;
	}

}
