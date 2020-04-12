package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * - Java File load toàn bộ nội dung file vào bộ nhớ ram - Chỉ sử dụng phù hợp
 * với file có kích thước nhỏ và cần toàn bộ dữ liệu của file được nạp vào bộ
 * nhớ ram.
 * 
 * @author x
 *
 */

public class Java_Files {

	public static void main(String[] args) {
		Path path = Paths.get("text1.txt");
		try {
			byte[] bytes = Files.readAllBytes(path);
			List<String> allLine = Files.readAllLines(path, StandardCharsets.UTF_8);
			Iterator itr = allLine.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			//
			System.out.println("===============================================");
			for (int i = 0; i < bytes.length; i++) {
				System.out.print((char) bytes[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
