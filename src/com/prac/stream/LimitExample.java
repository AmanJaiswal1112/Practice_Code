package com.prac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitExample {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        arr.add("geeks");
        arr.add("for");
        arr.add("geeks");
        arr.add("computer");
        arr.add("science");

        List<String> str = arr.stream().skip(1).limit(3).collect(Collectors.toList());
        str.forEach(System.out::println);
    }
}
