package com.prac.stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        findElementAppearOnce(items);

        Map<String, Long> counting =items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println(counting);

        Map<String, Integer> counting1 =items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println(counting1);

        Map<String, Item> counting2 =items.stream().collect(Collectors.groupingBy(Item::getName,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Item::getQty)), Optional::get)));

        counting2.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v.getQty()));
    }

    private static void findElementAppearOnce(List<Item> items) {
        List<String> list = new ArrayList<>();
        Map<String, Long> counting =items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

        for (Map.Entry<String, Long> map:counting.entrySet()) {
            if(map.getValue() == 1){
                list.add(map.getKey());
            }
        };
        System.out.println(list);
    }
}

class Item {

    private String name;
    private int qty;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public Item(String name, int qty, BigDecimal price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}