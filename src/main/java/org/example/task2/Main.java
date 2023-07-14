package org.example.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some names separated on just one space");

        String names = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter("names.txt")) {
            fileWriter.write(names);

            System.out.println("Success writing to file ");
        } catch (IOException e) {
            System.err.print("Error writing file");
            System.out.println(e.getMessage());
        }
    }
}
