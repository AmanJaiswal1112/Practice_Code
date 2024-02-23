package com.prac.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseListOfInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,4,8,9,10,33,11);
        System.out.println(list);
        int len = list.size()-1;
        List<Integer> list1 = new ArrayList<>();


        for(int i = len  ; i >= 0; i--){
        list1.add(list.get(i));
         len--;
        }
        list1.forEach(System.out::print);


        List<String> gfg = new ArrayList<>(Arrays.asList("PLATFORM", "LEARNING", "Love","LET",  "BEST", "THE", "IS", "GFG"));
        revlist(gfg);
        System.out.println(gfg);
        findNameStartWithL(gfg);
    }

    private static void findNameStartWithL(List<String> gfg) {
        gfg.stream().filter(t-> t.startsWith("L")).forEach(System.out::println);
    }

    private static void revlist(List<String> gfg) {
        if(gfg.size() <= 1 || gfg == null)
            return;

        String val = gfg.remove(0);
        revlist(gfg);
        gfg.add(val);
    }
}
