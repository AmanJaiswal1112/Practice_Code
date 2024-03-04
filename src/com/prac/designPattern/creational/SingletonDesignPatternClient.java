package com.prac.designPattern.creational;

public class SingletonDesignPatternClient {
    public static void main(String[] args) {
    //Test t = new Test();
        Test.getInstance();
    }
}

class Test{

    private static Test test = null;
    private Test(){
    }

    public static Test getInstance(){

        if ( test == null){
            synchronized (Test.class){
                if(test == null){
                     test =new Test();
                    return test;
                }
            }
        }
        return test;
    }
}
