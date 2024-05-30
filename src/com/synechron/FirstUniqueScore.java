package com.synechron;

import java.util.*;

public class FirstUniqueScore {
    public static Integer firstUniqueScore(List<Tuple> tuplesList) {
        // Step 1: Extract scores and count frequencies
        Map<Integer, Integer> scoreCounts = new HashMap<>();

        for (Tuple tuple : tuplesList) {
            int score = tuple.getScore();
            scoreCounts.put(score, scoreCounts.getOrDefault(score, 0) + 1);
        }

        // Step 2: Find the first unique score
        for (Tuple tuple : tuplesList) {
            int score = tuple.getScore();
            if (scoreCounts.get(score) == 1) {
                return score;
            }
        }
        // If there's no unique score, return minimum times occurance score
        int min = Integer.MAX_VALUE;
        int minOccuranceScore =0;
        for (Map.Entry<Integer, Integer> entry : scoreCounts.entrySet()) {
            int score = entry.getValue();

            if(min > score){
                min = score;
                minOccuranceScore = entry.getKey();
            }
        }
        System.out.println("minOccuranceScore = "+ minOccuranceScore);
        return min;
    }

    public static void main(String[] args) {
        List<Tuple> list1 = Arrays.asList(new Tuple(1, 12), new Tuple(2, 15), new Tuple(3, 15), new Tuple(4, 16));
        List<Tuple> list2 = Arrays.asList(new Tuple(1, 20), new Tuple(2, 50), new Tuple(3, 20), new Tuple(4, 20), new Tuple(5, 50), new Tuple(6, 60));
        List<Tuple> list3 = Arrays.asList(new Tuple(1, 30), new Tuple(2, 20), new Tuple(3, 20)
                , new Tuple(4, 30)
                , new Tuple(5, 30)
                , new Tuple(6, 20)

        );
        System.out.println(firstUniqueScore(list1));  // Output: 12
        System.out.println(firstUniqueScore(list2));  // Output: 60
        System.out.println(firstUniqueScore(list3)); // output 20
    }
}

