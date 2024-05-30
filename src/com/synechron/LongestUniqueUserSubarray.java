package com.synechron;

import java.util.*;

public class LongestUniqueUserSubarray {
    public static int longestUniqueUserSubarrayLength(List<Tuple> tuplesList) {
        // Step 1: Initialize variables
        Set<String> userSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        // Step 2: Iterate through the list with the right pointer
        for (int right = 0; right < tuplesList.size(); right++) {
            String user = tuplesList.get(right).getUserName();

            // Step 3: If user is already in the set, move the left pointer
            while (userSet.contains(user)) {
                userSet.remove(tuplesList.get(left).getUserName());
                left++;
            }

            // Step 4: Add the user to the set and update maxLength
            userSet.add(user);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int longestUniqueUserSubarray(List<Tuple> tuplesList) {
        Map<String, Integer> lastIndexMap = buildLastIndexMap(tuplesList);
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < tuplesList.size(); right++) {
            Tuple tuple = tuplesList.get(right);
            String username = tuple.getUserName();

            if (lastIndexMap.containsKey(username) && lastIndexMap.get(username) >= left) {
                left = lastIndexMap.get(username) + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    private static Map<String, Integer> buildLastIndexMap(List<Tuple> tuplesList) {
        Map<String, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < tuplesList.size(); i++) {
            Tuple tuple = tuplesList.get(i);
            String user = tuple.getUserName();
            lastIndexMap.put(user, i);
        }
        return lastIndexMap;
    }

    public static void main(String[] args) {
        List<Tuple> list1 = Arrays.asList(
                new Tuple(100, "user1"), new Tuple(200, "user2"), new Tuple(300, "user3"),
                new Tuple(400, "user1"));
        List<Tuple> list2 = Arrays.asList(
                new Tuple(100, "user1"), new Tuple(200, "user1"), new Tuple(300, "user1"),
                new Tuple(400, "user1"));

        List<Tuple> list3 = Arrays.asList(
                new Tuple(100, "user1"), new Tuple(200, "user2"), new Tuple(300, "user3"),
                new Tuple(400, "user1"), new Tuple(500, "user2"), new Tuple(600, "user4")
        );

     /*   System.out.println(longestUniqueUserSubarrayLength(list1)); // Output: 3
        System.out.println(longestUniqueUserSubarrayLength(list2)); // Output: 1
        System.out.println(longestUniqueUserSubarrayLength(list3)); // Output: 4
*/
        System.out.println(longestUniqueUserSubarray(list1)); // Output: 3
        System.out.println(longestUniqueUserSubarray(list2)); // Output: 1
        System.out.println(longestUniqueUserSubarray(list3)); // Output: 4


    }
}



