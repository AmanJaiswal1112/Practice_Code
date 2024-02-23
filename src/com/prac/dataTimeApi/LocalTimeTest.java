package com.java8.dataTimeApi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.MAX;
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.from(LocalTime.now());
        System.out.println(localTime1);
        LocalTime localTime2 = LocalTime.now(ZoneId.systemDefault());
        System.out.println(localTime2);
        LocalTime localTime3 = LocalTime.now(Clock.systemDefaultZone());
        System.out.println(localTime3);

        LocalTime localTime4 = LocalTime.of(4,20);
        System.out.println(localTime4);
    }
}
