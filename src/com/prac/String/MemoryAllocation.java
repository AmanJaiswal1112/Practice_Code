package com.prac.String;

public class MemoryAllocation {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "hello";
        String s3 = "hello";
        String s5 = "java";
        String s4 = new String("java");


        System.out.println(s1== s2);
        System.out.println(s3== s2);
        System.out.println(s3== s4);
        System.out.println(s1== s4);
        System.out.println(s4== s5);


    }
}
