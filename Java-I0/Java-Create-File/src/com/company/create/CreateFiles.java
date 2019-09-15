package com.company.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateFiles {
    public static void main(String[] args) throws IOException {
        String data = "Phan Thi Mai";
//        Path path = Paths.get("name.txt");
//        Files.write(path, data.getBytes());
        // Files.write(): create a new file and write some data into it.
        Files.write(Paths.get("name.txt"), data.getBytes());
    }
}
