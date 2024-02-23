package com.prac.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FirstElementInStream {
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        System.out.println("First Element: " + firstElementInStream(stream));
    }

    private static String firstElementInStream(Stream<String> stream) {

        Optional<String> first = stream.findFirst();
        return first.orElse("nulkl");




    }
}
