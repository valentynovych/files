package org.example.task1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename for search : ");
        String fileName = scanner.next();

        String rootCatalog = "src/main/java/org/example/";
        File catalog = new File(rootCatalog + "folder1");

        List<File> fileList = searchFiles(catalog, new ArrayList<>(), fileName);
        if (!fileList.isEmpty()) {
            for (File file : fileList) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("File not found !");
        }
    }

    private static List<File> searchFiles(File rootFile, List<File> fileList, String fileName) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList, fileName);
                    } else if (file.getName().contains(fileName)) {
                        fileList.add(file);
                    }
                }
            }
        }
        return fileList;
    }
}