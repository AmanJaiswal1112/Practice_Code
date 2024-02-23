package com.java8.dataTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.MAX;
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

    }
}
