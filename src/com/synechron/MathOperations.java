package com.synechron;

public class MathOperations {
    // Method to find the square root
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot find the square root of a negative number");
        }

        double epsilon = 1e-10;  // Define the precision of the result
        double low = 0;
        double high = number;
        double mid = 0;

        while (high - low > epsilon) {
            mid = low + (high - low) / 2;
            if (mid * mid > number) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return low + (high - low) / 2;
    }

    // Method to print factors of a number
    public static void printFactors(int number) {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Finding square root
        double number = 49;
        double squareRoot = findSquareRoot(number);
        System.out.println("Square root of " + number + " is approximately: " + squareRoot);

        // Printing factors
        int factorNumber = 28;
        printFactors(factorNumber);
    }
}
