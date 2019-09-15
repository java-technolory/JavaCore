package com.company.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateDirectoriesExample {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/x/Documents/Java/Java-IO/Phan");
        Path path2 = Paths.get("/home/x/Documents/Java/Java-IO/Phan/Van");
        Path path3 = Paths.get("/home/x/Documents/Java/Java-IO/Phan/Van/Hai");
        Path path4 = Paths.get("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam");

        try {
            Path createDir1 = Files.createDirectories(path1);
            Path createDir2 = Files.createDirectories(path2);
            Path createDir3 = Files.createDirectories(path3);
            Path createDir4 = Files.createDirectories(path4);
            System.out.println("First Level Directory Created at Path: " + createDir1);
            System.out.println("Second Level Directory Created at Path: " + createDir2);
            System.out.println("Thrid Level Directory Created at Path: " + createDir3);
            System.out.println("All Level Directory Created at Path: " + createDir4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
