package com.company.create;

import java.io.FileOutputStream;
import java.io.IOException;

// FileOutputStream.write(byte [] b): create new file and write some data into file.
public class CreateFileWithFileOutputStream {
    public static void main(String[] args) throws IOException {
        String data = "Phan Van Hai";
        FileOutputStream fos = new FileOutputStream("name.txt");
        fos.write(data.getBytes());
        System.out.println(data.getBytes());
        fos.flush();
        fos.close();
    }
}
