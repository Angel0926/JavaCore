package Homework.FoutputInput;

import java.io.*;

public class writeobj {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Bob"), new Person(3, "Tom")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
