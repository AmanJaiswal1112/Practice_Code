package com.interview.string;

import java.util.HashMap;
import java.util.Map;

public class findLongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "acabbccdd";
        String longestString = findLongestSubStringWithoutRep(str);
        System.out.println(longestString);
    }

    private static String findLongestSubStringWithoutRep(String str) {
        if(str == null || str.length() == 0)
            return "";

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int maxLength =0, startIndex = 0, endIndex =0;
        int start = 0;
        for(int end = 0 ; end < str.length(); end++){
            char c= str.charAt(end);

            if(characterIntegerMap.containsKey(c)){
                start = Math.max(start, characterIntegerMap.get(c)+1);
            }
            characterIntegerMap.put(c, end);

            if(end -start +1 > maxLength) {

                maxLength = end -start +1;
                startIndex = start;
                endIndex = end;
            }
        }
        return str.substring(startIndex, endIndex+1);

    }
}

//Finding the first largest sub string without repeating characters in Java
//input : abcadcbed ,acabbccdd

//output : adcbe