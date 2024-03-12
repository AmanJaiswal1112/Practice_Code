package com.interview.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list  = List.of(2,3,4,5,6,3,5,2,7);


        Set<Integer> integerSet = new HashSet<>();

        List<Integer> newList = list.stream().filter((s->!integerSet.add(s))).collect(Collectors.toList());
        System.out.println(newList);


    }
}
