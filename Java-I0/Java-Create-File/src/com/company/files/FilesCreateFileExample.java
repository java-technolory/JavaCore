package com.company.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateFileExample {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/home/x/Documents/Java/Java-IO/demo.txt");
//        Files.createFile(path);
        Path path = Files.createFile(file);
        System.out.println("File created at path: " + path);
    }
}
