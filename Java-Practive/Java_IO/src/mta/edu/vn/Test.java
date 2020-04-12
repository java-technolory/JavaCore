package mta.edu.vn;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String fileName = "input1.txt";
		Path path = Paths.get(fileName);
		try {
			Scanner sc = new Scanner(path);
//			int[] ints = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
			for (int k = 0; k < 3; k++) {
				int n = sc.nextInt();
				System.out.println(n);
				for (int i = 0; i < n; i++) {
					System.out.print(sc.nextInt() + " ");
				}
				System.out.println();
//				n = sc.nextInt();
//				System.out.println("\n" + n);
//				for (int i = 0; i < n; i++) {
//					System.out.print(sc.nextInt() + " ");
//				}
//				System.out.println(n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
