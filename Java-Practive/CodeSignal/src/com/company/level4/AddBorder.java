package com.company.level4;

public class AddBorder {

	public static void main(String[] args) {
		String[] picture = { "a" };
		String str [] = addBorder(picture);
		for(String s: str) {
			System.out.println(s);
		}
	}

	String[] addBorder1(String[] picture) {
	    String[] framedPicture = new String[picture.length + 2];

	    for(int i = 0 ; i < picture.length ; i++) {
	        framedPicture[i+1] = '*' + picture[i] + '*';
	    }
	    
	    framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");
	    
	    return framedPicture;
	}
	
	static String[] addBorder(String[] picture) {

		String sc = "";
		String[] tmp = new String[picture.length + 2];
		System.out.println(tmp.length + " - ");
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < picture[0].length()+2; j++) {
				if (i == 0 || j == 0 || i == tmp.length - 1 || j == picture[0].length() + 1) {
					sc +="*";
					continue;
				} 
				if(j == picture[0].length() && i != 0) {
					sc += picture[i-1];
				}
			}
			tmp[i] = sc;
			sc = "";
		}

		return tmp;

//		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		char tmp[][] = new char[a.length + 2][a[0].length + 2];
//		int k = 0, h = 0;
//		System.out.println(tmp.length + "x" + tmp[0].length);
//		for (int i = 0; i < tmp.length; i++) {
//			for (int j = 0; j < tmp[0].length; j++) {
//				if (i == 0 | j == 0 | i == tmp.length - 1 || j == tmp[0].length - 1) {
//					tmp[i][j] = '*';
//					if (j == (tmp[0].length - 1) && i != 0) {
//						k = 0;
//						h++;
//					}
//				} else {
//					tmp[i][j] = Character.forDigit(a[h][k], 10);
//					k++;
//				}
//				System.out.print(tmp[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
