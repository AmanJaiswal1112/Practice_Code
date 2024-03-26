package com.interview.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        String str = "abcdabcd";
        Set<Character> characterSet = new LinkedHashSet<>();
        for (char ch :str.toCharArray()) {
            if(!characterSet.add(ch)){
                characterSet.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch :characterSet) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}

//zvo