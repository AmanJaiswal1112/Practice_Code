package com.interview.string;

import java.util.function.BiFunction;

public class Implementation_FunctionalInterface {
    public static void main(String[] args) {
        BiFunction<Integer, Integer , Integer> biFunction = (a, b) -> a+b;

        int a = 3;int b = 5;
        int result = biFunction.apply(a, b);
        System.out.println(result);


    }
}
