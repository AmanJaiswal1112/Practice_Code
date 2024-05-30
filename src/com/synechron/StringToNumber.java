package com.synechron;

public class StringToNumber {
    public static double stringToDouble(String str) {
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("Invalid input: null or empty string");
        }

        int length = str.length();
        int index = 0;
        int sign = 1;
        double result = 0;
        boolean isDecimal = false;
        double decimalPlace = 0.1;

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

            if (c == '.') {
                if (isDecimal) {
                    throw new NumberFormatException("Invalid input: multiple decimal points");
                }
                isDecimal = true;
            } else if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character found: " + c);
            } else {
                int digit = c - '0';
                if (isDecimal) {
                    result += digit * decimalPlace;
                    decimalPlace /= 10;
                } else {
                    if (result > (Double.MAX_VALUE - digit) / 10) {
                        throw new NumberFormatException("Double overflow");
                    }
                    result = result * 10 + digit;
                }
            }
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        // Test cases
        String number1 = "123.45";
        String number2 = "-678.90";
        String number3 = "+987.65";
        String number4 = "214748.3647";
        String number5 = "-214748.3648";

        System.out.println(stringToDouble(number1)); // 123.45
        System.out.println(stringToDouble(number2)); // -678.90
        System.out.println(stringToDouble(number3)); // 987.65
        System.out.println(stringToDouble(number4)); // 214748.3647
        System.out.println(stringToDouble(number5)); // -214748.3648
    }
}
