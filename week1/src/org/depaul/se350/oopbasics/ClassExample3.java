package org.depaul.se350.oopbasics;

//Constructor overloading example
public class ClassExample3 {
    int i =10 ;
    int j;

    ClassExample3() {
//        this.i = 5; // instance variable
        this(5);

//        this(5);
        //In Java, we could use this (5); instead of this.i=5; but other
        //languages may not support this kind of construct
    }
    
    public ClassExample3(int i) {

        this.i = i;
    }

//    ClassEx3(int myInteger)// myInteger is a local variable
//    {
//        i = myInteger;
//    }



    public static void main(String[] args) {
        System.out.println("*** A simple class with 2 different constructors ***");
        System.out.println("*** This is also an example of constructor overloading ***");
        ClassExample3 obA = new ClassExample3();
        ClassExample3 obB = new ClassExample3(75);
        System.out.println("obA.i =" + obA.i);
        System.out.println("obB.i =" + obB.i);
    }
}

