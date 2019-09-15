package com.company.files;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class FilesReadFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/x/Documents/Java/Java-IO/file.txt");
        try {
            byte[] bs = Files.readAllBytes(path);
            List<String> strings = Files.readAllLines(path);
            System.out.println("Read bytes: \n" + new String(bs));
            System.out.println("Read lines: \n" + strings);
            Iterator<String> itr = strings.iterator();
            while (itr.hasNext()) {
                System.out.println("... :: " + itr.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
