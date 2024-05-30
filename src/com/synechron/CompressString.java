package com.synechron;

public class CompressString {
    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count the number of occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character to the array
            chars[index++] = currentChar;

            // Write the count if it's greater than 1
            if (count > 1) {
                char[] countChars = Integer.toString(count).toCharArray();
                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength1 = compress(chars1);
        System.out.println("New Length: " + newLength1);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();

        // Additional test case
        char[] chars2 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c'};
        int newLength2 = compress(chars2);
        System.out.println("New Length: " + newLength2);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println();
    }
}
