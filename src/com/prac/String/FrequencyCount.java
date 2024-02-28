package com.prac.String;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCount {
    public static void main(String[] args) {
        String st = "thisisamanjaiswal";
        frequencyCount(st);
        frequencyCountUsingHashMap(st);
        frequencyCountUsingJava8(st);
    }

    private static void frequencyCountUsingJava8(String st) {
        char[] ch = st.toCharArray();
        Map<Character, Long> map = st.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((k,v)-> System.out.println(k+"---------"+v));
    }

    private static void frequencyCountUsingHashMap(String st) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for(int i = 0 ;i < st.length() ; i++){
            if(characterIntegerMap.containsKey(st.charAt(i))){
                characterIntegerMap.put(st.charAt(i),characterIntegerMap.get(st.charAt(i)) + 1);
            }else {
                characterIntegerMap.put(st.charAt(i), 1);
            }
        }
        characterIntegerMap.forEach((k,v)-> System.out.println(k+"---------"+v));
    }

    private static void frequencyCount(String st) {
        char[] chars = st.toCharArray();
        int[] ch = new int[26];
        for (int i = 0; i < chars.length; i++) {
            ch[chars[i] - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if(ch[chars[i] - 'a'] != 0){
                System.out.println(chars[i]+"---------"+ch[chars[i] - 'a']);
                ch[chars[i] - 'a'] = 0;
            }

        }
    }

}
