package com.interview.string;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestEvenNumber {
    public static void main(String[] args) {
        System.out.println("hello");
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

       findSecondHighest(numbers);

    }

    private static void findSecondHighest(List<String> numbers) {
       Optional<Integer> integerOptional = numbers
                .stream()
                .map(Integer::parseInt)
                .filter(n->n% 2 == 0)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();


        System.out.println(integerOptional.get());

    }
}


//List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");