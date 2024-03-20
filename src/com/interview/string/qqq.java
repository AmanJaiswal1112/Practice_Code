package com.interview.string;

import java.util.Scanner;

public class qqq
{
    public static void main(String[] args) {


        int max = 100;

            for(int i = 0 ; i < max ; i++){
                System.out.println(fib(i));
            }
       /* for(int i = 2 ; i < max ; i++){

            int next = fist + second;
            if(next > 100){
                break;
            }
            System.out.println(next);
            fist = second;
            second = next;
        }*/
    }

    private static int fib(int i) {

        if( i == 0 ){
            return 0;
        }else if(i == 1){
            return 1;
        }else{
            return  fib(i-1)+fib(i-2);
        }
    }
}
