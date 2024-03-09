package com.interview.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//6,5,41,2,3}
public class SortArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);//4
        list.add(5);//4
        list.add(41);
        list.add(2);
        list.add(3);


      //
        //  HashSet

        List<Integer> integerList =list.stream().sorted(Integer::compare).collect(Collectors.toList());
        System.out.println(integerList);

    }
}
