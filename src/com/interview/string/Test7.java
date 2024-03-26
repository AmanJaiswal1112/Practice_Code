package com.interview.string;

public class Test7 {
    public static void main(String[] args) {
        int[][] max = {{1,2,3}, {4,5,6}, {7,8,9}};

        rotate(max);
        printMatrix(max);
    }

    private static void rotate(int[][] max) {
        if(max == null || max.length == 0 || max.length != max[0].length)
            return;

        int n = max.length;

        for(int i = 0 ; i < n ;i ++){
            for(int j = i+1 ; j < n ;j++){
                int temp = max[i][j];
                max[i][j] = max[j][i];
                max[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n ;i++){
            int left = 0 ;
            int right = n-1 ;
            while(left < right){
                int temp = max[i][left];
                max[i][left] = max[i][right];
                max[i][right] = temp;
                left++;
                right--;
            }
        }



    }

    private static void printMatrix(int[][] max) {

        for(int[] arr : max){
            for(int num : arr)
                System.out.print(num+" ");
        }
        System.out.println();
    }
}



//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.


//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//
//Output: [[7,4,1],[8,5,2],[9,6,3]]