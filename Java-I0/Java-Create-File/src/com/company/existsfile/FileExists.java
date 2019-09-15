package com.company.existsfile;

import java.io.File;
import java.io.IOException;

public class FileExists {
    public static void main(String[] args) {

        File file = new File("/home/x/Documents/Java/Java-IO/demo.txt");
        File notExist = new File("/home/x/Documents/Java/Java-IO/abc.txt");

        try {
            System.out.println(file.getCanonicalPath() + " exists? " + file.exists());
            System.out.println(file.getCanonicalPath() + " exists? " + notExist.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
