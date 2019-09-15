package com.company.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyFileExample {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("/home/x/Documents/Java/Java-IO/sourceFile");
        Path targetPath = Paths.get("/home/x/Documents/Java/Java-IO/targetFile");

        try {
            Path path = Files.copy(sourcePath,targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Target file path: " + path);
            System.out.println("Copied content : \n" + new String(Files.readAllBytes(targetPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
