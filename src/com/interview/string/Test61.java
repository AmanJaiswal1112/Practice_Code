package com.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test61 {
    public static void main(String[] args) {
        System.out.println("hello");
        List<Integer> list = Arrays.asList(10,15,8,49, 25, 32);


        List<Integer> numStartWithOne = list.stream()
                .filter(num->String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(numStartWithOne);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1,"cat"));
        animalList.add(new Animal(2,"dog"));
        animalList.add(new Animal(3,"elephant"));

        covertListToMap(animalList);

    }

    private static void covertListToMap(List<Animal> animalList) {

        Map<Integer, Animal> animapMap = animalList.stream()
                .collect(Collectors.toMap(
                        Animal::getId, animal -> animal
                ));

        System.out.println(animapMap);
    }
}

class Animal{

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
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
}