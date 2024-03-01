package com.prac.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCDEF";
        findReverse(str);
        findReverseByAPI(str);
        findReverseStringAPI(str);
        findReverseStringUsingCharArray(str);
        findReverseByCollection(str);
        findReverseByStack(str);
    }

    private static void findReverseByStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        String temp="";
        while (!stack.isEmpty()){
            temp += stack.pop();
        }
        System.out.println(temp);
    }

    private static void findReverseByCollection(String str) {
        char[] ch = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c: ch) {
            list.add(c);
        }

        Collections.reverse(list);
        System.out.println(list);
    }
    private static void findReverseStringUsingCharArray(String str) {
        char[] chArray = str.toCharArray();
        for(int i = chArray.length-1 ; i >= 0 ; i--){
            System.out.print(chArray[i]);
        }
        System.out.println();
    }
    private static void findReverseStringAPI(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        System.out.println(sb);
    }
    private static void findReverse(String str) {
        int len = str.length();
        String st = "";
        char ch;
        for(int i = 0 ; i < str.length()  ; i++){
            ch = str.charAt(i);
            st = ch+st;
        }
        System.out.println(st);
    }
    private static void findReverseByAPI(String str) {
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        for(int i = len-1 ; i >= 0 ; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
