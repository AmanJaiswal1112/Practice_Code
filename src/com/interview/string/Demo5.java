package com.interview.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {


        String str = "hi Aman Jaiswal hello";

        long count = Arrays
                .stream(str.split("\\s+"))
                .filter(s->s.startsWith("h")).count();



        System.out.println(count);

    }
}
