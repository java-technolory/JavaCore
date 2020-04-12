package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Java_BufferedReader {

	public static void main(String[] args) {
		String fileName = "text1.txt";
		readUsingBufferedReader(fileName, StandardCharsets.UTF_8);
		System.out.println("\n===============================================");
		readUsingBufferedReaderJava7(fileName, StandardCharsets.UTF_8);
		System.out.println("\n===============================================");
		readUsingScanner(fileName);
	}

	private static void readUsingBufferedReader(String filename, Charset cs) {
		try {
			File file = new File(filename);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, cs);
			BufferedReader br = new BufferedReader(isr);
			String line;
			System.out.println("Read text file using InputStreamReader");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readUsingBufferedReaderJava7(String filename, Charset cs) {
		Path path = Paths.get(filename);
		try {
			BufferedReader br = Files.newBufferedReader(path, cs);
			String line;
			System.out.println("\nRead text file using BufferedReader Java 7");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readUsingScanner(String filename) {
		Path path = Paths.get(filename);
		try {
			Scanner sc = new Scanner(path);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
