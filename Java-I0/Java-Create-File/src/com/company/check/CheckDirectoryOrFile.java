package com.company.check;

import java.io.File;
import java.io.IOException;

public class CheckDirectoryOrFile {
    public static void main(String[] args) {
        File file = new File("/home/x/Documents/Java/Java-IO/demo.txt");
        File dir = new File("/home/x/Documents/Java/Java-IO");
        File notExists = new File("/home/x/Documents/Java/Java-IO/targetFiles");

        try {
            System.out.println(file.getCanonicalPath() + " ? " + file.isFile());
            System.out.println(file.getCanonicalPath() + " ? " + file.isDirectory());

            System.out.println(dir.getCanonicalPath() + " ? " + dir.isFile());
            System.out.println(dir.getCanonicalPath() + " ? " + dir.isDirectory());

            System.out.println(notExists.getCanonicalPath() + " ? " + notExists.isFile());
            System.out.println(notExists.getCanonicalPath() + " ? " + notExists.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
