package com.company.delete;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JavaDeleteDirectoryRecursively {
    public static void main(String[] args) {
        Path path = Paths.get("/home/x/Documents/Java/Java-IO/Phan");
        File[] files = path.toFile().listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        try {
            Files.walkFileTree(path, new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
                    System.out.println("Pre Visit Directory : " + path);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
                    System.out.println("Visit File : " + path);
                    Files.delete(path);         // this will work because it's always a File
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path path, IOException e) throws IOException {
                    System.out.println("Visit Failed File : " + path);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path path, IOException e) throws IOException {
//                    System.out.println("Post Visit Directory : " + path);
                    // Chỉ xoá được thư mục khi thư mục đó rỗng ngươc lại thì sẽ throws DirectoryNotEmptyException.
                    Files.delete(path);         // this will work because Files in the directory are already deleted
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
