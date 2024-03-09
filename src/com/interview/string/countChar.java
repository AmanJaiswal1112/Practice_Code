package com.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countChar {
    public static void main(String[] args) {
        String s = "aman jaiswal";
        List<Character> list = new ArrayList<>();

        for (Character ch:s.toCharArray()) {
            list.add(ch);
        }


        Map<Character , Long> map  = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));






        map.forEach((k,v)-> System.out.println(k+"-----"+v));

    }
}


