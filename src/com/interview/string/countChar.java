package com.interview.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countChar {
    public static void main(String[] args) {
        String s = "aman jaiswal";

        Map<Character, Long> map0 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map0.forEach((k, v) -> System.out.println(k + "-----" + v));
    }
}


