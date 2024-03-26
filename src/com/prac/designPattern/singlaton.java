package com.prac.designPattern;

public class singlaton {

    private static singlaton instance;

    private singlaton(){

    }


    public static singlaton getInstance(){
        if(instance == null){
            synchronized (singlaton.class){
                if(instance == null){
                    instance = new singlaton();
                }
            }
        }
        return instance;
    }


}
