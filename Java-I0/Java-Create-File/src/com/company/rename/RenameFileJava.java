package com.company.rename;

import java.io.File;
import java.io.IOException;

public class RenameFileJava {
    public static void main(String[] args) {
        //absolute path rename file
        File file = new File("/home/x/Documents/Java/Java-IO/Phan/java.txt");
        File newFile = new File("/home/x/Documents/Java/Java-IO/Phan/newjava.txt");
        if (file.renameTo(newFile)) {      // true
            System.out.println("File rename success");
        } else {
            System.out.println("File rename failsed");
        }

        //relative path rename file
        file = new File("DB.properties");
        try {
            file.createNewFile();
            newFile = new File("DB_NEW.properties");
            if(file.renameTo(newFile)){     //true
                System.out.println("File rename success");
            } else {
                System.out.println("File rename failsed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //move file from one directory to another
        file = new File("/home/x/Documents/Java/Java-IO/targetFile");
        newFile = new File("NEW_targetFile");
        if(file.renameTo(newFile)){     //false
            System.out.println("File move success");
        }else {
            System.out.println("File move failsed");
        }

        //when source file is not present
        file = new File("/home/x/Documents/Java/Java-IO/demo.txt");
        newFile = new File("demo.properties");
        if (file.renameTo(newFile)){    //false
            System.out.println("File move success");
        } else {
            System.out.println("File move failsed");
        }

        //when destination already have a file with same name
        file = new File("/home/x/Documents/Java/Java-IO/export.sql");
        newFile = new File("/home/x/Documents/Java/Java-IO/java1.txt");
        if (file.renameTo(newFile)){    //true
            System.out.println("File move success");
        } else {
            System.out.println("File move failsed");
        }

    }
}
