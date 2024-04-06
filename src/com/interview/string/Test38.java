package com.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test38 {
    public static void main(String[] args) {
        System.out.println("hello");
    /*    List<String> list = Arrays.asList("aman", "ankit", "abhi");


        list.stream()
                .filter(name->name.startsWith("a")
                && name.endsWith("n"))
                .forEach(System.out::println);
    }*/

        List<Emp11> list1 = new ArrayList<>();
        list1.add(new Emp11("aman", 20));
        list1.add(new Emp11("ankita", 30));
        list1.add(new Emp11("abc", 10));

        findMaxSalary(list1);
        //emp class print emp obj with max salary
    }

    private static void findMaxSalary(List<Emp11> list1) {
        Emp11 emp11 = list1
                .stream()
                .max(Comparator.comparingDouble(Emp11::getSal))
                .orElse(null);
        System.out.println(emp11);
    }
}

class Emp11{

    private  String name;
    private  double sal;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Emp11(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}