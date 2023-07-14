package org.example.serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOS = new ObjectOutputStream(new FileOutputStream("person.dat"))) {

            Person person = new Person("Person name", 24, 175.4, true);
            objectOS.writeObject(person);
            System.out.println("Success serializable object " + person);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream objectIS = new ObjectInputStream(new FileInputStream("person.dat"))) {

            Person person = (Person) objectIS.readObject();
            System.out.println("Success read object from file ");
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
