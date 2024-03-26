package com.interview.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test26 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,312,3,4,35,6);
        List<Integer> integerList = list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println(integerList.get(1));

    String str = "aman";

    Map<Character, Long> map =str.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy
                    (e->e, Collectors.counting()));


        System.out.println(map);
    }

}
