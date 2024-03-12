package com.prac.String;

import java.util.HashMap;
import java.util.Map;

/*
* Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

* */
public class Isomorphic {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";

        boolean status = isIsomorphic(s1, s2);
        System.out.println("strings are isomorpic = "+status);
    }

    private static boolean isIsomorphic(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        Map<Character, Character > map = new HashMap<>();

        for(int i = 0 ; i < s1.length()  ;i++)
        {
            char ch = s1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , s2.charAt(i));
            }else if(map.get(ch) != s2.charAt(i)){
                 return false;
            }
        }

        return true;
    }
}
