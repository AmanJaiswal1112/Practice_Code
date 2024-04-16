package com.interview.string;

import java.util.Arrays;

public class Rotate_Array_To_Kth_Times_Example {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k = 3;

        doRotate(arr, k);
    }

    private  static void doRotate(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        k = k % arr.length;

        reverse(arr , 0 , arr.length-1);
        reverse(arr , 0, k-1);
        reverse(arr , k, arr.length-1);

        synchronized(Rotate_Array_To_Kth_Times_Example.class) {
            System.out.println(Arrays.toString(arr));
            ;
        }
    }

    private static void reverse(int[] arr, int i, int i1) {
        while (i < i1) {
            int temp = arr[i];
            arr[i] = arr[i1];
            arr[i1] = temp;
            i++;
            i1--;
        }
    }
}



//Rotate the array to the right by K steps
//
//int arr[]={1,2,3,4,5,6,7}, k = 3
//rotation 1 -> [7,1,2,3,4,5,6]
//rotation 2 -> [6,7,1,2,3,4,5]
//rotation 3 -> [5,6,7,1,2,3,4]
//[5,6,7,1,2,3,4]