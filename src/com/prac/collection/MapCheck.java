package com.prac.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCheck {
    public static void main(String[] args) {
        Map map1 = new HashMap<>();

        map1.put("a", 1);
      //  map1.putIfAbsent("a", k->get1(k));
      //  map1.putIfAbsent("b", k->get1(k));

        System.out.println(map1.get("a"));

    }

    private static Integer get1(String k) {
        return k.length();
    }
}
