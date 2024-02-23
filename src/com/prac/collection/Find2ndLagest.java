package com.prac.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find2ndLagest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(40);
        list.add(15);

        get2ndLargestFromUtility(list);

    }

    private static void get2ndLargestFromUtility(List<Integer> list) {

        Integer int1 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(int1);
    }
}
