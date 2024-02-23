package com.prac.OOPs;
class Parent{
    private void print(){
        System.out.println("parent");
    }
    public void display(){
       print();
    }
}
class child extends Parent{
    public void print(){
        System.out.println("child");
    }
}
public class Main {
    public static void main(String[] args) {
        Parent p = new child();
        p.display();
        child child = new child();
        child.print();
        child.display();
    }
}
