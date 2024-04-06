package com.interview.string;

import java.util.Arrays;

public class Test47 {
    public static void main(String[] args) {
    int[] num =  {1,0,1,0,1,1,1,1,1,0,1,1,1,1};
    int [] longestArray = findLongestConsicutiveOnces(num);
        System.out.println(Arrays.toString(longestArray));
    }

    private static int[] findLongestConsicutiveOnces(int[] nums) {
        int maxLength = 0;
        int currLength = 0;
        int startIndex = -1;
        int endIndex = -1;

        int temp = -1;
        for (int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 1){
                if(temp == -1){
                    temp = i;
                }
                currLength++;
                if(currLength > maxLength){
                    maxLength = currLength;
                    startIndex = temp;
                    endIndex = i;
                }}else{
                currLength =0;
                temp = -1;
            }
        }
        System.out.println(startIndex);
        System.out.println(endIndex);
        int[] arr = new int[maxLength];

        for(int i = 0 ; i < maxLength ; i++){
            arr[i] = 1;
        }
        return arr;
    }
}
