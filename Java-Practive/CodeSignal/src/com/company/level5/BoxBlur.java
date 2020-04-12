package com.company.level5;

public class BoxBlur {

	public static void main(String[] args) {
		int[][] image = { { 7, 4, 0, 1 }, { 5, 6, 2, 2 }, { 6, 10, 7, 8 }, { 1, 4, 2, 0 } };
		boxBlur(image);
	}

	static int[][] boxBlur(int[][] image) {
		int[][] tmp = new int[image.length - 2][image[0].length - 2];
		int sum = 0;
		int b = 0;
		for (int k = 0; k < tmp.length; k++) {
			for (int h = 0; h < tmp[0].length; h++) {
				for (int i = k; i < 3+k; i++) {
					for (int j = h; j < 3+h; j++) {
						sum += image[i][j];
					}
				}
				b = (sum / 9);
				tmp[k][h] = b;
				sum = 0;
			}
		}

		return tmp;
	}

}
