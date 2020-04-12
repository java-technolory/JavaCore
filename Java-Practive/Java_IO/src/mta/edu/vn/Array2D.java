package mta.edu.vn;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
//		input3();
//		input4();
//		input5();
		input6();
	}

	static void input3() {
		Path path = Paths.get("input3.txt");
		String[][] array = new String[3][3];
		int i, j;
		i = 0;
		try {
			Scanner sc = new Scanner(path);
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] a = line.trim().split("\\s");
				for (j = 0; j < a.length; j++) {
					array[i][j] = a[j];
				}
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (i = 0; i < 3; i++) {
			int k = 3;
			for (j = 0; j < 3; j++) {
				if (i % 2 == 0) {
					System.out.print(array[i][j]);
				} else {
					System.out.print(array[i][k - 1]);
					k--;
				}
			}
			System.out.printf(" ");
		}
	}

	static void input4() {
		Path path = Paths.get("input4.txt");
		int i, j;
		j = 0;
		String[][] array = new String[3][3];
		try {
			Scanner sc = new Scanner(path);
			while (sc.hasNext()) {
				String[] a = sc.nextLine().split("\\s");
				for (i = 0; i < a.length; i++) {
					array[i][j] = a[i];
				}
				j++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(array[i][j]);
			}
			System.out.printf(" ");
		}

	}

	static void input5() {
		Path path = Paths.get("input5.txt");
		String[][] array = new String[3][3];
		int i, j;
		j = 0;
		try {
			Scanner sc = new Scanner(path);
			while (sc.hasNext()) {
				String a[] = sc.nextLine().split("\\s");
				for (i = 0; i < a.length; i++) {
					array[i][j] = a[i];
				}
				j++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		int k = 3;
		for (i = 0; i < 3; i++) {
			k = 3;
			for (j = 0; j < 3; j++) {
				if (i % 2 == 0) {
					System.out.printf(array[i][j]);
				} else {
					System.out.printf(array[i][k - 1]);
					k--;
				}
			}
			System.out.printf(" ");
		}
	}

	static void input6() {
		Path path = Paths.get("input6.txt");
		String[][] array = new String[3][3];
		int j;
		try {
			Scanner sc = new Scanner(path);
			while (sc.hasNext()) {
				String[] a = sc.nextLine().split("\\s");
				j = 0;
				for (int i = 0; i < a.length; i++) {
					if (i % 2 == 0) {
						array[i][j] = a[i];
						System.out.print(a[i]);
					} else {
						
					}
					j++;
				}
//				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
