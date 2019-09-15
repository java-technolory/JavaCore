package com.company.extensionfile;

import java.io.File;

public class GetFileExtension {
    public static void main(String[] args) {
        File file = new File("/home/x/Documents/Java/Java-IO/mozilla.pdf");
        System.out.println("File extension : " + getFileExtension(file));

        file = new File("/home/x/Documents/Java/Java-IO/demo.txt");
        System.out.println("File extension : " + getFileExtension(file));

        file = new File("/home/x/Documents/Java/Java-IO/targetFile");
        System.out.println("File extension : " + getFileExtension(file));
    }

    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }
}
