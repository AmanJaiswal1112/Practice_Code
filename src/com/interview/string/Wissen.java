package com.interview.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Wissen {
}

/******************************************************************************

 Given two sorted arrays, the task is to merge them in a sorted manner.

 Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
 Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

 Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
 Output: arr3[] = {4, 5, 7, 8, 8, 9}

 *******************************************************************************/


 class MergeArraysDemo{

    public static void main(String[] args) {
        Integer arr1[] = {1, 3, 5, 7};
        Integer arr2[] = {2, 4, 6, 8};
      //  Integer arr3[] = mergeArrays(arr1, arr2);
        Integer arr4[] = mergeArrays1(arr1, arr2);
        System.out.println("Array after merging - " + Arrays.toString(arr4));
    }

    private static Integer[] mergeArrays1(Integer[] arr1, Integer[] arr2) {

        Integer arr3[] = new Integer[arr1.length+arr2.length];

        for(int i = 0, j  = 0 ; i < arr3.length ; i++ ){
            if( arr1.length-1  >= i) {
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[j];
                j++;
            }
        }

        List<Integer> list1 = Arrays.asList(arr3);

        list1.sort(Integer::compareTo);

        System.out.println(list1);
          return list1.toArray(new Integer[0]);
    }

    public static Integer[] mergeArrays(Integer[] arr1, Integer[] arr2) {

       List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        list1.addAll(Arrays.asList(arr1));
        list2.addAll(Arrays.asList(arr2));
        list1.addAll(list2);
        list1.sort(Integer::compareTo);




        return list1.toArray(new Integer[0]);
    }

}

