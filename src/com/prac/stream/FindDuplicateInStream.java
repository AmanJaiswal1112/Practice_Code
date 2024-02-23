package com.prac.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateInStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        List<Integer> list
                = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        System.out.println(findDuplicateInStream(stream));
        System.out.println(findDuplicateInStream(list));
        System.out.println(findOccuranceInStream1(list));
    }
    public static <T> Set<T> findDuplicateInStream(Stream<T> stream)
    {
        Set<T> set = new HashSet<>();
        Set<T> newSet = stream.filter(n->!set.add(n)).collect(Collectors.toSet());
        return newSet;
    }

    public static <T> Map<T, Long > findDuplicateInStream(List<T> list)
    {
        Map<T, Long > cityUserCountMap = list
                .stream()
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        return cityUserCountMap;
    }

    public static <T> Map<T, Long >  findOccuranceInStream1(List<T> list)
    {
         Map<T, Long > cityUserCountMap =   list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         return cityUserCountMap;
    }
}
