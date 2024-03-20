package com.interview.string;

import java.time.Instant;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<List<String>> fruits = Arrays.asList(Arrays.asList("apple","cherry", "date"),Arrays.asList("banana", "CHERRY", "date"),Arrays.asList("apple", "banana", "cherry", "date"));

        /**
         * Given the List of fruits. find all the unique fruits those name starts from 'a' or 'd'
         */
        Map<String , Long> fruts =  fruits
                .stream()
                .flatMap(o->o.stream()
                        .filter(t->t.startsWith("a") || t.startsWith("d"))
                )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(fruts);
    }
}