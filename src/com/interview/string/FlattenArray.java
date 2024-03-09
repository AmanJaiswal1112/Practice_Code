package com.interview.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlattenArray {
    public static void main(String[] args) throws Exception {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {

        List<Integer> integerList =Arrays.stream(inputArray)
                .mapToInt(t->IntStream::flatMap(i->i))
                .flatMap(value -> IntStream.of(value))
                .flatMap(value -> IntStream.of(value))

               ;




        return null;
    }

}
