package com.interview.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Sort the list by number of occurrence of the element
        Input: {2, 5, 2, 6, 8, 5, 8, 8}
        Output: {6, 2, 2, 5, 5, 8, 8, 8}
*/
public class Sort_BasedON_Number_Of_Occurrence {
    public static void main(String[] args) {
        Integer[] arr = {2, 5, 2, 6, 8, 5, 8, 8};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> list1 = Arrays.asList(2,2,1,1,1,5,4,4,4,4,4);
        findSortedListBasedOnOccurance(list);
        findSortedListBasedOnOccurance1(list1);
    }

    private static void findSortedListBasedOnOccurance(List<Integer> list) {
        Map<Integer, Long> longMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Comparator<Integer> comparator = (o1,o2)->{
            return  (longMap.get(o2).intValue()- longMap.get(o1).intValue());
        };

        list.sort(comparator);
        System.out.println(list);
    }

    private static void findSortedListBasedOnOccurance1(List<Integer> list) {
        Map<Integer, Integer> longMap = new HashMap<>();

        for (Integer integer: list)
        {
            int count = longMap.getOrDefault(integer,0);
            longMap.put(integer, count+1);
        }

        Comparator<Integer> comparator = (o1,o2)->{
            int fre1 = longMap.get(o1);
            int fre2 = longMap.get(o2);
            return  fre2-fre1;
        };

        list.sort(comparator);
        System.out.println(list);

    }
}
