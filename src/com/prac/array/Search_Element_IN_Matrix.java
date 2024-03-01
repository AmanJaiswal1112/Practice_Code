package com.prac.array;

import java.util.HashMap;
import java.util.Map;

public class Search_Element_IN_Matrix {
    public static void main(String[] args) {
        int n = 4; // no. of rows
        int m = 5; // no. of columns
        int[][] a = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };
        int k = 31; // element to search

        // Building the map
        Map<Integer, int[]> mp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++) {
                if (k == a[i][j]) {
                    System.out.println("Found at (" + i + "," + j + ")");
                }
                mp.put(a[i][j], new int[]{i, j});
            }
        }
        if( mp.containsKey(k))
        {
            int[] index = mp.get(k);
            System.out.println(index[0] + "------------"+index[1]);
        } else {
        System.out.println("Not Found");
    }
    }
}
