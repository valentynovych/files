package org.example.task4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializableCats {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "British", 3.45);
        Cat cat1 = new Cat("Myrchik", "Dvorovoi", 2.79);
        Cat cat3 = new Cat("Myrka", "Domashnia", 4.25);
        List<Cat> catList = List.of(cat, cat1, cat3);
        serializableCats(catList);
    }

    private static void serializableCats(List<Cat> catList){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cats.dat"))) {
            oos.writeObject(catList);
            System.out.println("Success serializable cats list to file ");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
