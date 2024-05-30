package com.synechron;

import java.util.HashMap;
import java.util.Map;

public class MaxAverageAge {
    public static double findMaxAverage(String[][] people) {
        // Create a HashMap to store the sum of ages and count of entries for each person
        Map<String, int[]> personData = new HashMap<>();

        // Iterate through the input array
        for (String[] entry : people) {
            String name = entry[0];
            int age = Integer.parseInt(entry[1]);

            // If the person already exists in the map, update their data
            if (personData.containsKey(name)) {
                personData.get(name)[0] += age;  // Sum of ages
                personData.get(name)[1] += 1;    // Count of entries
            } else {
                // Otherwise, add a new entry for the person
                personData.put(name, new int[]{age, 1});
            }
        }

        // Calculate the maximum average age
        double maxAverage = Double.MIN_VALUE;
        for (Map.Entry<String, int[]> entry : personData.entrySet()) {
            int sumOfAges = entry.getValue()[0];
            int countOfEntries = entry.getValue()[1];
            double average = (double) sumOfAges / countOfEntries;
            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        String[][] people = {
                {"Person1", "30"},
                {"Person2", "35"},
                {"Person3", "10"},
                {"Person1", "50"}
        };

        double maxAverage = findMaxAverage(people);
        System.out.println("The maximum average age is: " + maxAverage); // Output: 40.0
    }
}

