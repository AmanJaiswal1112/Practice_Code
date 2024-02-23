package com.prac.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class LastElementInStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
     //   System.out.println("Last Element: " + lastElementInStream(stream));
        System.out.println("Last Element: " + lastElementInStream1(stream, 5));
    }
    public static <T> T lastElementInStream(Stream<T> stream) {
        return stream.reduce((word1, word2) -> word2).orElse(null);
    }
    public static <T> T lastElementInStream1(Stream<T> stream, int N) {

        T last_element = stream.skip(N - 1).findFirst().orElse(null);
        return last_element;
    }
}
