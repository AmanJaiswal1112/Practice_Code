package com.interview.string;

import java.util.*;
import java.util.stream.Collectors;

public class Test42 {
    public static void main(String[] args) {
        System.out.println("Hello");

        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1,2,3,4,4,5,6));
        list.add(List.of(1,2,3,4,6));
        list.add(List.of(1,2,3,4,6));

        var  integerSet =list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println(integerSet);
    }
}

//List<List<Integer>> list = new ArrayList<>();
//		list.add(List.of(1,2,3,4,4,5,6));
//		list.add(List.of(1,2,3,4,6));
//		list.add(List.of(1,2,3,4,6));