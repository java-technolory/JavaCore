package com.company.sizefile;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaGetFileSizeUsingFileChannel {

    static final String FILE_NAME = "/home/x/Documents/Java/Java-IO/mozilla.pdf";

    public static void main(String[] args) {
        Path path = Paths.get(FILE_NAME);
        FileChannel fileChannel;
        try {
            fileChannel = FileChannel.open(path);
            long fileSize = fileChannel.size();
            System.out.println(fileSize + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
