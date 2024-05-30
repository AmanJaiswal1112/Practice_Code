package com.synechron;

import java.util.HashMap;
import java.util.Map;

public class HigestAvgSalary_Ques2 {
    public static void main(String[] args) {
        String[][] file = {{"Charles", "20", "30", "10"},
                {"Ram", "100", "50", "10"}};

        findHighestSalary(file);
        findHighestSalaryUsingMap(file);
    }

    private static void findHighestSalaryUsingMap(String[][] file) {
        Map<String, Integer[]> map = new HashMap<>();
        double maxAverage = Double.MIN_VALUE;
        String studentName = null;
        for (String[] entry:file) {

            String name = entry[0];
            int count = entry.length -1 ;
            int sum =0;
            for(int i = 1 ; i < entry.length ; i++){
                sum += Integer.parseInt(entry[i]);
            }
            if(map.containsKey(name)){
                Integer[] averageValue  =  map.get(name);
                averageValue[0] += sum;
                averageValue[1] += count;
                map.put(name, averageValue);
            }else{
                Integer[] avg = new Integer[2];
                avg[0]= sum;
                avg[1] = count;
                map.put(name, avg);
            }
        }

        for (String[] score : file) {
            String name = score[0];
            Integer[] averageValue = map.get(name);

            double average = (double) averageValue[0] / averageValue[1];
            maxAverage = Math.max(maxAverage, average);
            studentName = name;
        }

        System.out.println("Higest Avg age = "+maxAverage);
        System.out.println("Name = "+studentName);


    }

    private static void findHighestSalary(String[][] file) {
        int highestAvg = 0;
        String studentName = null;

        for (String[] entry: file) {
            String name = entry[0];
            int count = entry.length-1;
            int sum =0;
            for(int i = 1 ; i < entry.length ; i++){
                 sum += Integer.parseInt(entry[i]);
            }

            int temp = sum/count;
            if( temp > highestAvg){
                highestAvg = temp;
                studentName = name;
            }
        }
        System.out.println("Higest Avg age = "+highestAvg);
        System.out.println("Name = "+studentName);
    }
}
