package com.interview.string;

import java.util.Stack;

public class Test35 {
    public static void main(String[] args) {

        String str = "{}{}{()[](}{}{}]]{}[]{}[]";
        int length = findLongestSubArray(str);
        System.out.println(length);
    }

    private static int findLongestSubArray(String str) {

        Stack<Integer> integerStack = new Stack<>();
        int max_length = 0;
        integerStack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                integerStack.push(i);
            } else {
                if (!integerStack.isEmpty() && isMatching(integerStack.peek(), i, str)) {
                    integerStack.pop();
                    max_length = Math.max(max_length, i - integerStack.peek());
                } else {
                    integerStack.push(i);
                }
            }
        }
        return max_length;
    }

    public static boolean isMatching(int openingIndex, int closingIndex, String str) {
        char openingBracket = str.charAt(openingIndex);
        char closingBracket = str.charAt(closingIndex);

        return (openingBracket == '(' && closingBracket == ')') ||
                (openingBracket == '[' && closingBracket == ']') ||
                (openingBracket == '{' && closingBracket == '}');
    }

}

//You have given a string that contains the braces (brackets), both opening and closing braces. You have to find the length of the longest balanced subarray.
//
//Input : {}{}{()[]()
//Output: 6
//Input : {}{}{()[](){}{}]]{}[]
//Output: 10
//Input : {}{}(){}(){()[]()
//Output: 10