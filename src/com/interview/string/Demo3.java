package com.interview.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
     ////existingOrders[{customer_id=258, order_id=6},{customer_id=259, order_id=7}]
        //        //customers problem with orders: [{customer_id=258},{customer_id=350}]
        //        //[{customer_id=259, order_id=7}]
        List<Map<String, Integer>> existingCustomers = new ArrayList<Map<String, Integer>>();
        List<Map<String, Integer>> newCustomers = new ArrayList<Map<String, Integer>>();

        Map<String, Integer> hashMap = new HashMap<String, Integer>()
        {{
            put("customer_id", 258);
            put("order_id", 6);

        }};

        Map<String, Integer> hashMap4 = new HashMap<String, Integer>()
        {{
            put("customer_id", 360);
            put("order_id", 7);

        }};


        Map<String, Integer> hashMap1 = new HashMap<String, Integer>()
        {{
            put("customer_id", 259);
            put("order_id", 7);

        }};
        existingCustomers.add(hashMap);
        existingCustomers.add(hashMap1);
        existingCustomers.add(hashMap4);


        Map<String, Integer> hashMap2 = new HashMap<String, Integer>()
        {{
            put("customer_id", 258);


        }};

        newCustomers.add(hashMap2);



       List<Map<String, Integer>> list = existingCustomers
                .stream()
                .filter(
                        ob-> newCustomers.stream()
                                .noneMatch(s->s.getOrDefault("customer_id" , -1).equals(ob.get("customer_id")))
                ).collect(Collectors.toList());


        System.out.println(list);

      /*  System.out.println("existingCustomers " + existingCustomers);
        System.out.println("newCustomers " + newCustomers);*/

    }
}






























































































































































































































































































