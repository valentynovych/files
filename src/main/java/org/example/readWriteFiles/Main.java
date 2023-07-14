package org.example.readWriteFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Test text";
        try (FileOutputStream fileOS = new FileOutputStream("test.txt")) {

            byte[] bytes = text.getBytes();

            fileOS.write(bytes, 0, bytes.length);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------");
        try (FileInputStream fileIS = new FileInputStream("test.txt")) {

            byte[] inputBytes = fileIS.readAllBytes();
            for (int i = 0; i < inputBytes.length; i++){
                System.out.print((char) inputBytes[i]);
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //------------------------------------------

        try (FileWriter fileWriter = new FileWriter("test.txt")) {

            fileWriter.write(text);

            fileWriter.append('\n');
            fileWriter.append('1');
            fileWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n----------------------------");
        try (FileReader fileReader = new FileReader("test.txt")) {
            int symbol;
            while ((symbol = fileReader.read()) !=-1){
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------------------");
        String text1;
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            text1 = "";
            while (scanner.hasNextLine()) {
                text1 += scanner.nextLine() + "\n";
            }
            System.out.println(text1);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
