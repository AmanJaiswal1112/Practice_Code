package com.synechron;

public class Trapping_Rain_Water {

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};

        int totalWater = trap(height);
        System.out.println(totalWater);
    }

    private static int trap(int[] height) {
        int totalWater = 0 ;
        int row = height.length;
        int[] leftMax = new int[row];
        int[] rightMax = new int[row];

        leftMax[0] = height[0];

        for(int i = 1 ; i < row ;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        rightMax[row-1] = height[row-1];

        for(int i = row -2 ; i >= 0 ;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i = 0 ; i < row ; i++ ){
            totalWater += Math.min(leftMax[i], rightMax[i])- height[i];
        }

        return totalWater;
    }
}
