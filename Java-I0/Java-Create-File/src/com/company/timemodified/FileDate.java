package com.company.timemodified;

import java.io.File;
import java.util.Date;

public class FileDate {
    public static void main(String[] args) {
        File file = new File("name.txt");
        long timestamp = file.lastModified();
        System.out.println("name.txt last modified date = " + new Date(timestamp));
    }
}
