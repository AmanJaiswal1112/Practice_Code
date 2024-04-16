package com.interview.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test20 {
    public static void main(String[] args) {
        List<Emp4> list = new ArrayList<>();
        list.add(new Emp4(1, 12000));
        list.add(new Emp4(2,12233));

        Map<Integer, List<Emp4>> map = list
                .stream()
                .filter(e->e.getSalary() > 1000)
                .collect(Collectors.groupingBy(Emp4::getId ))   ;

        System.out.println(map);

        String s = "1-2+3-4+5-6";
        char[] arr = s.toCharArray();

        System.out.println(arr);

        evaluateExp(arr);

    }

    private static void evaluateExp(char[] arr) {
        int result = 0;
        for (char a : arr) {

                if (a == '+'){}
              //      result += Integer.parseInt(a);
                else if (a == '-'){}
              //      result -= Integer.parseInt(a);
             else{
                result = a;
        }


            }


        }
    }


class Emp4{

    private int id;
    private double salary;

    public Emp4(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}