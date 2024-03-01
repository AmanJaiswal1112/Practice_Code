package com.prac.String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DummyFeqCount {
    public static void main(String[] args) {
        String str = "thisisaman";

        freqCountUsing(str);
        freqCountUsingJava8(str);
        freqCountUsingCollection(str);

    }

    private static void freqCountUsing(String str) {
        char[] ch = str.toCharArray();
        int[] ints = new int[26];

        for(int i = 0 ; i < ch.length ; i++)
        {
            ints[ch[i] - 'a']++;
        }

        for(int i = 0 ; i < str.length() ; i++){
            if(ints[ch[i] - 'a'] != 0){
                System.out.print(str.charAt(i));
                System.out.print(" " +ints[ch[i] -'a']);
                System.out.println();
                ints[ch[i] - 'a'] = 0;
            }
        }

    }

    private static void freqCountUsingJava8(String str) {
        System.out.println("------------------------------------------------");
        Map<Character, Long> frequency =
                str.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k+"-------"+v));
        System.out.println("------------------------------------------------");
        Map<Character, Integer> frequency1 =
                str.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i->1)));

        frequency1.forEach((k, v) -> System.out.println(k+"-------"+v));
    }

    private static void freqCountUsingCollection(String str) {
        System.out.println("------------------------------------------------");
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            Integer val = map.get(c);

            if(map.containsKey(c)){
                map.put(c , val + 1);
            }else{
                map.put(c , 1);
            }
        }

            for(int i = 0 ; i < str.length() ; i++){
                if(map.get(str.charAt(i)) != 0){
                    System.out.print(str.charAt(i));
                    System.out.print(map.get(str.charAt(i)) + " ");
                    map.put(str.charAt(i), 0);
            }
        }
    }
}
