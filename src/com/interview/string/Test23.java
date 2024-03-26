package com.interview.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test23 {
    public static void main(String[] args) {
        System.out.println("Hello");

        String[] srr= {"abc", "", "bcd", "", "defg", "jk", "afgg"};

        List<String> list = Arrays.asList(srr)
                .stream().filter(s-> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
