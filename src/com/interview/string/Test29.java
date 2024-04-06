package com.interview.string;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test29 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35);

        Optional<Integer> optionalInteger =list.stream()
                .filter(num->num% 4 == 0)
                .max(Integer::compareTo);


        System.out.println(optionalInteger.get());
    }
}
