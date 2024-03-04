package com.prac.exception;

public class Test {
    public static void main(String[] args) {
        System.out.println(executeMethod());
    }
    private static int executeMethod() {
        try{
            int b = 10/0;
            return 1;
        }
        catch (ArithmeticException e ){
            return 2;
        }
        finally {
            System.out.println("inside finally");
        }
    }
}
