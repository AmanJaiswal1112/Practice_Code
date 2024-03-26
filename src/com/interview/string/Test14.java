/*
package com.interview.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final abstract public class Test14 {
    public static void main(String[] args) {
        int[] num = {2,7,4,5,6,3,11,15};
        int target = 9;
       */
/*//*
/ List<int[]> index = findsum(num, target);
        for (int [] result: index) {
            System.out.println(result[0]+","+result[1]);
        }
*//*

    }































  */
/*  private static List<int[]> findsum(int[] num, int target) {
        Map<Integer , List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for(int i = 0 ; i < num.length ; i++) {
            int temp = num[i];
            int rem = target - temp;

            if (map.containsKey(rem)) {

                for (int j : map.get(rem))
                    result.add(new int[]{j, i});
            }
        }
        if(!map.containsKey(rem))
            map.put(temp , new ArrayList<>());
        }
        return result;
    }
}*//*




//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
