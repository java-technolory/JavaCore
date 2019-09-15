package com.company.sizefile;

import java.io.File;

public class JavaGetFileSize {

    static final String FILE_NAME = "/home/x/Documents/Java/Java-IO/mozilla.pdf";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        if (!file.exists() || !file.isFile()) {
            return;
        }
        System.out.println(getFileSizeMegaBytes(file));
        System.out.println(getFileSizeKiloBytes(file));
        System.out.println(getFileSizeBytes(file));
    }

    public static String getFileSizeMegaBytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";
    }

    public static String getFileSizeKiloBytes(File file) {
        return (double) file.length() / 1024 + " kb";
    }

    public static String getFileSizeBytes(File file) {
        return (double) file.length() / 1024 + " bytes";
    }

}
