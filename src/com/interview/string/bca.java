package com.interview.string;


import java.util.ArrayList;
import java.util.List;

public class bca {

    public static void main(String[] args) {
        emp e = new emp();
        System.out.println(e.name);
        System.out.println(e.age);

    }
}


class emp {
    int age ;
    String name ;


    public emp(){
        age = 35;
        name = "aman";
    }
}