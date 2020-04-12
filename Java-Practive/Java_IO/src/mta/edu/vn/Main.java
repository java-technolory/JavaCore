package mta.edu.vn;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		String fileName = "input1.txt";
		Path path = Paths.get(fileName);
		Scanner sc = new Scanner(path);
		int s = 0;
		int n = 0;
		while (sc.hasNextInt()) {
			int line = sc.nextInt();
			
//			s = s + 1;
//			String line = sc.nextLine();
//			if (s % 2 == 0) {
//				String[] a = line.split("\\s");
//				for (int i = 0; i < a.length; i++) {
//					System.out.println(Integer.parseInt(a[i]));
//				}
//				n = 0;
//			}
			System.out.print(line);
		}
		sc.close();
	}

}
