package com.synechron;

public class PangramChecker {

    public static boolean isPangram(String str) {
        if (str == null) {
            return false;
        }

        boolean[] alphabet = new boolean[26];
        int index = 0;
        int count = 0;

        // Convert string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        // Check if all characters from 'a' to 'z' are present
        return count == 26;
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "Hello World";
        String test3 = "Pack my box with five dozen liquor jugs";
        String test4 = "";

        System.out.println(isPangram(test1)); // true
        System.out.println(isPangram(test2)); // false
        System.out.println(isPangram(test3)); // true
        System.out.println(isPangram(test4)); // false
    }
}
