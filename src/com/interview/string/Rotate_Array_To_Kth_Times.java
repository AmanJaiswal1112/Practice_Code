package com.interview.string;

import java.util.Arrays;

public class Rotate_Array_To_Kth_Times {
    public static void main(String[] args) {
        System.out.println("hello");
        int arr[] ={2,3,5,1,7};
        int i = 2;
        createArray(arr , i);
    }
//To Do needs to coorent
    private static void createArray(int[] arr, int index) {

        int len = arr.length - index;

        int[] out = new int[arr.length];

        for(int i = 0 ; i < len; i++){
            out[i] = arr[index+i] ;
        }

        System.out.println(Arrays.toString(out));
    }
}
