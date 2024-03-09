package com.prac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class GEtObjectBasedOnCondition {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 1),
                new Person("Bob", 2),
                new Person("Alice", 3),
                new Person("Charlie", 4),
                new Person("Alice", 5),
                new Person("Alice", 1)
        );

        Map<String, Map<Integer, List<Person>>> peopleByNameAndId
                = people
                .stream()
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.groupingBy(Person::getId)));

        peopleByNameAndId.forEach((name, idMap) -> {
            System.out.println("Group: " + name);
            idMap.forEach((id, persons) -> {
                System.out.println("\tID: " + id);
                persons.forEach(System.out::println);
            });
        });
    }
}