package com.prac.java8;




public interface demoInterface {
    public void get();

    public static void main1(String are[]){
        System.out.println("Hello static interface");
    }

    public default void defaultmain(){
        System.out.println("Hello default interface");
    }
}







