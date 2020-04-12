package com.company.level4;

/*
 *  * * * * *
 *  * 1 2 3 *
 *  * 4 5 6 *
 *  * * * * *
 */

public class Test {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		char tmp[][] = new char[a.length + 2][a[0].length + 2];
		int k = 0, h = 0;
		System.out.println(tmp.length + "x" + tmp[0].length);
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[0].length; j++) {
				if (i == 0 | j == 0 | i == tmp.length - 1 || j == tmp[0].length - 1) {
					tmp[i][j] = '*';
					if (j == (tmp[0].length - 1) && i != 0) {
						k = 0;
						h++;
					}
				} else {
					tmp[i][j] = Character.forDigit(a[h][k], 10);
					k++;
				}
				System.out.print(tmp[i][j] + " ");
			}
			System.out.println();
		}
	}

//	static String [] input(int [] a) {
//		
//		return new String [];
//	}

}
