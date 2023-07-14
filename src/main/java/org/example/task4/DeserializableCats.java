package org.example.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializableCats {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cats.dat"))) {
            List<Cat> catList = (List<Cat>) ois.readObject();

            for (Cat cat : catList) {
                System.out.println(cat);
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
