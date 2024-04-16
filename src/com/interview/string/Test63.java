package com.interview.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test63 {
    public static void main(String[] args) {
        String str = "aabbbccccddba";
       // findFirstNonRepitiveChar(str);
        findFirstNonRepitiveChar1(str);
    }

    private static void findFirstNonRepitiveChar1(String str) {
        char currentChar = str.charAt(0);
        int count = 1;

        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one, increment count
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                // If the current character is different, print the previous character and its count
                System.out.print(currentChar);
                if (count > 1) {
                    System.out.print(count-1);
                }
                // Reset variables for the new character
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        // Print the last character and its count
        System.out.print(currentChar);
        if (count > 1) {
            System.out.print(count-1);
        }
        System.out.println();
    }

    private static void findFirstNonRepitiveChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if(val == 1){
                System.out.print(entry.getKey());
            }else {
                System.out.print(entry.getKey() + "-" + (val -1));
            }
        }
    }
}
//i/p:aabbbccccddba
//o/p: a1b2c3d1ba