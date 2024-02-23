package com.java8.dataTimeApi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;


public class LocalDataTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.from(LocalDate.now());
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2024,Month.DECEMBER,07);
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.now(Clock.system(ZoneId.of("America/Chicago")));
        System.out.println(localDate2);
        LocalDate localDate3 = LocalDate.now(ZoneId.systemDefault());
        System.out.println(localDate3);
        LocalDate localDate4 = LocalDate.MAX;
        System.out.println(localDate4);
    }
}
