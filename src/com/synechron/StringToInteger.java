package com.synechron;

public class StringToInteger {
    public static int stringToInt(String str) {
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("Invalid input: null or empty string");
        }

        int length = str.length();
        int index = 0;
        int sign = 1;
        int result = 0;

        // Handle potential leading sign
        if (str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // Process each character
        while (index < length) {
            char c = str.charAt(index);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character found: " + c);
            }

            int digit = c - '0';

            // Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                throw new NumberFormatException("Integer overflow/underflow");
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        // Test cases
        String number1 = "12345";
        String number2 = "-67890";
        String number3 = "+98765";
        String number4 = "2147483647"; // Max int value
        String number5 = "-2147483648"; // Min int value

        System.out.println(stringToInt(number1)); // 12345
        System.out.println(stringToInt(number2)); // -67890
        System.out.println(stringToInt(number3)); // 98765
        System.out.println(stringToInt(number4)); // 2147483647
        System.out.println(stringToInt(number5)); // -2147483648
    }
}
