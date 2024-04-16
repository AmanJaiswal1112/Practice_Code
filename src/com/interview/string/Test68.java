package com.interview.string;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test68 {
    public static void main(String[] args) {
        System.out.println("Hello");

        List<Emp41> e1 = new ArrayList<>();
        e1.add(new Emp41(1, 20.00 , "A"));
        e1.add(new Emp41(2, 10.00, "B"));
        e1.add(new Emp41(3, 230.00, "c"));
        e1.add(new Emp41(4, 80.00,"d"));
        e1.add(new Emp41(5, 50.00, "E"));

        String name  = e1.stream()
                .sorted(Comparator.comparing(Emp41::getSalary).reversed())
                .skip(4)
                .findFirst()
                .map(e->e.getName())
                .orElse("No emp");

        System.out.println(name);

    }
}
