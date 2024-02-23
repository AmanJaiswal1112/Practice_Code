package com.prac.java8;

public class TestDemo implements demoInterface{
    @Override
    public void get() {
        System.out.println("abstact method");
    }

    @Override
    public void defaultmain() {
        System.out.println("abstact detault method");

    }

    public static void main1(String are[]) {
        System.out.println("abstact static method");

    }
    public static void main(String[] args) {
        System.out.println("Hello");
        TestDemo.main1(null);
        demoInterface.main1(null);
new demoInterface() {
    @Override
    public void get() {

    }

}.defaultmain();
    }
}
