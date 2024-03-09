package com.interview.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Sort the list by number of occurrence of the element
        Input: {2, 5, 2, 6, 8, 5, 8, 8}
        Output: {6, 2, 2, 5, 5, 8, 8, 8}
*/
public class sort {
    public static void main(String[] args) {

        Integer[] arr = {2, 5, 2, 6, 8, 5, 8, 8};

        Map<Integer , Long > integerMap = Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));



        Map<Integer, Long> map = new LinkedHashMap<>();
        List<Long> list = new ArrayList<>();
        integerMap.forEach((k,v)->{
            list.add(v);
        });

       Collections.sort(list);
        Set<Integer> sets =integerMap.keySet();
    int i = 0;
        for(Integer integer  : sets){

            if(integerMap.get(integer) == list.get(i)){
                map.put(integer , list.get(i));
                i++;
            }else{

            }
        }

    }
}
