package com.prac.java8;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[5];
        Optional<String> val1 = Optional.empty();
        Optional<String> val2 = Optional.ofNullable(null);
        Optional<String> val = Optional.of( "XXX");
        System.out.println("Hello java");
        System.out.println("value ="+val);
        System.out.println("value ="+val1);
        System.out.println("value ="+val2);

    }
}
