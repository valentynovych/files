package org.example.task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("names.txt");
        String[] namesArray;
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {

            int chars;
            while ((chars = fileReader.read()) != -1){
                stringBuilder.append((char) chars);
            }

            Scanner scanner = new Scanner(stringBuilder.toString());
            namesArray = stringBuilder.toString().split(" ");
            chars = 0;
            while (scanner.hasNext()){
                namesArray[chars] = scanner.next();
                chars++;
            }

            for (String name : namesArray){
                System.out.println(name);
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
