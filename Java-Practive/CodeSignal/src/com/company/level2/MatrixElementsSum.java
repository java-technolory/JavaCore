package com.company.level2;

public class MatrixElementsSum {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };
//		System.out.println(matrix.length + "x" + matrix[0].length);
		System.out.println(matrixElementsSum(matrix));
	}

	static int matrixElementsSum(int[][] matrix) {
		int count = 0;
		for (int j = 0; j < matrix[0].length; ++j)
			for (int i = 0; i < matrix.length; ++i) {
				if (matrix[i][j] > 0) {
					count += matrix[i][j];
				} else {
					break;
				}
			}
		return count;
	}

	static int matrixElementsSum2(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0 && matrix[i][j] != 0) {
					sum += matrix[i][j];
				} else {
					if (i >= 2) {
						if (matrix[i][j] != 0 && matrix[i - 1][j] != 0 && matrix[i - 2][j] != 0) {
							sum += matrix[i][j];
						}
					} else {
						if (matrix[i][j] != 0 && matrix[i - 1][j] != 0) {
							sum += matrix[i][j];
						}
					}
				}
			}
		}
		return sum;
	}

}