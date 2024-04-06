package com.interview.string;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test44 {
    public static void main(String[] args) {
        String input ="hello world";

        findAllDuplicateChar(input);
    }

    private static void findAllDuplicateChar(String input) {

        Set<Character> characterSet = new HashSet<>();
        input
                .chars()
                .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                        Collectors.counting())
                                )
                                .entrySet()
                                        .stream()
                                                .filter(e->e.getValue() > 1)
                                                        .forEach(q->System.out.println(q.getKey() ));

    }
}
