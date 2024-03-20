package com.prac.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//max three elements
//c) [5,6,3,7,8,3,1,9] -> [9,8,7]
public class Find3MaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,3,7,8,3,1,9);
        find3MaxElement(list);
        find3MinElement(list);


        int[] arr = {5,6,3,7,8,3,1,9};
        find3MaxElementFromArray(arr);
    }

    private static void find3MaxElementFromArray(int[] arr) {
        Integer[] newArray = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).toArray(Integer[]::new);
        System.out.println(Arrays.toString(newArray));
    }

    private static void find3MinElement(List<Integer> list) {
        List<Integer> newList = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(newList);
    }

    private static void find3MaxElement(List<Integer> list) {
        List<Integer> integerList =list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
