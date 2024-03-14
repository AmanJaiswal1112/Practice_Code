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
    }

    private static void find3MaxElement(List<Integer> list) {
        //List<Integer> newIntegerList =list.subList(0,3);
      //  System.out.println(newIntegerList);

        list.sort(Comparator.comparing(Integer::reverse));
        System.out.println(list);

    }
}
