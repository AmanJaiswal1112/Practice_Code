package com.interview.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test64 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 40, 4, 8,  22, 33, 11,99);
        Map<Boolean , List<Integer>> map = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(n->n% 2 == 0));
        System.out.println(map);

        String str = "Tommarow is Ramanavami Aman";
        String output = getResultStringStream(str);
        System.out.println(output);

    }

    private static String getResultString(String str) {
        String[] word = str.split( " ");
        StringBuilder sb = new StringBuilder();

        for(int i = word.length - 1 ; i >= 0 ; i --){
            sb.append(word[i]).append(" ");
        }
        return sb.toString();
    }

    private static String getResultStringStream(String str) {
        return Arrays.stream(str.split( " "))
                .reduce((acc, word) -> word + " "+ acc)
                .orElse("");

    }
}
