package com.interview.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        Emp e1 = new Emp(1, "aman", "april");
        Emp e2 = new Emp(2, "aman1", "dec");
        Emp e3 = new Emp(3, "aman2", "april");
        Emp e4 = new Emp(4, "aman3", "may");
        Emp e5 = new Emp(5, "aman4", "may");
        list.add(e1);list.add(e2);
        list.add(e3);list.add(e4);list.add(e5);

        findMonthWiseEmpDetails(list);
    }

    private static void findMonthWiseEmpDetails(List<Emp> list) {
        Map<String, Long > map =list
                .stream()
                .collect(Collectors.groupingBy(Emp::getMonth,Collectors.counting() ));

        System.out.println(map);

    }
}


class Emp{
    private int id ;
    private String name;
    private String month;

    public Emp(int id, String name, String month) {
        this.id = id;
        this.name = name;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month='" + month + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}