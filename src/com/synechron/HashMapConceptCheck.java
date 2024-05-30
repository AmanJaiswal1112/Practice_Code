package com.synechron;

import java.util.HashMap;
import java.util.Map;

public class HashMapConceptCheck {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aman",4);
        map.put("aman", 4);
        map.put("jaiswal",5);
        map.put("jaiswal",7);


        System.out.println(map+" size = "+map.size());
    }
}
