package com.prac.exception;

public class Demo {
    public static void main(String[] args) {
        try{
            System.out.println("inside try");
            throw new RuntimeException("exception in try");
        }catch (Exception e){
            System.out.println("inside catch");
            System.exit(1);
        }finally {
            System.out.println("inside finally");
        }
    }
}
