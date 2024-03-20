package com.interview.string;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {14,16,18,23,45,98};
        int element =23;
        
        Integer index = findIndex(arr, element);
        System.out.println(index);
    }

    private static Integer findIndex(Integer[] arr, int element) {

        int left = 0, right = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;


            if (arr[mid] == element) {
                return mid;
            }

            if (arr[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}
