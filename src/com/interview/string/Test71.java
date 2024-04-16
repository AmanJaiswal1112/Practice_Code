package com.interview.string;

import java.util.ArrayList;
import java.util.List;

public class Test71 {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {16, 17, 4, 3,5,70,2};
        List<Integer> leaderElements = findLeaderElements(arr);
        System.out.println(leaderElements);

    }

    private static List<Integer> findLeaderElements(int[] arr) {
        List<Integer> leaderElements = new ArrayList<>();
        int len = arr.length;
        int max = arr[len-1];
        int n = len -2 ;
        for(int i = n ; i >= 0 ; i--){
            int sum = calculateSum(arr, 0 , i);
            if(sum < max){
               leaderElements.add(max);
                max = arr[i];
            }else{
                max = arr[i];
            }

        }
        return leaderElements;

    }

    private static int calculateSum(int[] arr, int i, int i1) {
        int sum = 0 ;
        for(int j = 0 ; j <= i1 ; j++){
            sum += arr[j];
        }
        return sum;
    }
}

//int[] arr = {16, 17, 4, 3,5,70,2}; //find leader element
