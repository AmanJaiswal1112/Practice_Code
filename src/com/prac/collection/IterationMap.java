package com.prac.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationMap {
    public static void main(String[] arg) {
        Map<String, String> gfg = new HashMap<String, String>();
        Map<StringBuffer, String> gfg1 = new HashMap<StringBuffer, String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "www.geeksforgeeks.org");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> entry: gfg.entrySet()) {
            System.out.println(entry.getKey() + " ----"+entry.getValue());
        }
        //Iterating over keys or values using keySet() and values() methods


        // Iterating using iterators over Map.Entry<K, V>
        Iterator<Map.Entry<String, String>> iterator = gfg.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entr = iterator.next();
            System.out.println(entr.getKey() +" ==="+ entr.getValue());
        }

        //Using forEach(action) method :
        gfg.forEach((s, s2) -> System.out.println(s + s2) );

        //Iterating over keys and searching for values (inefficient)


    }
}
