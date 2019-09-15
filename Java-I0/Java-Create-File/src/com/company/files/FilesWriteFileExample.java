package com.company.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesWriteFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/x/Documents/Java/Java-IO/demo.txt");
        try {
            String str = "This is write file example";
            byte[] bs = str.getBytes();
            Path writenFilePath = Files.write(path, bs);
            System.out.println(".... : " + writenFilePath);
            System.out.println("Written content in file : \n" + new String(Files.readAllBytes(writenFilePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
