package com.company.delete;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JavaDeleteDirectory {
    public static void main(String[] args) {
        Path path = Paths.get("/home/x/Documents/Java/Java-IO/Phan/");

        try {
            Files.walkFileTree(path, new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
                    System.out.println("Pre Visit Directory : " + path.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
                    System.out.println("Visit File : " + path.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path path, IOException e) throws IOException {
                    System.out.println("Visit File Failed : " + path.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path path, IOException e) throws IOException {
                    System.out.println("Post Visit Directory : " + path.getFileName());
                    return FileVisitResult.CONTINUE;
                }

            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (path.toFile().isDirectory()) {
            File[] listFiles = path.toFile().listFiles();
            for (File file : listFiles) {
                System.out.println("Delete " + file.getName());
//                file.delete();
            }
        } else {
            System.out.println("Not a directory. Do nothing");
        }

        //now directory is empty, so we can delete it
        System.out.println("Deleting Directory. Success = " + path.toFile().delete());
    }
}
