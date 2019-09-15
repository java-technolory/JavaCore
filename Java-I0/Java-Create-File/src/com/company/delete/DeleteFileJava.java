package com.company.delete;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileJava {

    public static void main(String[] args) {

        Path path = Paths.get("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam");

        File file1 = new File("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam/a.txt");
        if (file1.delete()) {
            System.out.println("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam File Delted ...");
        } else {
            System.out.println("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam doesn't exists");
        }

        Path path1 = Paths.get("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam/b.txt");
        try {
            if (Files.deleteIfExists(path1)) {
                System.out.println("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam/b.txt file deleted");
            } else {
                System.out.println("/home/x/Documents/Java/Java-IO/Xin/Chao/Viet/Nam/b.txt doesn't exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //show all file or directory flowing path
        File[] listFile = path.toFile().listFiles();
        for (File file : listFile) {
            System.out.println(file.getName());
        }

    }
}
