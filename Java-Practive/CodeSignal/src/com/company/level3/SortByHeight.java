package com.company.level3;

public class SortByHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1, 150, 190, 170, -1, -1, 160, 180 };
		sortByHeight(a);
	}

	static int[] sortByHeight(int[] a) {
		int array[] = a;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < 0) {
					break;
				}
				if (array[j] < 0) {
					continue;
				}
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

}
