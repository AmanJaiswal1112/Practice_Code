package com.synechron;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageScore {

    public static String findHighestAverage(String[][] scores) {
        // Create a map to store the sum of scores and the count of scores for each person
        Map<String, Integer> scoreSumMap = new HashMap<>();
        Map<String, Integer> scoreCountMap = new HashMap<>();

        // Iterate through the scores and populate the maps
        for (String[] score : scores) {
            String name = score[0];
            int value = Integer.parseInt(score[1]);

            scoreSumMap.put(name, scoreSumMap.getOrDefault(name, 0) + value);
            scoreCountMap.put(name, scoreCountMap.getOrDefault(name, 0) + 1);
        }

        // Calculate the highest average score
        String highestAvgPerson = null;
        double highestAvg = Double.NEGATIVE_INFINITY;

        for (Map.Entry<String, Integer> entry : scoreSumMap.entrySet()) {
            String name = entry.getKey();
            double avg = (double) entry.getValue() / scoreCountMap.get(name);
            if (avg > highestAvg) {
                highestAvg = avg;
                highestAvgPerson = name;
            }
        }

        return highestAvgPerson + " with an average score of " + highestAvg;
    }

    public static void main(String[] args) {
        String[][] scores = {
                { "Bunney", "81" },
                { "Charles", "20" },
                { "Remo", "87" },
                { "Charles", "100" }
        };

        String result = findHighestAverage(scores);
        System.out.println("Person with the highest average score: " + result);
    }
}
