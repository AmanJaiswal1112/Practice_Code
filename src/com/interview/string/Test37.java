package com.interview.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test37 {
    public static void main(String[] args) {
        System.out.println("hello");
        String [][] data ={
                {"Aman", "80"},
                {"Kedar", "90"},
                {"navven", "70"},
                {"Aman", "80"},
                {"Abc", "60"}
        };

       List<String[]> list = Arrays.asList(data);

      Map.Entry<String , Double> map =  list.stream()
               .collect(Collectors
                       .groupingBy(st -> st[0] ,
                       Collectors.
                               averagingDouble
                                       (st->Integer.parseInt(st[1]))))
              .entrySet()
              .stream()
              .min(Map.Entry.comparingByValue())
              //.max(Map.Entry.comparingByValue())
              .orElseThrow();

        System.out.println(map.getKey() + " "+map.getValue());
    }
}
