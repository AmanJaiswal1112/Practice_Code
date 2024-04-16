package com.interview.string;

import java.util.ArrayList;
import java.util.List;

public class Test70 {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = isPrime(num);
        System.out.println(isPrime);


        List<Integer> numbers = getAllPrimeNumber(num);
        System.out.println(numbers);
    }

    public static List<Integer> getAllPrimeNumber(int number) {
        List<Integer> list = new ArrayList<>();

        if(number >= 2){
            list.add(2);
        }
        if(number >=3){
            list.add(3);
        }

        for(int i = 5 ; i <= number ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }

        return list;


    }



    public static boolean isPrime(int number) {

        if(number <= 1 ){
            return false;
        }

        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if (number % i == 0) {
                return false;
            }
        }


        return true;
    }
}
