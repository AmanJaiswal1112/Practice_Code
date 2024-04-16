package com.interview.string;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighestSalaryUsingListAndSet {
    public static void main(String[] args) {
        List<Emp41> e1 = new ArrayList<>();
        e1.add(new Emp41(1, 20.00));
        e1.add(new Emp41(2, 10.00));
        e1.add(new Emp41(3, 230.00));
        e1.add(new Emp41(4, 80.00));
        e1.add(new Emp41(5, 50.00));

        Set<Emp41> e11 = new HashSet<>();
        e11.add(new Emp41(1, 20.00));
        e11.add(new Emp41(2, 10.00));
        e11.add(new Emp41(3, 230.00));
        e11.add(new Emp41(4, 80.00));
        e11.add(new Emp41(5, 50.00));

        Set<Emp41> emp41List1 =
                e11.stream()
                                .sorted(Comparator.comparingDouble(Emp41::getSalary).reversed()).collect(Collectors.toCollection(HashSet::new));

        System.out.println(emp41List1);


        System.out.println("---------------------------");


        List<Emp41> emp41List =
                e1.stream()
                        .sorted(Comparator.comparing(Emp41::getSalary)
                                .reversed())
                        .collect(Collectors.toList());

        System.out.println(emp41List);


    }
}
