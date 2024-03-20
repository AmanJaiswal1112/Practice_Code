package com.prac.array;

public class BinarySearch {
    static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return true;
            }

            // If target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14}; // Sample array
        int target = 8; // Value to search for

        boolean found = binarySearch(arr, target);

        if (found) {
            System.out.println("Value " + target + " found in the array.");
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
}
