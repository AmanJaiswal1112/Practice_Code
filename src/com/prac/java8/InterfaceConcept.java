package com.prac.java8;

interface  i1{
     default void get(){
        System.out.println("i1");
    }
}

interface i2{
     default void get(){
        System.out.println("i2");
    }
}
interface i extends i1{

}
public class InterfaceConcept implements i1 ,i2 {
    public static void main(String[] args) {

        i1 i = new InterfaceConcept();
        i.get();
        System.out.println("Heelo");
    }


    @Override
    public void get() {

    }
}
