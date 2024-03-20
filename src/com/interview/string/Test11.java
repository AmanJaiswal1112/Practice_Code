package com.interview.string;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Test11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5 , 20 , 15,30);

        Optional<Integer> integerOption = list
                .stream()
                .sorted((a,b) -> b.compareTo(a))
                .skip(1)
                .findFirst();
        System.out.println(integerOption.get());


        List<Integer> integerList = list
                .stream()
                .map(s -> s+6)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}
