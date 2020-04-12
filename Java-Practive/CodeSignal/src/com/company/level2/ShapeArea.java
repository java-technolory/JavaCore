package com.company.level2;

public class ShapeArea {

	public static void main(String[] args) {
		int kq = shapeArea(5);
		System.out.println("Kq = " + kq);
	}

	static int shapeArea(int n) {
		if (n == 1 || n == 0) {
			return (n == 1 ? 1 : 0);
		}
		int result = 2 * (n * n - n) + 1;
		return result;
	}

}
