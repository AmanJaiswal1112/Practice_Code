package com.interview.string;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;









public class Test16 {
    public static void main(String[] args) {
        String[] ar = {"cat", "mat", "rat"};

      /*  Map<Character, Long> characterSet =
                Arrays.stream(ar)
                        .flatMap(s->s.chars().mapToObj(c->(char)c))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().filter(p->p.getValue().intValu());


                       *//* .map(s->s.chars().mapToObj(c->(char)c))
                        .reduce((p1, p2) -> p1.filter(p2::anyMatch))
                        .orElseGet(()->"".chars().mapToObj(c->(char)c))
                                .collect(Collectors.toSet());*//*


        System.out.println(characterSet);*/
    }
}


//cat, mat, rat