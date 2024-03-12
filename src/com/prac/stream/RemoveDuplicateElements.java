package com.prac.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Integer[] arr = {5,2,2,3,5,6,3,7};
        List<Integer> list = Arrays.asList(arr);

        removeDuplicate(list);
    }

    private static void removeDuplicate(List<Integer> list) {

        Set<Integer> set = new HashSet<>();

        List<Integer> list1= list.stream().filter(s-> set.add(s)).collect(Collectors.toList());
        System.out.println(list1);
    }
}
