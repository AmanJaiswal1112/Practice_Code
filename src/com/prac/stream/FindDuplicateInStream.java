package com.prac.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDuplicateInStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        List<Integer> list
                = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        String str = "indian";

        System.out.println(findDuplicateInStream(stream));
        System.out.println(findDuplicateInStream(list));
        System.out.println(findOccuranceInStream1(list));
        System.out.println(findFirstDuplicationChar(str.chars()));
    }

    private static char findFirstDuplicationChar(IntStream chars) {
        Set<Character> sets =new HashSet<>();
        Optional<Character> optionalInteger = chars.mapToObj(c->(char)c).filter(s-> !sets.add(s)).findFirst();

        return optionalInteger.get();
    }

    public static <T> Set<T> findDuplicateInStream(Stream<T> stream)
    {
        Set<T> set = new HashSet<>();
        Set<T> newSet = stream.filter(n->!set.add(n)).collect(Collectors.toSet());
        return newSet;
    }

    public static <T> List<T> findDuplicateInStream(List<T> list)
    {
        List<T> cityUserCountMap = list
                .stream()
                .collect(Collectors.groupingBy(p -> p))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue().size() > 1)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());
        return cityUserCountMap;
    }

    public static <T> Map<T, Long >  findOccuranceInStream1(List<T> list)
    {
         Map<T, Long > cityUserCountMap =   list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         return cityUserCountMap;
    }
}
