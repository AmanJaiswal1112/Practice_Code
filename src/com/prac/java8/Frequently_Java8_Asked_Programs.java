package com.prac.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequently_Java8_Asked_Programs {
    public static void main(String[] args) {
        int arr[] = new int[]{9,10,15,8,49,25,98,32,10};
        doOerationUsingJava8(arr);
    }
    private static void doOerationUsingJava8(int[] arr) {
        //Print Even nos from the list
        Arrays.stream(arr).filter(num->num%2 == 0).forEach(t-> System.out.println(t));
        //Find First element in the list
        System.out.println();
        Arrays.stream(arr).findFirst().ifPresent(System.out::println);
        //Find duplicates in the list
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).filter(s->!set.add(s)).forEach(System.out::println);

        //Find minimum and maximum in the list
        System.out.println(Arrays.stream(arr).max().getAsInt());

        //Find first non repeated character
        String strings ="first non repeated character";

        //Find the count of words in a string
        String  str = "this is word count for word is good";
        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k+"    "+v));


    }
}
