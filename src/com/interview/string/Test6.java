package com.interview.string;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
    int[] arr = {10,9,2,5,3,7,101,18};

    int count = findLongestSequence(arr);
        System.out.println(count);
    }

    private static int findLongestSequence(int[] arr) {

        if(arr == null || arr.length ==0){
            return 0;
        }

        int[] dp = new int[arr.length];
        Arrays.fill(dp , 1);
        int max = 1;
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++){

                if(arr[i]  > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    max = Math.max(max ,dp[i]);
                }
            }
        }

        return max;
    }
}
//Find the Longest Increasing Subsequence
//
//Given an integer array nums, find the length of the longest strictly increasing subsequence.

//Input: [10,9,2,5,3,7,101,18]
//
//Output: 4
//
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.