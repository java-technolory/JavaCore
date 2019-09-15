package com.member.inner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        FileOutputStream fos = new FileOutputStream("text.txt");
        File txt = new File("text.txt");
        Scanner scanner = null;
        scanner =new Scanner(txt);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
