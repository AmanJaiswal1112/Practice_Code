package com.prac.serialization;

// Java program to demonstrate
// the case if superclass need
// not to be serializable
// while serializing subclass

import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;

// superclass A
// A class doesn't implement Serializable
// interface.
class A {
    int i;
    int k;

    // parameterized constructor
    public A(int i){
        this.i = i;
    }

    // default constructor
    // this constructor must be present
    // otherwise we will get runtime exception
    public A()
    {
        i = 50;
        System.out.println("A's class constructor called");
    }

    public A(int i, int k) {
        this.i = i;
        this.k = k;
        System.out.println("A's class constructor called");
    }
}

// subclass B
// implementing Serializable interface
class B extends A implements Serializable {
    int j;

    // parameterized constructor
    public B(int i, int j , int k)
    {
        super(i, k);
        this.j = j;
    }
}

// Driver class
public class SerilizationWithInheritence {
    public static void main(String[] args) throws Exception
    {
        B b1 = new B(10, 20, 30);

        System.out.println("i = " + b1.i);
        System.out.println("j = " + b1.j);
        System.out.println("K = " + b1.k);
        // Serializing B's(subclass) object

        // Saving of object in a file
        FileOutputStream fos
                = new FileOutputStream("abc.ser");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);

        // Method for serialization of B's class object
        oos.writeObject(b1);

        // closing streams
        oos.close();
        fos.close();

        System.out.println("Object has been serialized");

        // De-Serializing B's(subclass) object

        // Reading the object from a file
        FileInputStream fis
                = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Method for de-serialization of B's class object
        B b2 = (B)ois.readObject();

        // closing streams
        ois.close();
        fis.close();

        System.out.println("Object has been deserialized");

        System.out.println("i = " + b2.i);
        System.out.println("j = " + b2.j);
        System.out.println("k = " + b1.k);
    }
}
