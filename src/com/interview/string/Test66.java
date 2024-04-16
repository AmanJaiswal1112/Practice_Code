package com.interview.string;

public class Test66 {
    public static void main(String[] args) {

    }
}

class Singlaton{

    public static Singlaton singlaton = new Singlaton();

    private Singlaton(){

    }

    public static Singlaton getInstance(){


        return singlaton;
    }
}