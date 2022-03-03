package edu.depaul.se350;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student paul = new Student("Paul", 20);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.txt"));

        oos.writeObject(paul);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.txt"));

        Student paulReadInFromFile = (Student) ois.readObject();

        System.out.println(paulReadInFromFile.getName() + " " + paulReadInFromFile.getAge());
    }
}
