package com.interview.string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test9 {
    private int id =9 ;
    public static void main(String[] args) {
        int id = 5;
        String str ="aman";
        Set<Character> characterSet = new HashSet<>();

       List<Character > characterList =str.chars().mapToObj(c->(char)c).filter(s->!characterSet.add(s)).collect(Collectors.toList());
        System.out.println(characterList);
    }
    public static void main(int num) {}
}
