package com.prac.String;

import java.util.*;
import java.util.stream.Collectors;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strings = {"apple", "ape", "april"};  //{"geeksforgeeks", "geeks", "geek", "geezer"};
        String s =findLongestCommonPrefix(strings);
        System.out.println(s);
    }
    private static String findLongestCommonPrefix(String[] strings) {
        List<String> stringList = Arrays.stream(strings).sorted().collect(Collectors.toList());

        Set<Character> characterHashSet = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i < strings.length;  i++)
        {
            for (String s:strings) {
                characterHashSet.add(s.charAt(i));
            }
            if(characterHashSet.size()>1) {
                return stringBuffer.toString();
            }else {
                stringBuffer.append(strings[i].charAt(i));
        }
            characterHashSet.removeAll(characterHashSet);


        }
        return stringBuffer.toString();
    }
}
