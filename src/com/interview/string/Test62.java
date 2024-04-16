package com.interview.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test62 {
    public static void main(String[] args) {
        String str = "Java developers are jool Dudes";
        char c = findFirstNonRepitiveChar(str);
        System.out.println(c);
    }

    private static Character findFirstNonRepitiveChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }


        for(char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }
}


//Find the first non repetitive character from the below String
//"Java developers are jool Dudes"